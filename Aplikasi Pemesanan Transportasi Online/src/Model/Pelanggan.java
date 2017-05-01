// Nama     : Hendrik Christian Janifer Simanjuntak
// NIM      : 1301150021
// Kelas    : IF 39-07
//
// OBJECT ORIENTED PROGRAMMING FINAL PROJECT - TELKOM UNIVERSITY 2017
//
package Model;

import java.util.*;
import Model.Pesanan;

public class Pelanggan extends Orang {

    private List<Pesanan> daftarPesanan;
    private final String idCustomer;
    private static int counterC = 1;
    private int idx;

    public Pelanggan(String email, String nama, String noTelp, String password, String username) {
        super(nama, noTelp, password, username);
        idCustomer = "C-" + (counterC++);
        daftarPesanan = new ArrayList<Pesanan>();
    }
  
    public void createPesanan(String lokasiAwal, String destinasi) {
        int harga = 20000;
        boolean status = true;
        Pesanan order = new Pesanan(lokasiAwal, destinasi, status, harga);
        daftarPesanan.add(order);
    }

    public void createPesananKurir(String lokasiAwal, String destinasi) {
        int harga = 150000;
        boolean status = true;
        Kurir kurir = new Kurir(lokasiAwal, destinasi, status, harga);
        daftarPesanan.add(kurir);
    }

    public void removePesanan(String idPesanan) {
        for (Pesanan P : daftarPesanan) {
            if (P.getIdPesanan().equals(idPesanan)) {
                daftarPesanan.remove(P);
            }
        }
    }

//    public void searchPesanan(String idPesanan) {
//        for(Pelanggan c : daftarPelanggan) {
//            if (c.getPesanan(id).equals(id)) {
//                System.out.println(c.getPesanan(id));
//            }
//        }
//    }
    
    public Pesanan getPesanan(String id){
        for (Pesanan o : daftarPesanan) {
            if (o.getIdPesanan().equals(id)) {
                return o;
            }
        }
        return null;
    }
  
    public void showAllPesanan() {
        for (Pesanan p : daftarPesanan) {
            p.toString();
        }

    }

    public List<Pesanan> getPesanan(int idx) {
        return daftarPesanan;
    }

    public String getIdCustomer() {
        return idCustomer;
    }
    
    

    @Override
    public String toString() {
        return "Nama Pelanggan      : " + getNama() + "\n"
                + "ID Pelanggan        : " + idCustomer + "\n"
                + "Nomor Telepon       : " + getNoTelp() + "\n"
                + "Username            : " + getUsername() + "\n"
                + "Password            : " + getPassword();
    }
}
