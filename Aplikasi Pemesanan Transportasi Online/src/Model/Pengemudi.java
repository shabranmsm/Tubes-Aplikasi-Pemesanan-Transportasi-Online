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
    private final String idDriver 
    private String nomorKendaraan;
    private static int counter = 1;
    private int idx;
    
    //Constructor here
    
    public Pengemudi(String idDriver, String nomorKendaraan, String nama, String noTelp, String password, String username) {
        super(nama, noTelp, password, username);
        this.idDriver = idDriver;
        this.nomorKendaraan = nomorKendaraan;
    
    public void addPesanan(Pesanan p) {
        daftarPesanan.add(p);
    }

    public void removePesanan(int idx) {
        for(Pesanan P : daftarPesanan){
            if(P.getIdPesanan().equals(idx)){
                daftarPesanan.remove(P);
    }
    
    //List here
    
    public List<Pesanan> getDaftarPesanan() {
        return daftarPesanan;
    
    //Getter here
}

    public String getIdDriver() {
        return idDriver;
    }

    public String getNomorKendaraan() {
        return nomorKendaraan;
    }

    public static int getCounter() {
        return counter;
    }

    public int getIdx() {
        return idx;
    }
    
    @Override
    public String toString() {
        return  "Username : \n" + getUsername()
                + "Password : \n" + getPassword()
                + "IdDriver : \n" + idDriver 
                + "Nama : \n" + getNama() 
                + "nomorKendaraan = \n" + nomorKendaraan
                + "NoTelp : \n" + getNoTelp();
    }
}