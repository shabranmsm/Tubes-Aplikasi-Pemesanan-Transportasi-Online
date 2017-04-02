package aplikasi_pemesanan_transportasi_online;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        System.out.println("APLIKASI TRANSPORTASI ONLINE");
        System.out.println("============================/n");
        System.out.println("1. Register as Driver");
        System.out.println("2. Register as Customer/n");
        System.out.println("3. Login as Driver");
        System.out.println("4. Login as Customer");
        System.out.print("Pilihan : ");
        
        Scanner sc = new Scanner(System.in);
        int pilih = sc.nextInt();
        
        switch(pilih) {
            case 1 :    String nomorKendaraan = sc.nextLine();
                        String namaDriver = sc.nextLine();
                        String emailDriver = sc.nextLine();
                        String nomorTeleponDriver = sc.nextLine();
                        Pengemudi(nomorKendaraan,namaDriver,emailDriver,nomorTeleponDriver);
                        
            case 2 :    String alamat = sc.nextLine();
                        String namaCustomer = sc.nextLine();
                        String emailCustomer = sc.nextLine();
                        String nomorTeleponCustomer = sc.nextLine();
                        Penumpang(alamat,namaCustomer,emailCustomer,nomorTeleponCustomer);
                
            case 3 :
                
            case 4 : 
        }
        
    }
    
}
