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
    private static int counter = 1;
    private String email;
    private int idx;

    //Constructor here

    public Pelanggan(String idCustomer, String email, String nama, String noTelp, String password, String username) {
        super(nama, noTelp, password, username);
        this.idCustomer = idCustomer;
        this.email = email;
    }
    
    
    public void createPesanan(Pesanan P) {
        daftarPesanan.add(P);
    }

    public void removePesanan(int idx) {
        for(Pesanan P : daftarPesanan){
            if(P.getIdPesanan().equals(idx)){
                daftarPesanan.remove(P);
            }
        }
    }

    //List here
    
     public List<Pesanan> getDaftarPesanan() {
        return daftarPesanan;
    }
     
    //Getter here

    public String getIdCustomer() {
        return idCustomer;
    }

    public static int getCounter() {
        return counter;
    }

    public String getEmail() {
        return email;
    }

    public int getIdx() {
        return idx;
    }

    @Override
    public String toString() {
        return  "Username : \n" + getUsername()
                + "Password : \n" + getPassword()
                + "IdCustomer : \n" + idCustomer 
                + "Nama : \n" + getNama() 
                + "Email = \n" + email 
                + "NoTelp : \n" + getNoTelp();
    }
}
