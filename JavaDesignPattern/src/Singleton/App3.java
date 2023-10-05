package Singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 싱글톤을 깨뜨릴 수 있는 방법을 막는 방법
 * 1. Reflection (enum 사용)
 * 2. 직렬화 역직렬화 사용 (readResolve() 시그니처 구현)
 */
public class App3 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        // 첫번째 방법 (Reflection 방어 --> "Cannot reflectively create enum objects")
        Settings8 instance = Settings8.INSTANCE;
        Constructor<?>[] declaredConstructors = Settings8.class.getDeclaredConstructors();
        Settings8 settings8 = null;
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            declaredConstructor.setAccessible(true);
            settings8 = (Settings8) declaredConstructor.newInstance("INSTANCE");
        }
        System.out.println(instance == settings8);

        // 두번째 방법 (직렬화와 역직렬화 방어)
        Settings7 instance2 = Settings7.getInstance();
        try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream("settgins.obj"))) {
            output.writeObject(instance2);
        }
        Settings7 instance3 = null;
        try (ObjectInput input = new ObjectInputStream(new FileInputStream("settgins.obj"))) {
            instance3 = (Settings7) input.readObject();
        }
        System.out.println(instance2 == instance3);
    }
}

/**
 * Reflection 에 대응할 수 있는 코드. (단점은 미리 만들어진다는 단점. Lazy Initialize 불가)
 * 또한 역직렬화에도 굉장히 안전하다. --> Enum 은 자동으로 Serializable 를 impl 하고있고, 안전하게 역직렬화를함 --> 동일한 인스턴스를 반환한다는 의미임.
 */
enum Settings8 {

    INSTANCE;

    Settings8() {}

    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}

/**
 * 역직렬화를 할때 내부적으로 readResolve() 라는 시그니처를 실행하는데 해당 시그니처가 있으면 역직렬화할때 원하는 값을 리턴시켜줄 수 있음.
 * 해당 시그니처는 인터페이스에서 확인할 수 없음.
 * 따라서 역직렬화를 통해 싱글톤을 꺠뜨리는 방법은 대응이 가능함.
 */
class Settings7 implements Serializable {

    private Settings7() {}

    public static Settings7 getInstance() {
        return Settings5Holder.INSTANCE;
    }

    private static class Settings5Holder {
        private static final Settings7 INSTANCE = new Settings7();
    }

    /**
     * 해당 시그니처를 의미
     * @return
     */
    protected Object readResolve() {
        return getInstance();
    }

}