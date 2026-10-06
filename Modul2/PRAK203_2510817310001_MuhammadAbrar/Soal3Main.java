package PRAK203_2510817310001_MuhammadAbrar;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        // Pada baris ini terjadi error karena kurangnya titik koma (;) di akhir statement
        // p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";

        // Pada bagian ini umur belum pernah diisi sehingga bernilai 0,
        // padahal output yang diminta adalah 17. Tambahkan pengisian umur.
        p1.umur = 17;
        p1.setJabatan("Assasin");

        // Pada baris ini output tidak sesuai karena teksnya "Nama Pegawai: ",
        // padahal output yang diminta "Nama: ".
        // System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);

        // Pada baris ini output tidak sesuai karena tidak ada tulisan "tahun" setelah umur.
        // System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}