package by.diomov.unit1_basics;

import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        double firstAngleGrad;
        double secondAngleGrad;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the degrees of the first corner =  ");
        firstAngleGrad = input.nextDouble();
        System.out.print("Enter the degrees of the second corner =  ");
        secondAngleGrad = input.nextDouble();

        double sumAngles = firstAngleGrad + secondAngleGrad;

        if ((sumAngles) < 180) {
            System.out.println("Triangle exist");
            if ((sumAngles) == 90) {
                System.out.println("Triange   is right");
            }
        } else {
            System.out.println("Triangle does not exist");
        }
    }
}
