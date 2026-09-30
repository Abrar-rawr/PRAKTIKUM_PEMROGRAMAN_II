package Soal3;

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class PRAK103_2510817310001_MuhammadAbrar {

    static final int N_MIN      = 1;
    static final int PEMBAGI    = 2;
    static final int LANGKAH    = 1;
    static final String PEMISAH = ", ";

    static int bacaInt(Scanner sc, int min, int max) {
        while (true) {
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                if (n >= min && n <= max) return n;
                System.out.print("Harus antara " + min + " dan " + max + ", ulangi: ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan N dan bilangan awal: ");
        int n = bacaInt(sc, N_MIN, Integer.MAX_VALUE);
        int angka = bacaInt(sc, Integer.MIN_VALUE, Integer.MAX_VALUE);

        int tercetak = 0;
        do {
            if (angka % PEMBAGI != 0) {
                if (tercetak > 0) System.out.print(PEMISAH);
                System.out.print(angka);
                tercetak++;
            }
            angka += LANGKAH;
        } while (tercetak < n);
        System.out.println();
    }
}