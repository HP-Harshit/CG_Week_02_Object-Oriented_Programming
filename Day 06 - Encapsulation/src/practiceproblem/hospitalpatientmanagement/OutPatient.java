package practiceproblem.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class OutPatient extends Patient implements MedicalRecord {
    private List<String> medicalRecords;
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public String viewRecords() {
        return String.join(", ", medicalRecords);
    }

    @Override
    public void getPatientDetails() {
        super.getPatientDetails();
        System.out.println("Bill: $" + calculateBill());
        System.out.println("Medical Records: " + viewRecords());
    }
}

