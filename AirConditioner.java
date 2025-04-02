package TDDSnacks;

public class AirConditioner {
    private boolean switchOn;
    private int temperature;

    public AirConditioner(boolean switchButton) {
        this.switchOn = switchButton;
        this.temperature = 16;
    }

    public String switchOnAirConditioner() {
        if (!switchOn) {
            switchOn = true;
        }
            return "It is on";
    }

    public String switchOffAirConditioner() {
        if (switchOn) {
            switchOn = false;
        }
        return "It is off";
    }

    public String increaseTemperature(int increase) {
        if (temperature + increase > 30) {
            return "Temperature is still 30";
        } else {
            temperature += increase;
            return "Temperature is increased to " + temperature;
        }
    }

    public String decreaseTemperature(int decrease) {
        if (temperature - decrease < 16) {
            return "Temperature is still 16";
        } else {
            temperature -= decrease;
            return "Temperature is decreased to " + temperature;
        }
    }

    public int getCurrentTemperature() {
        return temperature;
    }
}

