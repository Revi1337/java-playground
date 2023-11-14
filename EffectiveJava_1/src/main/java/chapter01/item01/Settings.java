package chapter01.item01;

public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    private Settings() {}

    private static final Settings SETTINGS = new Settings();

    /**
     * 정적 팩토리 메서드 장점 2 --> 인스턴스의 생성을 팩토리 안에서 통제할 수 있다. (해당 예에서는 Sigleton 을 예로 들 수 있음.)
     * @return
     */
    public static Settings newInstance() {
        return SETTINGS;
    }

}
