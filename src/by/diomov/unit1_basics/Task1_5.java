package by.diomov.unit1_basics;

import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        int timeInSeconds;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        timeInSeconds = input.nextInt();

        int hours = timeInSeconds / 3600;
        int minutes = (timeInSeconds / 60) % 60;
        int seconds = timeInSeconds - hours * 3600 - minutes * 60;

        System.out.printf("%02dч %02dмин %02dс\n", hours, minutes, seconds);
    }
}
