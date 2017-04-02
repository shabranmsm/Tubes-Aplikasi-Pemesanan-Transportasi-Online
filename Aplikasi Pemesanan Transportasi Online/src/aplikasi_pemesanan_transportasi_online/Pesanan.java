package aplikasi_pemesanan_transportasi_online;

public class Pesanan {
    private String lokasiAwal, destinasi;
    private int jarak;
    protected int harga;

    public Pesanan(String lokasiAwal, String destinasi, int jarak, int harga) {
        this.lokasiAwal = lokasiAwal;
        this.destinasi = destinasi;
        this.jarak = jarak;
        this.harga = harga;
    }

    public String getLokasiAwal() {
        return lokasiAwal;
    }
    
    public String getDestinasi() {
        return destinasi;
    }

    public int getJarak() {
        return jarak;
    }

    public int getHarga() {
        return harga;
    }
}
