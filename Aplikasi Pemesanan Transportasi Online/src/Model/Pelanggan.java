// Nama     : Hendrik Christian Janifer Simanjuntak
// NIM      : 1301150021
// Kelas    : IF 39-07
//
// OBJECT ORIENTED PROGRAMMING FINAL PROJECT - TELKOM UNIVERSITY 2017
//

package Model;
import java.util.*;

public class Pelanggan extends Orang{
    private List<Pesanan> daftarPesanan;
    private final String idCustomer;
    private static int counterC = 1;
    private String email;
    private int idx;

    public Pelanggan(String email, String nama, String noTelp, String password, String username) {
        super(nama, noTelp, password, username);
        this.email = email;
        idCustomer = "C-" + (counterC++);
    }
       
    public void createPesanan(String lokasiAwal, String destinasi, boolean status, String idPesanan, int harga) {
        Pesanan order = new Pesanan(lokasiAwal,destinasi,status,idPesanan,harga);
        daftarPesanan.add(order);
    }
    
    public void createPesananKurir(String jenisKendaraan, String lokasiAwal, String destinasi, boolean status, String idPesanan, int harga) {
        Kurir kurir = new Kurir(jenisKendaraan,lokasiAwal,destinasi,status,idPesanan,harga);
        daftarPesanan.add(kurir);
    }

    public void removePesanan(int idx) {
        for (Pesanan P : daftarPesanan) {
            if (P.getIdPesanan().equals(idx)) {
                daftarPesanan.remove(P);
            }
        }
    }

    public List<Pesanan> getPesanan(int idx) {
        return daftarPesanan;
    }

    public String getEmail() {
        return email;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    @Override
    public String toString() {
        return  "Nama Pelanggan      : " + getNama() + "\n" +
                "ID Pelanggan        : " + idCustomer + "\n" +
                "Email               : " + email + "\n" +
                "Nomor Telepon       : " + getNoTelp() + "\n" +
                "Username            : " + getUsername() + "\n" +
                "Password            : " + getPassword();
    }
}
