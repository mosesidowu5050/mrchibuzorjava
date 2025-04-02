package TDDSnacks;

public class AutomaticBike {
    private boolean turnedOn;
    private int currentSpeed;
    private int currentGear;


    public AutomaticBike(boolean isOn) {
        this.turnedOn = isOn;
        this.currentSpeed = 0;
        this.currentGear = 1;
    }
    public String turnOnBike() {
        if(!turnedOn){
            turnedOn = true;
        }
        return "Bike is on";
    }

    public String turnOffBike() {
        if (turnedOn) {
            turnedOn = false;
        }
        return "Bike is off";
    }

    public void changeGear(int gear) {
        if(gear < 1 || gear > 4){
            throw new IllegalArgumentException("Gear must be between 1 and 4");
        }
        currentGear = gear;
    }

    public void accelerate() {
        if(currentGear == 1) currentSpeed += 1;
        else if(currentGear == 2) currentSpeed += 2;
        else if(currentGear == 3) currentSpeed += 3;
        else currentSpeed += 4;

        updateGear();
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void decelerate() {
        if(currentGear == 1) currentSpeed -= 1;
        else if(currentGear == 2) currentSpeed -= 2;
        else if(currentGear == 3) currentSpeed -= 3;
        else currentSpeed -= 4;

        if (currentSpeed < 0){
            currentSpeed = 0;
            throw new IllegalArgumentException("Speed is below 0");
        }
        updateGear();
    }

    public void updateGear() {
        if(currentSpeed >= 0 && currentSpeed <= 20) currentGear = 1;
        else if(currentSpeed >= 21 && currentSpeed <= 30) currentGear = 2;
        else if (currentSpeed >= 31 && currentSpeed <= 40) currentGear = 3;
        else if (currentSpeed >= 41) currentGear = 4;
        }

    public int getCurrentGear() {
        return currentGear;
    }
}


