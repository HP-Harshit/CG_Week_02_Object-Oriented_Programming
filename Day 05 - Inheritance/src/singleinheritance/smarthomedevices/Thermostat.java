package singleinheritance.smarthomedevices;

public class Thermostat extends Device{
    // Class Attribute
    double temperatureSetting;

    // Defining Constructor
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        // Calling the superclass constructor
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding the displayStatus method
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "C");
    }
}
