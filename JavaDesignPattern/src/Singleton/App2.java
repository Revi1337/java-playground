package Singleton;


import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 싱글톤을 깨뜨릴 수 있는 방법
 * 1. Reflection
 * 2. 직렬화와 역직렬화를 사용. (역직렬화할때 무조건 생성자를 호출하는 것을 이용하는 방법임.) --> 하지만 이방법은 방어할 수 있음.
 */
public class App2 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        // 첫번째 방법 (Reflection)
        Settings5 instance = Settings5.getInstance();
        Constructor<Settings5> declaredConstructor = Settings5.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Settings5 instance1 = declaredConstructor.newInstance();

        System.out.println(instance == instance1);

        // 두번째 방법 (직렬화와 역직렬화 사용)
        Settings6 instance2 = Settings6.getInstance();
        try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream("settgins.obj"))) {
             output.writeObject(instance2);
        }
        Settings6 instance3 = null;
        try (ObjectInput input = new ObjectInputStream(new FileInputStream("settgins.obj"))) {
            instance3 = (Settings6) input.readObject();
        }
        System.out.println(instance2 == instance3);
    }
}

/**
 * 역직렬화를 할때 내부적으로 readResolve() 라는 시그니처를 실행하는데 해당 시그니처가 있으면 역직렬화할때 원하는 값을 리턴시켜줄 수 있음.
 * 해당 시그니처는 인터페이스에서 확인할 수 없음.
 * 따라서 역직렬화를 통해 싱글톤을 꺠뜨리는 방법은 대응이 가능함.
 */
class Settings6 implements Serializable {

    private Settings6() {}

    public static Settings6 getInstance() {
        return Settings6Holder.INSTANCE;
    }

    private static class Settings6Holder {
        private static final Settings6 INSTANCE = new Settings6();
    }

}
