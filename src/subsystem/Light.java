package subsystem;

public class Light implements HomeService{
    @Override
    public void turnOn() {
        System.out.println("Light is on!");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is off!");
    }
}
