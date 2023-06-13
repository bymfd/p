package Taksi;

import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, perKm = 2.20, totalPrice, startPrice = 10.0;
        System.out.println("KM :");
        km = input.nextDouble();

        totalPrice = ((perKm * km) + startPrice);
        totalPrice = totalPrice < 20 ? 20 : totalPrice;

        System.out.println("Toplam Tutar: " + totalPrice);

    }
}
