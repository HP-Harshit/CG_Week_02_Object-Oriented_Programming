package practiceproblem.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient john = new InPatient("P001", "John Doe", 45, 500.0, 5);
        OutPatient alice = new OutPatient("P002", "Jane Smith", 30, 150.0);

        john.addRecord("Initial diagnosis: Flu");
        john.addRecord("Treatment: Antiviral medication");
        alice.addRecord("Initial diagnosis: Allergy");
        alice.addRecord("Treatment: Antihistamines");

        // Adding patients to the list
        patients.add(john);
        patients.add(alice);

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println();
        }
    }
}

