package exercise6;

public class StandardSensor implements Sensor{

    protected int i;

    public StandardSensor(int i){
        this.i = i;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public int read() {
        return i;
    }

    @Override
    public void setOn() {
    }

    @Override
    public void setOff() {
    }
}

