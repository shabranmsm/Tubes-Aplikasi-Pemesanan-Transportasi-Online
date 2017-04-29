// Nama     : Hendrik Christian Janifer Simanjuntak
// NIM      : 1301150021
// Kelas    : IF 39-07
//
// OBJECT ORIENTED PROGRAMMING FINAL PROJECT - TELKOM UNIVERSITY 2017
//

package Model;

public class Pesanan {
    private String lokasiAwal;
    private String destinasi;
    private boolean status;
    private int jarak;
    private final String idPesanan;
    protected int harga;
    private static int counter = 1;

    public Pesanan(String lokasiAwal, String destinasi, boolean status, int jarak, String idPesanan, int harga) {
        this.lokasiAwal = lokasiAwal;
        this.destinasi = destinasi;
        this.status = status;
        this.jarak = jarak;
        this.idPesanan = idPesanan;
        this.harga = harga;
    }

    public String getLokasiAwal() {
        return lokasiAwal;
    }

    public String getDestinasi() {
        return destinasi;
    }

    public boolean isStatus() {
        return status;
    }

    public int getJarak() {
        return jarak;
    }

    public String getIdPesanan() {
        return idPesanan;
    }

    public int getHarga() {
        if (jarak <= 8 ) {
            harga = 12000;
        }
        else if (jarak > 8) {
            harga = jarak * 1500;
        }
        
        return harga;
    }
}