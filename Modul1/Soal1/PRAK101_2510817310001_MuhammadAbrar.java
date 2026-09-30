package Soal1;

import java.util.Locale;
import java.util.Scanner;

public class PRAK101_2510817310001_MuhammadAbrar {
    static final int TAHUN_MAX = 2026;   // batas tahun (ubah di sini)
    static final String[] BULAN = {"Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);   // desimal pakai titik
    static int bacaInt(String pesan, int min, int max) {   // validasi ketat: cek tipe dulu, baru rentang
        while (true) {
            System.out.print(pesan);
            boolean ok = sc.hasNextInt(); int n = ok ? sc.nextInt() : 0; sc.nextLine();
            if (ok && n >= min && n <= max) return n;
            System.out.println("Harus bilangan bulat " + min + "-" + max + "!");
        }
    }
    static double bacaDouble(String pesan) {
        while (true) {
            System.out.print(pesan);
            boolean ok = sc.hasNextDouble(); double n = ok ? sc.nextDouble() : 0; sc.nextLine();
            if (ok && n > 0) return n;
            System.out.println("Harus angka lebih dari 0 (contoh: 54.89)!");
        }
    }
    static String bacaTeks(String pesan) {
        String s;
        do { System.out.print(pesan); s = sc.nextLine().trim(); } while (s.isEmpty());
        return s;
    }
    static int maxHari(int bulan, int tahun) {   // switch: hari per bulan + leap year
        switch (bulan) {
            case 2: return ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0) ? 29 : 28;
            case 4: case 6: case 9: case 11: return 30;
            default: return 31;
        }
    }
    public static void main(String[] args) {
        String nama = bacaTeks("Masukkan Nama Lengkap: ");
        String tempat = bacaTeks("Masukkan Tempat Lahir: ");
        int tanggal = bacaInt("Masukkan Tanggal Lahir: ", 1, 31);
        int bulan = bacaInt("Masukkan Bulan Lahir: ", 1, 12);
        int tahun = bacaInt("Masukkan Tahun Lahir: ", 1, TAHUN_MAX);
        int max = maxHari(bulan, tahun);
        if (tanggal > max) {   // validasi kombinasi tanggal-bulan-tahun
            System.out.println(BULAN[bulan - 1] + " " + tahun + " hanya punya " + max + " hari!");
            tanggal = bacaInt("Masukkan ulang Tanggal Lahir (1-" + max + "): ", 1, max);
        }
        int tinggi = bacaInt("Masukkan Tinggi Badan: ", 1, 300);
        double berat = bacaDouble("Masukkan Berat Badan: ");
        System.out.printf(Locale.US, "Nama Lengkap %s, Lahir di %s pada Tanggal %d %s %d%nTinggi Badan %d cm dan Berat Badan %.2f kilogram%n",
                nama, tempat, tanggal, BULAN[bulan - 1], tahun, tinggi, berat);
    }
}