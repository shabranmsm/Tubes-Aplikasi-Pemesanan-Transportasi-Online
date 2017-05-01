// Nama     : Muhammad Shabran Metafarady
// NIM      : 1301154413
// Kelas    : IF 39-07
//
// OBJECT ORIENTED PROGRAMMING FINAL PROJECT - TELKOM UNIVERSITY 2017
//

package Model;
import java.util.*;

public class Pengemudi extends Orang{
    private List<Pesanan> daftarPesanan = new ArrayList();
    private String idDriver;
    private String nomorKendaraan;
    private static int counterD = 1;
    private int idx;

    public Pengemudi(String nomorKendaraan, String nama, String noTelp, String password, String username) {
        super(nama, noTelp, password, username);
        idDriver = "D-" + (counterD++);
        this.nomorKendaraan = nomorKendaraan;
    }

    public void addPesanan(Pesanan p) {
        daftarPesanan.add(p);
    }

    public void removePesanan(String idPesanan) {
        for (Pesanan p : daftarPesanan) {
            if(p.getIdPesanan().equals(idPesanan)) {
                daftarPesanan.remove(p);
            }
        }
    }

    public List<Pesanan> getPesanan() {
        return daftarPesanan;
    }

    public String getIdDriver() {
        return idDriver;
    }

    public String getNomorKendaraan() {
        return nomorKendaraan;
    }

    @Override
    public String toString() {
        return  "Nama Pengemudi      : " + getNama() + "\n" +
                "ID Pengemudi        : " + idDriver + "\n" +
                "Nomor Kendaraan     : " + nomorKendaraan + "\n" +
                "Nomor Telepon       : " + getNoTelp() + "\n" +
                "Username            : " + getUsername() + "\n" +
                "Password            : " + getPassword();
    }   
}