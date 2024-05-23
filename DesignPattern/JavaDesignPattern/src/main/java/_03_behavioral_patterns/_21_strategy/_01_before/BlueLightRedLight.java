package _03_behavioral_patterns._21_strategy._01_before;

public class BlueLightRedLight {

    private int speed;

    public BlueLightRedLight(int speed) {
        this.speed = speed;
    }

    /**
     * 파라미터 값에 따라, 분기를 하며 서로 다른 행위를 하는 코드가 있을때는 전략 패턴으로 정리해야한다. --> 새로운 종류의 전략을 추가하더라도 기존 코드를 건드리지 않을 수 있음.
     */
    public void blueLight() {
        if (speed == 1) {
            System.out.println("무 궁 화    꽃   이");
        } else if (speed == 2) {
            System.out.println("무궁화꽃이");
        } else {
            System.out.println("무광꼬치");
        }
    }

    /**
     * 파라미터 값에 따라, 분기를 하며 서로 다른 행위를 하는 코드가 있을때는 전략 패턴으로 정리해야한다. --> 새로운 종류의 전략을 추가하더라도 기존 코드를 건드리지 않을 수 있음.
     */
    public void redLight() {
        if (speed == 1) {
            System.out.println("피 었 습 니  다.");
        } else if (speed == 2) {
            System.out.println("피었습니다.");
        } else {
            System.out.println("피어씀다");
        }
    }
}
