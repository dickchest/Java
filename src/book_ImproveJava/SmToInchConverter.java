package book_ImproveJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmToInchConverter {
    public static void main(String[] args) throws IOException {
        double value;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the value: ");
        value = Double.parseDouble(input.readLine());

        System.out.println();
        System.out.println(value + "cm = " + value * 0.3937 + "inches");
    }
}
