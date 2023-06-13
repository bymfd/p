package Daire;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cap, alan, cevre, pi = 3.14;
        System.out.print("Çap: ");
        cap = input.nextDouble();

        alan = pi * cap * cap;
        cevre = 2 * pi * cap;

        System.out.println("Dairenin alanı: " + alan + "\nDairenin çevresi: " + cevre);

    }

}
