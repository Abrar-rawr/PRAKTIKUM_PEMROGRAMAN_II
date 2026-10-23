package soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        String ras = input.nextLine();

        HewanPeliharaan hewan = new HewanPeliharaan(ras, nama);
        hewan.display();

        input.close();
    }
}