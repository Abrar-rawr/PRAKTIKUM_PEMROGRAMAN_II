package Soal4;

import java.util.Scanner;

public class PRAK104_2510817310001_MuhammadAbrar {

    static final int JUMLAH_RONDE = 3;
    static final String BATU = "B", GUNTING = "G", KERTAS = "K";
    static final String NAMA_ABU = "Abu", NAMA_BAGAS = "Bagas", HASIL_SERI = "Seri";

    static String[] bacaTangan(Scanner sc, String pesan) {
        while (true) {
            System.out.print(pesan);
            String[] tangan = sc.nextLine().trim().toUpperCase().split("\\s+");
            boolean valid = tangan.length == JUMLAH_RONDE;
            for (String t : tangan) {
                if (!(t.equals(BATU) || t.equals(GUNTING) || t.equals(KERTAS))) valid = false;
            }
            if (valid) return tangan;
            System.out.println("Harus " + JUMLAH_RONDE + " pilihan (" + BATU + "/" + GUNTING + "/"
                    + KERTAS + ") dipisah spasi!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] abu   = bacaTangan(sc, "Tangan " + NAMA_ABU + ": ");
        String[] bagas = bacaTangan(sc, "Tangan " + NAMA_BAGAS + ": ");

        int poinAbu = 0, poinBagas = 0;
        for (int i = 0; i < JUMLAH_RONDE; i++) {
            String a = abu[i], b = bagas[i];
            if (a.equals(b)) {

            } else if ((a.equals(BATU) && b.equals(GUNTING))
                    || (a.equals(GUNTING) && b.equals(KERTAS))
                    || (a.equals(KERTAS) && b.equals(BATU))) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }

        if (poinAbu > poinBagas) System.out.println(NAMA_ABU);
        else if (poinBagas > poinAbu) System.out.println(NAMA_BAGAS);
        else System.out.println(HASIL_SERI);
    }
}