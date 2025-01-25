package practiceproblem.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class InPatient extends Patient implements MedicalRecord {
    private List<String> medicalRecords;
    private double dailyRate;
    private int daysAdmitted;

    public InPatient(String patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
        this.medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
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

