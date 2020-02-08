package by.diomov.unit1_basics;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        double x, y;

        Scanner in = new Scanner(System.in);
        System.out.print("x= ");
        x = in.nextDouble();
        System.out.print("y= ");
        y = in.nextDouble();

        double result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println("result= " + result);
    }
}
