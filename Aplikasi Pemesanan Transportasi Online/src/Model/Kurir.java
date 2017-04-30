// Nama     : Muhammad Shabran Metafarady
// NIM      : 1301154413
// Kelas    : IF 39-07
//
// OBJECT ORIENTED PROGRAMMING FINAL PROJECT - TELKOM UNIVERSITY 2017
//

package Model;

public class Kurir extends Pesanan {
    private String jenisKendaraan;
    private static int counterO = 1;
    private int idx;

    public Kurir(String jenisKendaraan, String lokasiAwal, String destinasi, boolean status, String idPesanan, int harga) {
        super(lokasiAwal, destinasi, status, idPesanan, harga);
        this.jenisKendaraan = jenisKendaraan;
        idPesanan = "O-" + (counterO++);
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    @Override
    public int getHarga() {
        return harga;
    }
    
}

