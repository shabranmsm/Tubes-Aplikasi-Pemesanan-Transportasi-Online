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
    private String idPesanan;
    protected int harga;
    private static int counterO = 1;

    public Pesanan(String lokasiAwal, String destinasi, boolean status,int harga) {
        this.lokasiAwal = lokasiAwal;
        this.destinasi = destinasi;
        this.status = status;
        this.harga = harga;
        idPesanan = "O-" + (counterO++);
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

    public String getIdPesanan() {
        return idPesanan;
    }

    public int getHarga() {
        return 21000;
    }

    @Override
    public String toString() {
        return  "ID Pesanan          : " + idPesanan + "\n" +
                "Lokasi Awal         : " + lokasiAwal + "\n" +
                "Destinasi           : " + destinasi + "\n" +
                "Harga               : " + harga + "\n" +
                "Status              : " + status;
    }
}