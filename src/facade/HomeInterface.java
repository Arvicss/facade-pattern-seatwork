package facade;

import subsystem.AirConditioning;
import subsystem.Light;
import subsystem.Tv;

public class HomeInterface {
    private Tv tv;
    private Light light;
    private AirConditioning airConditioning;

    public HomeInterface(Tv tv, Light light, AirConditioning airConditioning) {
        this.tv = tv;
        this.light = light;
        this.airConditioning = airConditioning;
    }

    public HomeInterface() {
    }

    public void turnOnAll() {
        tv.turnOn();
        light.turnOn();
        airConditioning.turnOn();
    }
    public void turnOffAll() {
        tv.turnOff();
        light.turnOff();
        airConditioning.turnOff();
    }

    public Tv getTv() {
        return tv;
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public AirConditioning getAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }

}
