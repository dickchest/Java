package JavaProfessionalCourseHomeWork.HomeWork11.Level2.Exercise1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Registratura {
    Deque<Patient> patients;

    public Registratura() {
        patients = new ArrayDeque<>();
    }

    public Deque<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Patient patient) {
        if (this.patients.size() < 10) {
            this.patients.add(patient);
        } else {
            System.out.println("Мест нет!");
        }
    }


    public void clearPatients() {
        this.patients.clear();
    }
}
