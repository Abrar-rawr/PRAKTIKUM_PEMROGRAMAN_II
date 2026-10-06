package PRAK201_2510817310001_MuhammadAbrar;

public class Buah {
    private String namaBuah;
    private double berat;
    private double harga;
    private double jumlahBeli;

    public Buah(String namaBuah, double berat, double harga, double jumlahBeli) {
        this.namaBuah = namaBuah;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    public double hargaPerKg() {
        return harga / berat;
    }

    public double hitungHargaSebelumDiskon() {
        return hargaPerKg() * jumlahBeli;
    }

    public double hitungHargaPaket() {
        return hargaPerKg() * 4;
    }

    public int hitungJumlahPaket() {
        return (int) (jumlahBeli / 4);
    }

    public double hitungTotalDiskon() {
        return 0.02 * hitungHargaPaket() * hitungJumlahPaket();
    }

    public double hitungHargaSetelahDiskon() {
        return hitungHargaSebelumDiskon() - hitungTotalDiskon();
    }

    public void tampilkanInfo() {
        System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
        System.out.printf(java.util.Locale.US,
                "Harga Sebelum Diskon: Rp%.2f%n" +
                        "Total Diskon: Rp%.2f%n" +
                        "Harga Setelah Diskon: Rp%.2f%n",
                hitungHargaSebelumDiskon(), hitungTotalDiskon(), hitungHargaSetelahDiskon());
        System.out.println();
    }
}