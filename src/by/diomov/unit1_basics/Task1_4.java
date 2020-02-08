package by.diomov.unit1_basics;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        double number;

        Scanner input = new Scanner(System.in);
        System.out.print("number = ");
        number = input.nextDouble();

        double left = Math.floor(number);
        double right = (number - left) * 1000;
        double inverted = right + left / 1000;
        System.out.printf("x= %.3f, inverted = %.3f", number, inverted);
    }
}
