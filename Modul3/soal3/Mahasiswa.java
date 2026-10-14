package soal3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    private static final ArrayList<Mahasiswa> daftar = new ArrayList<>();
    private static final HashMap<String, Mahasiswa> indexNim = new HashMap<>();
    private static final Scanner input = new Scanner(System.in);

    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    private static void tambah() {
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine().trim();
        System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
        String nim = input.nextLine().trim();

        if (indexNim.containsKey(nim)) {
            System.out.println("NIM " + nim + " sudah terdaftar.");
            return;
        }
        Mahasiswa m = new Mahasiswa(nama, nim);
        daftar.add(m);
        indexNim.put(nim, m);
        System.out.println("Mahasiswa " + nama + " ditambahkan.");
    }

    private static void hapus() {
        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
        String nim = input.nextLine().trim();
        Mahasiswa m = indexNim.get(nim);

        if (m == null) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
            return;
        }
        daftar.remove(m);
        indexNim.remove(nim);
        System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
    }

    private static void cari() {
        System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
        String nim = input.nextLine().trim();
        Mahasiswa m = indexNim.get(nim);

        if (m == null) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        } else {
            System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getNama());
        }
    }

    private static void tampilkan() {
        if (daftar.isEmpty()) {
            System.out.println("Daftar mahasiswa kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa m : daftar) {
            System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getNama());
        }
    }

    private static void ubah() {
        System.out.print("Masukkan NIM Mahasiswa yang akan diubah: ");
        String nim = input.nextLine().trim();
        Mahasiswa m = indexNim.get(nim);

        if (m == null) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
            return;
        }
        System.out.print("Masukkan Nama baru: ");
        m.setNama(input.nextLine().trim());
        System.out.println("Nama mahasiswa dengan NIM " + nim + " diubah.");
    }

    public static void jalankan() {
        int pilihan = -1;
        while (pilihan != 0) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("5. Ubah Nama Mahasiswa berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            try {
                pilihan = Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Pilihan tidak valid.");
                continue;
            }

            switch (pilihan) {
                case 1: tambah(); break;
                case 2: hapus(); break;
                case 3: cari(); break;
                case 4: tampilkan(); break;
                case 5: ubah(); break;
                case 0: System.out.println("Terima kasih!"); break;
                default: System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
