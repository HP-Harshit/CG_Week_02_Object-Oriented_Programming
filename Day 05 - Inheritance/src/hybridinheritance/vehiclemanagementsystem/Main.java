package hybridinheritance.vehiclemanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Creating instances of ElectricVehicle and PetrolVehicle
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3", 75);
        PetrolVehicle pv = new PetrolVehicle(220, "Toyota Corolla", 50);

        // Displaying vehicle details and performing specific actions
        ev.displayVehicleDetails();
        ev.charge();
        System.out.println();

        pv.displayVehicleDetails();
        pv.refuel();
    }
}
