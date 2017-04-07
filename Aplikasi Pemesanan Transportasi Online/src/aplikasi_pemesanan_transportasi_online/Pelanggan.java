package aplikasi_pemesanan_transportasi_online;
import java.util.*;

public class Pelanggan extends Orang{
    private List<Pesanan> pesanan = new ArrayList();
    private String email, idCustomer;
    private int idx;

    public Pelanggan(String email, String idCustomer, String nama, String nomorTelepon, String password, String username) {
        super(nama, nomorTelepon, password, username);
        this.email = email;
        this.idCustomer = idCustomer;
    }
    
    public void createPesanan(Pesanan P) {

    }

    public void removePesanan(int idx) {
        
    }

    public List<Pesanan> getPesanan() {
        return pesanan;
    }

    public String getEmail() {
        return email;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    
    
}
