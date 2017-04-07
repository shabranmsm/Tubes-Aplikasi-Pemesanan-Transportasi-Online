package aplikasi_pemesanan_transportasi_online;
import java.util.*;

public class Aplikasi {
    private List<Pelanggan> daftarPelanggan = new ArrayList();
    private List<Pengemudi> daftarPengemudi = new ArrayList();
    private int idx;
    
    public void addPelanggan(Pelanggan c) {
 
    }
    
    public void addPengemudi() {
        
    }

    public void deletePengemudi() {
        
    }

    public List<Pelanggan> getDaftarPelanggan() {
        return daftarPelanggan;
    }

    public List<Pengemudi> getDaftarPengemudi() {
        return daftarPengemudi;
    }
           
    public void loginConsole() {
        System.out.println("APLIKASI TRANSPORTASI ONLINE");
        System.out.println("============================\n");
        System.out.println("1. Register as Driver");
        System.out.println("2. Register as Customer");
        System.out.println("3. Login as Driver");
        System.out.println("4. Login as Customer");
        System.out.print("Pilihan : \n");
        
        Scanner sc = new Scanner(System.in);
        int pilih = sc.nextInt();
        
        switch(pilih) {
            case 1 :    String nomorKendaraan = sc.nextLine();
                        String namaDriver = sc.nextLine();
                        String emailDriver = sc.nextLine();
                        String nomorTeleponDriver = sc.nextLine();
                        String passwordDriver = sc.nextLine();
//                        l.add(new Pengemudi(nomorKendaraan,namaDriver,emailDriver,nomorTeleponDriver,passwordDriver));
                                               
            case 2 :    String alamat = sc.nextLine();
                        String namaCustomer = sc.nextLine();
                        String emailCustomer = sc.nextLine();
                        String nomorTeleponCustomer = sc.nextLine();
                        String passwordCustomer = sc.nextLine();
                        l.add(new Pelanggan(alamat,namaCustomer,emailCustomer,nomorTeleponCustomer,passwordCustomer));
                
            case 3 :    String usernameD = sc.nextLine();
                        String passwordD = sc.nextLine();
                        cekPengemudi(usernameD,passwordD);
                
            case 4 :    String usernameC = sc.nextLine();
                        String passwordC = sc.nextLine();
                        cekPelanggan(usernameC,passwordC);
        }
    }
    
    public void menuPengemudi() {
        
    }
    
    public void menuPelanggan() {
        
    }
}
