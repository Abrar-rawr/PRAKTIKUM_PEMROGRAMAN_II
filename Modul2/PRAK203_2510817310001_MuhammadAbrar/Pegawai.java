package PRAK203_2510817310001_MuhammadAbrar;

// Pada baris ini terjadi error karena nama class (Employee) tidak sama dengan nama file (Pegawai.java),
// dan Soal3Main memakai nama Pegawai.
// public class Employee {
public class Pegawai {
    public String nama;

    // Pada baris ini terjadi error karena char hanya bisa menampung satu karakter,
    // sehingga tidak bisa diisi "Kingdom of Orvel" dan tidak cocok dengan getAsal() yang mengembalikan String.
    // public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // Pada baris ini terjadi error karena method tidak memiliki parameter,
    // padahal isi method memakai variabel j yang tidak pernah dideklarasikan,
    // dan method dipanggil dengan satu argumen. Tambahkan parameter String j.
    // public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}