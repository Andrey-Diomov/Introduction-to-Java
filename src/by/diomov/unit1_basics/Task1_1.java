package by.diomov.unit1_basics;
import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        double a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("a= ");
        a = input.nextDouble();
        System.out.print("b= ");
        b = input.nextDouble();
        System.out.print("c= ");
        c = input.nextDouble();

        double z = ((a - 3.0) * b / 2.0 + c);

        System.out.println("z= ((" + a + "-3)*" + b + "/2)+" + c + "=" + z);
    }
}
