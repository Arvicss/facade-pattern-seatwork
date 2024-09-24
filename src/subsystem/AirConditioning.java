package subsystem;

public class AirConditioning  implements HomeService{
    @Override
    public void turnOn() {
        System.out.println("AirConditioning is on!");
    }

    @Override
    public void turnOff() {
        System.out.println("AirConditioning is off!");
    }
}
