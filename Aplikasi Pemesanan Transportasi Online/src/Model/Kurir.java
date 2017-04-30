// Nama     : Muhammad Shabran Metafarady
// NIM      : 1301154413
// Kelas    : IF 39-07
//
// OBJECT ORIENTED PROGRAMMING FINAL PROJECT - TELKOM UNIVERSITY 2017
//

package Model;

public class Kurir extends Pesanan {
    private static int counterO = 1;
    private int idx;

    public Kurir(String lokasiAwal, String destinasi, boolean status, int harga) {
        super(lokasiAwal, destinasi, status, harga);
        String idPesanan = "O-" + (counterO++);
    }

    @Override
    public int getHarga() {
        return 150000;
    }
    
}

