package by.diomov.unit1_basics;

import java.util.Scanner;

public class Task1_6 {
    public static void main(String[] args) {
        int x, y;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter x = ");
        x = in.nextInt();
        System.out.print("Enter y = ");
        y = in.nextInt();

        boolean result = (y >= -3 && y <= 4 && x >= -2 && x <= 2) || (y <= 0 && y >= -3 && x >= -4 && x <= 4);
        System.out.println(result);
    }
}
