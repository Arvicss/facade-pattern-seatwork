import facade.HomeInterface;
import subsystem.*;

import java.util.Scanner;

public class HomeApp {
    public static void main(String[] args) {
        Tv tv = new Tv();
        Light light = new Light();
        AirConditioning airConditioning = new AirConditioning();

        HomeInterface homeInterface = new HomeInterface(tv, light, airConditioning);

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nSelect a function");
            System.out.println("[1] Turn on all device!");
            System.out.println("[2] Turn off all device!");
            System.out.println("[3] Exit");
            System.out.print("Selected Option: ");

            int option = scanner.nextInt();
            System.out.println();

            switch(option) {
                case 1:
                    homeInterface.turnOnAll();
                    break;
                case 2:
                    homeInterface.turnOffAll();
                    break;
                case 3:
                    System.exit(0);
            }
        } while (true);
    }
}