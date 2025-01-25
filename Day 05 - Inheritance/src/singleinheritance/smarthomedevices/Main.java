package singleinheritance.smarthomedevices;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Thermostat
        Thermostat thermostat = new Thermostat("T123", "Online", 22.5);

        // Calling the displayStatus method on the instance
        thermostat.displayStatus();
    }
}
