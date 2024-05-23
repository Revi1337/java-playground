package _03_behavioral_patterns._21_strategy._02_after;


public class Client {

    public static void main(String[] args) {
//        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(new Fastest());
//        blueLightRedLight.redLight();
//        blueLightRedLight.blueLight();

        BlueLightRedLight blueLightRedLight = new BlueLightRedLight();
        blueLightRedLight.redLight(new Fastest());
        blueLightRedLight.blueLight(new Normal());

    }
}
