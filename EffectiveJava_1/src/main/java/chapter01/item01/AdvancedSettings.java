package chapter01.item01;


/**
 * 정적 팩토리 메서드 단점 1 --> 만약에 싱글톤 패턴처럼 기본 생성자를 private 으로 만드는 경우에는 상속을 받을 수 없다.
 *                       --> 해결방법으로는 위임. 즉, Delegate 하는 방법으로 우회할 수 있다.
 *                       --> 하지만 기본 생성자를 private 으로 만들지 않고, new 키워드를 허용하면 해당되지 않는 얘기이다.
 */
//public class AdvancedSettings extends Settings {
//
//}

public class AdvancedSettings {

    private Settings settings;

    public AdvancedSettings(Settings settings) {
        this.settings = settings;
    }

}
