package aplikasi_pemesanan_transportasi_online;

public class Pengemudi extends Orang{
    private Pesanan[] pesanan;
    private String nomorKendaraan;
    private int kinerja;

    public Pengemudi(String nomorKendaraan, String nama, String email, String nomorTelepon) {
        super(nama, email, nomorTelepon);
        this.nomorKendaraan = nomorKendaraan;
    }

    public void addPesanan(Pesanan p) {

    }

    public Pesanan[] getPesanan() {
        return pesanan;
    }

    public void removePesanan(Pesanan p) {

    }

    public int getKinerja() {
        return kinerja;
    }

    public void setKinerja(int kinerja) {
        this.kinerja = kinerja;
    }

    public String getNomorKendaraan() {
        return nomorKendaraan;
    }



}

}
