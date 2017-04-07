package aplikasi_pemesanan_transportasi_online;

public class Kurir extends Pesanan {
    private String jenisKendaraan, idKurir;
    private int idx;

    public Kurir(String jenisKendaraan, String idKurir, int idx, String lokasiAwal, String destinasi, boolean status, int jarak, int idPesanan, int harga) {
        super(lokasiAwal, destinasi, status, jarak, idPesanan, harga);
        this.jenisKendaraan = jenisKendaraan;
        this.idKurir = idKurir;
        this.idx = idx;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public String getIdKurir() {
        return idKurir;
    }

    @Override
    public int getHarga() {
        return harga;
    }

    
    
}
