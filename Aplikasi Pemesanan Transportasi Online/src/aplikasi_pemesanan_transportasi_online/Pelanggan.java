package aplikasi_pemesanan_transportasi_online;

public class Pelanggan extends Orang{
    private Pesanan[] pesanan;
    private String alamat;

    public Pelanggan(String alamat, String nama, String email, String nomorTelepon) {
        super(nama, email, nomorTelepon);
        this.alamat = alamat;
    }
    
    public void createPesanan() {

    }

    public void removePesanan() {

    }

    public Pesanan[] getPesanan() {
        return pesanan;
    }

    public String getAlamat() {
        return alamat;
    }

}
