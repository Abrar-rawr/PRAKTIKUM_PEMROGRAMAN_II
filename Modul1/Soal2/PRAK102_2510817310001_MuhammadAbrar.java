package Soal2;

import java.util.Scanner;

public class PRAK102_2510817310001_MuhammadAbrar {

    static final int JUMLAH_BARIS = 10;
    static final int KELIPATAN    = 5;
    static final int PENGURANGAN  = 1;
    static final int LANGKAH      = 1;
    static final String PEMISAH      = ", ";

    static int bacaInt(Scanner sc, String pesan) {
        while (true) {
            System.out.print(pesan);
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                sc.nextLine();
                return n;
            }
            System.out.println("Input harus berupa bilangan bulat!");
            sc.nextLine();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = bacaInt(sc, "Masukan angka awal: ");

        int baris = 0;
        while (baris < JUMLAH_BARIS) {
            int tampil = (angka % KELIPATAN == 0) ? (angka / KELIPATAN - PENGURANGAN) : angka;
            System.out.print(tampil);
            if (baris < JUMLAH_BARIS - 1) System.out.print(PEMISAH);
            angka += LANGKAH;
            baris++;
        }
        System.out.println();
    }
}