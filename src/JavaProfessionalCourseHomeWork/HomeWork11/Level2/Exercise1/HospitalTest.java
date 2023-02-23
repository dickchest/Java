package JavaProfessionalCourseHomeWork.HomeWork11.Level2.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class HospitalTest {
    public static void main(String[] args) {

        // предварительно создаем лист из пациентов
        List<Patient> patients = new ArrayList<>();

        patients.add(new Patient("Petrov"));
        patients.add(new Patient("Sidorov"));
        patients.add(new Patient("Fedorov"));
        patients.add(new Patient("Govorov"));
        patients.add(new Patient("Dugorov"));
        patients.add(new Patient("Pugovkin"));
        patients.add(new Patient("Sinitsin"));
        patients.add(new Patient("Gavrushkin"));
        patients.add(new Patient("Kuleshov"));
        patients.add(new Patient("Morozov"));
        patients.add(new Patient("Gontarev"));
        patients.add(new Patient("Gontareva"));

        // активируем госпиталь. активируется регистратура и доктор
        Hospital hospital = new Hospital();

        // отправляем пациентов в госпиталь и формируем в регистратуре очередь
        for (Patient patient : patients) {
            hospital.addPatient(patient);
        }

        hospital.showPatients();

        // начинаем визит к доктору
        hospital.doctorVisitBegin();
    }
}
