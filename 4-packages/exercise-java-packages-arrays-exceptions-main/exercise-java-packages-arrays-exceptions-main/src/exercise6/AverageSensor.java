package exercise6;

// this works but is horribly coded, dont copy this
// waarom heb ik hier een hashmap gebruikt ipv een list, geen flauw fucking idee

import java.util.ArrayList;
import java.util.HashMap;

public class AverageSensor implements Sensor{

    private final HashMap<Sensor, Integer> sensorReadings = new HashMap<>();

    public void addSensor(Sensor toAdd){
        this.sensorReadings.put(toAdd, null);
    }

    @Override
    public boolean isOn() {
        if (this.sensorReadings.isEmpty()) {
            return false;
        }

        for (Sensor sensor : this.sensorReadings.keySet()) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : this.sensorReadings.keySet()) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : this.sensorReadings.keySet()) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (this.sensorReadings.isEmpty() || !this.isOn()) {
            throw new IllegalStateException();
        }

        int total = 0;
        for (Sensor sensor : this.sensorReadings.keySet()) {
            total += sensor.read();
        }

        return (int)Math.floor((float) total /this.sensorReadings.size());


    }
}
