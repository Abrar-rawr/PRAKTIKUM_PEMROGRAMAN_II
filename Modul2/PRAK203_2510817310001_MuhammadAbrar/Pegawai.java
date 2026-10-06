package PRAK203_2510817310001_MuhammadAbrar;

public class Pegawai {
    public String nama;
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