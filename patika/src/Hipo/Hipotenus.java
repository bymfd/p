package Hipo;

import java.util.Scanner;

public class Hipotenus {

    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("A : ");
        a = input.nextDouble();

        System.out.print("B : ");
        b = input.nextDouble();

        c = Math.sqrt((a * a) + (b * b));

        System.out.println("Hipotenus: " + c);

    }

}
