package  soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Negara{
    private final static HashMap<Integer, String> namaBulan = new HashMap<>();

    static {
        namaBulan.put(1, "Januari");
        namaBulan.put(2, "Februari");
        namaBulan.put(3, "Maret");
        namaBulan.put(4, "April");
        namaBulan.put(5, "Mei");
        namaBulan.put(6, "Juni");
        namaBulan.put(7, "Juli");
        namaBulan.put(8, "Agustus");
        namaBulan.put(9, "September");
        namaBulan.put(10, "Oktober");
        namaBulan.put(11, "November");
        namaBulan.put(12, "Desember");
    }

    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggal;
    private int bulan;
    private int tahun;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggal, int bulan, int tahun) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public String getNama() { return nama; }
    public String getJenisKepemimpinan() {return jenisKepemimpinan; }
    public String getNamaPemimpin() {return namaPemimpin; }
    public int getTanggal() { return tanggal; }
    public int getBulan() { return bulan; }
    public int getTahun() { return tahun; }

    private String getGelar() {
        if (jenisKepemimpinan.equals("monarki")) {
            return "Raja";
        } else if (jenisKepemimpinan.equals("presiden")) {
            return "Presiden";
        } else if (jenisKepemimpinan.equals("perdana menteri")) {
            return "Perdana Menteri";
        }
        return jenisKepemimpinan;
    }

    public void cetakDetail() {
        System.out.println("Negara " + nama + " mempunyai " + getGelar() + " bernama " + namaPemimpin);

        if (!jenisKepemimpinan.equals("monarki")) {
            String namaBulanString = namaBulan.get(bulan);
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggal + " " + namaBulanString + " " + tahun);
        }
        System.out.println();
    }

    public static void jalankan() {
        Scanner input = new Scanner(System.in);
        LinkedList<Negara> daftarNegara = new LinkedList<>();

        System.out.println("Masukkan Banyaknya Negara dan Data Negara : ");
        int jumlah = Integer.parseInt(input.nextLine().trim());
        for (int i = 0; i < jumlah; i++) {
            String nama = input.nextLine().trim();
            String jenis = input.nextLine().trim().toLowerCase();
            String pemimpin = input.nextLine().trim();


            int tanggal = 0, bulan = 0, tahun = 0;
            if (!jenis.equals("monarki")) {
                tanggal = Integer.parseInt(input.nextLine().trim());
                bulan = Integer.parseInt(input.nextLine().trim());
                tahun = Integer.parseInt(input.nextLine().trim());
            }
            daftarNegara.add(new Negara(nama, jenis, pemimpin, tanggal, bulan, tahun));
        }
        System.out.println();

        for (Negara n : daftarNegara) {
            n.cetakDetail();
        }
    }
}