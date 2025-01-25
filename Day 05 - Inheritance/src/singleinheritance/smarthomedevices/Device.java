package singleinheritance.smarthomedevices;

public class Device {
    // Class Attributes
    public String deviceId;
    public String status;

    // Defining Constructor
    public Device(String deviceId, String status) {
        // Initializing the attributes
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}
