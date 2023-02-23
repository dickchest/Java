package JavaProfessionalCourseHomeWork.HomeWork11.Level2.Exercise1;

import java.util.Deque;

public class Hospital {
    private Registratura registratura;
    private Doctor doctor;

//    private Patient patient;

    public Hospital() {
        this.doctor = new Doctor();
        this.registratura = new Registratura();
    }

    public void addPatient(Patient patient) {
        registratura.setPatients(patient);
    }

    public void doctorVisitBegin() {
        Deque<Patient> patients = registratura.getPatients();
        if (patients.size() == 0) {
            System.out.println("Для приема у врача нет поциентов");
            return;
        }
        doctor.doctorVisit(patients);
        registratura.clearPatients();
    }

    public void showPatients() {
        System.out.println(registratura.getPatients());
        System.out.println(registratura.getPatients().size());
    }
}
