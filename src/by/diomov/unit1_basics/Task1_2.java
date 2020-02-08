package by.diomov.unit1_basics;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        double a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("a= ");
        a = input.nextDouble();
        System.out.print("b= ");
        b = input.nextDouble();
        System.out.print("c= ");
        c = input.nextDouble();

        double result = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.printf("result= %.5f ", result);
        System.out.println();
    }
}

