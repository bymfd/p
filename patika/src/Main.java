// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
    double mat,fizik,kimya,turkce,tarih,muzik;

        System.out.print("Mat notu:");
        mat = input.nextDouble();

        System.out.print("Kimya notu:");
        kimya = input.nextDouble();

        System.out.print("Fizik notu:");
        fizik = input.nextDouble();

        System.out.print("turkce notu:");
        turkce = input.nextDouble();

        System.out.print("tarih notu:");
        tarih = input.nextDouble();

        System.out.print("Muzik notu:");
        muzik = input.nextDouble();

        double toplam= (muzik+tarih+turkce+kimya+fizik+mat);
        double ortlama = toplam/6.0;
        String sonuc = (ortlama>=60.0) ? "Geçti" : "Kaldı" ;

        System.out.print("Ortalamınız: "+ ortlama+ "\n geçme durumu: "+sonuc);
    }
}