package Soal5;

import java.util.Locale;
import java.util.Scanner;

public class PRAK105_2510817310001_MuhammadAbrar {
    static final double PHI = 3.14;
    static final double MIN = 0.1, MAX = 10000;

    static double baca(Scanner sc, String pesan) {
        while (true) {
            System.out.print(pesan);
            boolean angka = sc.hasNextDouble();
            double n = angka ? sc.nextDouble() : 0;
            sc.nextLine();
            if (angka && n >= MIN && n <= MAX) return n;
            System.out.println("Input harus angka antara " + MIN + " dan " + MAX + "!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double r = baca(sc, "Masukkan jari-jari: ");
        double t = baca(sc, "Masukkan tinggi: ");
        System.out.printf(Locale.US, "Volume tabung dengan jari-jari %s cm dan tinggi %s cm adalah %.3f m3%n",
                r, t, PHI * r * r * t);
    }
}