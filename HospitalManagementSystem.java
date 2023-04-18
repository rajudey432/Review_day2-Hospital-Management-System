package ReviewDay2;

import java.util.Scanner;

public class HospitalManagementSystem {

    public HospitalManagementSystem(String hospitalA, String mukherjeeNurshingHome) {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        HospitalManagementSystem[] hospitalManagementSystems = new HospitalManagementSystem[3];
        hospitalManagementSystems[0] = new HospitalManagementSystem("Hospital A", "Mukherjee Nurshing Home");
        hospitalManagementSystems[1] = new HospitalManagementSystem("Hospital B", "Mukta Nurshing Home");
        hospitalManagementSystems[2] = new HospitalManagementSystem("Hospital C", "Kanoka Nurshing Home");

        System.out.println("Enter patient details: ");
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Age");
        int age = scanner.nextInt();
        System.out.println("Phone number");
        String phonenumber = scanner.nextLine();
        System.out.println("City");
        String city = scanner.nextLine();
        System.out.println("State");
        String state = scanner.nextLine();
        System.out.println("Department");
        String department = scanner.nextLine();

        String departmentStr;
        Department department = Department.valueOf(departmentStr.toUpperCase());
        
        Patient patient = new Patient(name, age, phonenumber,city, state, department);
        int randomIndex = (int) (Math.random()* hospitalManagementSystems.length);
        
        HospitalManagementSystem hospitalManagementSystem = hospitalManagementSystems[randomIndex];
        hospitalManagementSystem.addPatient(patient);

        for (HospitalManagementSystem h : hospitalManagementSystems) {
            System.out.println(h);
        }

        scanner.close();

    }
}

class Hospital {
    private String name;
    private String address;
    private String city;
    private String state;
    private Patient[] patients;
    private final int MAX_CAPACITY = 100;

    public Hospital (String name, String address, String city, String state) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.patients = new Patient[Department.values().length][MAX_CAPACITY];
        this.patientsCounts = new int[Department.values().length];
    }
        public void addPatient(Patient patient) {
        int departmentIndex = patient.getDepartment();

        if (patientCounts[departmentIndex]<MAX_CAPACITY) {
            Patients[departmentIndex][patient[departmentIndex]] = patient;
            patient[departmentIndex]++;
        } else {
            System.out.println("Patient list for " + patient.getDepartment() + "is full");
        }
        }

        public String toString () {
        String hospitalInfo = "Hospital Name: " +  name + \name
        }

}

