import java.util.ArrayList;
import java.util.List;

// Class Patient
class Patient {
    // Class Atrributes
    private String patientName;
    private String patientId;
    private List<Doctor> doctors;

    // Constructor
    public Patient(String patientName, String patientId) {
        this.patientName = patientName;
        this.patientId = patientId;
        this.doctors = new ArrayList<>();
    }

    // Getter for patient name
    public String getPatientName() {
        return patientName;
    }

    // Getter for Patient Id
    public String getPatientId() {
        return patientId;
    }

    // Method to add Doctor
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Method to display Doctors
    public void showDoctors() {
        System.out.println("\nDoctors consulting " + patientName + ":");
        for (Doctor doctor : doctors) {
            doctor.printDetails();
        }
    }
}

// Class Doctor
class Doctor {
    // Class Attributes
    private String DoctorName;
    private String doctorId;
    private List<Patient> patients;

    // Constructor
    public Doctor(String DoctorName, String doctorId) {
        this.DoctorName = DoctorName;
        this.doctorId = doctorId;
        this.patients = new ArrayList<>();
    }

    // Getter for Doctor name
    public String getDoctorName() {
        return DoctorName;
    }

    // Getter for Doctor id
    public String getDoctorId() {
        return doctorId;
    }

    // Method to add Patient
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println(DoctorName + " is consulting with " + patient.getPatientName());
    }

    // Method to show patient
    public void showPatients() {
        System.out.println("\nPatients under " + DoctorName + ":");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getPatientName());
        }
    }

    // Method to print detail
    public void printDetails() {
        System.out.println("Doctor Name: " + DoctorName);
    }
}

// Class Hospital
class Hospital {
    // Class Attributes
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    // Constructor
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Method to add Doctor
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Method too add Patient
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Method to show doctors
    public void showDoctors() {
        System.out.println("\nDoctors at " + name + ":");
        for (Doctor doctor : doctors) {
            doctor.printDetails();
        }
    }

    // Method to show patient
    public void showPatients() {
        System.out.println("\nPatients at " + name + ":");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getPatientName());
        }
    }
}

// Class Main
public class HospitalDoctorPatient {
    public static void main(String[] args) {
        // Object of class Hospital
        Hospital cityHospital = new Hospital("City Hospital");

        // Object of class Doctor
        Doctor drSmith = new Doctor("Dr. Smith", "D001");
        Doctor drJones = new Doctor("Dr. Jones", "D002");

        // Object of class Patient
        Patient alice = new Patient("Alice", "P001");
        Patient bob = new Patient("Bob", "P002");

        // Add doctors and patients to the hospital
        cityHospital.addDoctor(drSmith);
        cityHospital.addDoctor(drJones);
        cityHospital.addPatient(alice);
        cityHospital.addPatient(bob);

        // Doctor consultations
        drSmith.consult(alice); // Dr. Smith consults with Alice
        drSmith.consult(bob); // Dr. Smith consults with Bob
        drJones.consult(alice); // Dr. Jones consults with Alice

        // Show all doctors and patients at the hospital
        cityHospital.showDoctors();
        cityHospital.showPatients();

        // Show doctors consulting each patient
        alice.showDoctors();
        bob.showDoctors();

        // Show patients under each doctor
        drSmith.showPatients();
        drJones.showPatients();
    }
}
