package aplikasi_pemesanan_transportasi_online;

public class Kurir extends Pesanan {
    private int berat;
    private String dimensiPickup;

    public Kurir(int berat, String dimensiPickup, String lokasiAwal, String destinasi, int jarak, int harga) {
        super(lokasiAwal, destinasi, jarak, harga);
        this.berat = berat;
        this.dimensiPickup = dimensiPickup;
    }

    public int getBerat() {
        return berat;
    }

    public String getDimensiPickup() {
        return dimensiPickup;
    }

    public int getHarga() {
        return harga;
    }
}
