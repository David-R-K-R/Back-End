package exercise6;

import java.util.Random;

public class TemperatureSensor implements Sensor{

    public boolean isOn;

    public TemperatureSensor(){
        isOn = false;

    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public int read() throws IllegalStateException{
        if (!this.isOn){
            throw new IllegalStateException();
        }
        return new Random().nextInt(61)-30;
    }

    @Override
    public void setOn() {
        this.isOn=true;
    }

    @Override
    public void setOff() {
        this.isOn=false;
    }

}
