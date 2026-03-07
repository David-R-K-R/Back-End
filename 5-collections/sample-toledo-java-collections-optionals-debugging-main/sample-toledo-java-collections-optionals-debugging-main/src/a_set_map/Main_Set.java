package a_set_map;

import a_set_map.classes.Bicycle;
import a_set_map.classes.Car;
import a_set_map.classes.Vehicle;

import java.util.*;

public class Main_Set {

    public static void main(String[] args) {
        Set<Vehicle> vehicles = new HashSet<>();

        vehicles.add(new Car("ABC123"));
        vehicles.add(new Bicycle());

        for (Vehicle vehicle : vehicles) {
            vehicle.travel();
        }

        // Adding the 'same' car twice has no effect in a set
        // 'Same' is determined by the equals method in car
        // Try to change it and see what happens
        vehicles.add(new Car("ABC123"));

        for (Vehicle vehicle : vehicles) {
            vehicle.travel();
        }
    }
}
