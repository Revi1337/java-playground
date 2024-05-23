package _03_behavioral_patterns._14_command._01_before;

public class Light {

    private boolean isOn;

    public void on() {
        System.out.println("Light On");
        this.isOn = true;
    }

    public void off() {
        System.out.println("Light Off");
        this.isOn = false;
    }
}
