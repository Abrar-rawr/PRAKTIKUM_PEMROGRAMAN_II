package soal1;

import java.util.Random;
import java.util.Scanner;
import java.util.LinkedList;

public class Dadu {
    private static final Random random = new Random();
    private int nilai;

    public Dadu() {
        acakNilai();
    }

    public void acakNilai() {
        nilai = random.nextInt(6) + 1;
    }

    public int getNilai() {
        return nilai;
    }

    public static void jalankan() {
        Scanner input = new Scanner(System.in);
        LinkedList<Dadu> daftarDadu = new LinkedList<>();

        System.out.print("Masukkan jumlah dadu: ");
        int jumlah = input.nextInt();
        for (int i = 0; i < jumlah; i++) {
            daftarDadu.add(new Dadu());
        }

        int total = 0;
        int nomor = 1;
        for (Dadu d : daftarDadu) {
            System.out.println("Dadu ke- " + nomor + " bernilai " + d.getNilai());
            total += d.getNilai();
            nomor++;
        }
        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}

