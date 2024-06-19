//Write Java program to ask student to enter the marks of the five units they did last semester, compute the average and display it on the screen. (Average should be given in two decimal places).

import java.util.Scanner;

public class StudentMarksAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] marks = new double[5];
        double total = 0.0;
//request the user to enter input
        System.out.println("Enter the marks for the five units:");

        for (int x = 0; x < 5; x++) {
            System.out.print("Mark for unit " + (x + 1) + ": ");
            marks[x] = scanner.nextDouble();
            total += marks[x];
        }

        double average = total / 5;
//request the user to enter input
        System.out.printf("The average mark is: %.2f%n", average);

        scanner.close();
    }
}
