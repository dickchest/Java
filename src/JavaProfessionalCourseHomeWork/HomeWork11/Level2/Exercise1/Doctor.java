package JavaProfessionalCourseHomeWork.HomeWork11.Level2.Exercise1;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Random;

public class Doctor {
    private String name;
    List<String> treatment;

    public Doctor() {
        treatment = new ArrayList<>(10);
        treatment.add("принять аспирин");
        treatment.add("пить больше жидкости");
        treatment.add("пить чай с малиной");
        treatment.add("помазать чистотелом");
        treatment.add("помазать зеленкой");
        treatment.add("по-больше гулять");
        treatment.add("поставить горчичники");
        treatment.add("заниматься спортом");
        treatment.add("лежать в постели");
        treatment.add("медицина здесь безсильна");
    }

    public void doctorVisit (Deque<Patient> patients) {
        Random random = new Random();
        while (!patients.isEmpty()) {
            System.out.println("Для пациента " + patients.pop().getName() + " применяем лечение: " + treatment.get(random.nextInt(10)));
        }

    }
}
