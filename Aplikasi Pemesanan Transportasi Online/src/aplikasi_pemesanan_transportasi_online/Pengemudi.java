package aplikasi_pemesanan_transportasi_online;
import java.util.*;

public class Pengemudi extends Orang{
    private List<Pesanan> pesanan = new ArrayList();
    private String idDriver, nomorKendaraan;
    private int idx;

    public Pengemudi(String idDriver, String nomorKendaraan, String nama, String nomorTelepon, String password, String username) {
        super(nama, nomorTelepon, password, username);
        this.idDriver = idDriver;
        this.nomorKendaraan = nomorKendaraan;
    }
       
    public void addPesanan(Pesanan p) {

    }

    public void removePesanan(int idx) {

    }

    public List<Pesanan> getPesanan() {
        return pesanan;
    }

    public String getIdDriver() {
        return idDriver;
    }

    public String getNomorKendaraan() {
        return nomorKendaraan;
    }    
}
