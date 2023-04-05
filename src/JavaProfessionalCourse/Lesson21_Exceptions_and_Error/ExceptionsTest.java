package JavaProfessionalCourse.Lesson21_Exceptions_and_Error;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExceptionsTest {
    public static void main(String[] args) {

        String s = "Test"; // strong reference
        WeakReference<String> weakReference = new WeakReference<>("test");
        SoftReference<String> softReference = new SoftReference<>("test");

        prepareFood();
        List<Integer> integers = new ArrayList<>(100);
        while (true) {
            integers.add(new Random().nextInt());
            if (integers.size() == 10_000_000) {
                integers.clear();
            }
        }

    }

    public static void prepareFood() {
//        int i = 10/0;
        List<String> recepie = getRecepie();
        List<String> ingridients;
        try {
            ingridients = buyIngredients(recepie);
        } catch (NoRecepieException e) {
            throw e;
        } catch (RuntimeException e) {
//            e.printStackTrace();
//            System.exit(0);
//            Runtime.getRuntime().exit(0);
            System.out.println("Ингридиентов в магазине нет, пойду спрошу у соседа");
            ingridients = getFromNeighbor(recepie);
        } finally {
            System.out.println("продукты попытались достать");
        }

        try {
            makeFood(ingridients);
        } catch (NoIngridientsExeption e) {
            throw new RuntimeException("какая-то ошибка", e);
        }

    }

    private static List<String> getFromNeighbor(List<String> recepie) {
//        if (recepie.isEmpty()) {
//            NoRecepieException ex = new NoRecepieException();
//        }
        return recepie == null && recepie.isEmpty() ? null : List.of("");
    }

    private static void makeFood(List<String> ingridients) throws NoIngridientsExeption {
        if (ingridients == null) {
            throw new NoIngridientsExeption("ингридиентов нет, не могу готовить");
        }
        // prepare food
    }

    private static List<String> buyIngredients(List<String> recepie) {
        if (recepie == null) {
            NoRecepieException ex = new NoRecepieException();
//            ex.printStackTrace();
//            throw new NoRecepieException();
            throw ex;
        }
        if (recepie.size() == 0) {
            throw new RuntimeException("нет товара в магазине");
        }
        return null;
    }

    private static List<String> getRecepie() {
        return List.of();
    }
}
