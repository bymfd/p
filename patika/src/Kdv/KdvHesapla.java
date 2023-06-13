package Kdv;

import java.util.Scanner;

public class KdvHesapla {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, kdvOrani, KdvTutari, KdvliTutar;

        System.out.print("tutar Giriniz: ");
        tutar = input.nextDouble();
        // kdv oranı belirle 0-1000 : 18; 1000 > 8
        kdvOrani = (tutar <= 1000.0) ? 0.18 : 0.8;

        KdvTutari = tutar * kdvOrani;
        KdvliTutar = tutar + KdvTutari;

        System.out.println("Tutar: " + tutar);
        System.out.println("KDV oranı: " + kdvOrani * 100);
        System.out.println("KDV'li tutar: " + KdvliTutar);
    }
}
