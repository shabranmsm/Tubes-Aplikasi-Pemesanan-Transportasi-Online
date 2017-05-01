// Nama     : Gabe Dimas Wicaksana
// NIM      : 1301154245
// Kelas    : IF 39-07
//
// OBJECT ORIENTED PROGRAMMING FINAL PROJECT - TELKOM UNIVERSITY 2017
//
package ViewConsole;

import Model.Aplikasi;
import Model.Kurir;
import Model.Orang;
import Model.Pelanggan;
import Model.Pengemudi;
import Model.Pesanan;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    private Aplikasi model;
    private Scanner inputInteger;
    private Scanner inputString;

    public Console(Aplikasi model) {
        this.model = model;
        inputInteger = new Scanner(System.in);
        inputString = new Scanner(System.in);
    }

    public int olahInteger() throws Exception {
        try {
            return inputInteger.nextInt();
        } catch (InputMismatchException ie) {
            throw new InputMismatchException("Salah inputan, seharusnya integer !");
        } catch (Exception ex) {
            throw new Exception("Salah inputan, seharusnya integer !");
        } finally {
            inputInteger = new Scanner(System.in);
        }
    }

    public void mainMenu() {
        int n = 0;
        do {
            try {
                System.out.println("    Transportasi Online    ");
                System.out.println("=========================\n");
                System.out.println("1. Register as Customer");
                System.out.println("2. Register as Driver\n");
                System.out.println("3. Login as Customer");
                System.out.println("4. Login as Driver\n");
                System.out.println("5. Delete Account Customer");
                System.out.println("6. Delete Account Driver\n");
                System.out.println("7. Exit Program\n");
                System.out.print(" >> Pilihan >> ");
                n = olahInteger();
                switch (n) {
                    case 1:
                        System.out.println("//REGISTER AS CUSTOMER------------------\n");
                        System.out.println("Nama Lengkap    : ");
                        String namaCust = inputString.nextLine();
                        System.out.println("Email           : ");
                        String emailCust = inputString.nextLine();
                        System.out.println("Nomor Telepon   : ");
                        String no_telpCust = inputString.nextLine();
                        System.out.println("Username        : ");
                        String usernameCust = inputString.nextLine();
                        System.out.println("Password        : ");
                        String passwordCust = inputString.nextLine();
                        model.addPelanggan(emailCust, namaCust, no_telpCust, passwordCust, usernameCust);
//                        model.getPelanggan(0);
                        break;

                    case 2:
                        System.out.println("//REGISTER AS DRIVER--------------------\n");
                        System.out.println("Nama Lengkap    : ");
                        String namaDriv = inputString.nextLine();
                        System.out.println("Nomor Kendaraan : ");
                        String nopol = inputString.nextLine();
                        System.out.println("Nomor Telepon   : ");
                        String no_telpDriv = inputString.nextLine();
                        System.out.println("Username        : ");
                        String usernameDriv = inputString.nextLine();
                        System.out.println("Password        : ");
                        String passwordDriv = inputString.nextLine();
                        model.addPengemudi(nopol, namaDriv, no_telpDriv, passwordDriv, usernameDriv);
                        break;

                    case 3:
                        System.out.println("//LOGIN AS CUSTOMER---------------------\n");
                        System.out.println("Username        : ");
                        String username_cust = inputString.nextLine();
                        System.out.println("Password        : ");
                        String password_cust = inputString.nextLine();
                        if (model.loginPelanggan(username_cust, password_cust) == true) {
                            System.out.println("Login success");
                            menuPelanggan();
                        } else {
                            System.out.println("Login failed. Username or Password doesn't match !");
                        }

                        break;

                    case 4:
                        System.out.println("//LOGIN AS DRIVER-----------------------\n");
                        System.out.println("Username        : ");
                        String username_driv = inputString.nextLine();
                        System.out.println("Password        : ");
                        String password_driv = inputString.nextLine();
                        if (model.loginPengemudi(username_driv, password_driv) == true) {
                            System.out.println("Login success");
                            menuPengemudi();
                        } else {
                            System.out.println("Login failed. Username or Password doesn't match !");
                        }
                        break;

                    case 5:
                        System.out.print("Masukkan ID Pelanggan yang ingin dihapus : ");
                        inputString = new Scanner(System.in);
                        String idCust = inputString.nextLine();
                        if ((model.deletePelanggan(idCust)) == true) {
                            System.out.println("Account has been deleted \n");
                            mainMenu();
                        } else {
                            System.out.println("Account cannot be deleted");
                        }
                        break;
                        
                    case 6:
                        System.out.print("Masukkan ID Pengemudi yang ingin dihapus : ");
                        inputString = new Scanner(System.in);
                        String idDriv = inputString.nextLine();
                        if ((model.deletePengemudi(idDriv)) == true) {
                            System.out.println("Account has been deleted \n");
                            mainMenu();
                        } else {
                            System.out.println("Account cannot be deleted");
                        }
                        break;
                        
                    case 7:
                        System.out.println("Thank You, goodbye !");
                        break;
                }
            } catch (Exception ex) {
                System.out.println("Error : " + ex.getMessage());
            } finally {
                inputInteger = new Scanner(System.in);
                inputString = new Scanner(System.in);
            }
        } while (n != 7);
    }

    public void menuPelanggan() {
        int n = 0;
        do {
            try {
                System.out.println("------------CUSTOMER------------");
                System.out.println("1. Create Order");
                System.out.println("2. Create Kurir");
                System.out.println("3. Cancel Order");
                System.out.println("4. Cancel Kurir");
                System.out.println("5. Show All History Order");
                System.out.println("6. Search History Order");
                System.out.println("7. Logout");
                System.out.print(" >> Pilihan >> ");
                n = olahInteger();
                switch (n) {
                    case 1:
                        System.out.println("Lokasi Awal     : ");
                        String lokasiAwal = inputString.nextLine();
                        System.out.println("Destinasi       : ");
                        String destinasi = inputString.nextLine();
                        if ((model.createPesanan(lokasiAwal, destinasi)) == true) {
                            System.out.println("Order has been succeded\n");
                        } else {
                            System.out.println("Failed !\n");
                        }
                        break;

                    case 2:
                        System.out.println("Lokasi Awal     : ");
                        String lokasiAwalKurir = inputString.nextLine();
                        System.out.println("Destinasi       : ");
                        String destinasiKurir = inputString.nextLine();
                        if ((model.createKurir(lokasiAwalKurir, destinasiKurir)) == true) {
                            System.out.println("Order has been succeded\n");
                        } else {
                            System.out.println("Failed !\n");
                        }
                        break;

                    case 3:
                        System.out.println("Masukkan ID dari pesanan yang ingin dihapus : ");
                        String id = inputString.nextLine();
                        if ((model.removePesanan(id)) == true) {
                            System.out.println("Order has been removed");
                        } else {
                            System.out.println("Failed !");
                        }
                        break;

                    case 4:
                        model.showAllPesanan();
                        break;

                    case 5:
                        
                        break;

                    case 6: System.out.print("Masukkan id pesanan : "); 
                            String idOrder = inputString.nextLine();
                            model.searchPesanan(idOrder);
//                          System.out.println(e);
                            break;
                        
                    case 7:
                        System.out.println("You are logged out!");
                        break;
                }
            } catch (Exception ex) {
                System.out.println("Error !" + ex.getMessage());
            } finally {
                inputInteger = new Scanner(System.in);
                inputString = new Scanner(System.in);
            }
        } while (n != 7);

    }

    public void menuPengemudi() {
        int n = 0;
        do {
            try {
                System.out.println("------------DRIVER------------");
                System.out.println("1. Add Order");
                System.out.println("2. Remove Order");
                System.out.println("3. View All History Order");
                System.out.println("4. Search Specific Order");
                System.out.println("5. Logout");
                System.out.print(" >> Pilihan >> ");
                n = olahInteger();
                switch (n) {
                    case 1:
                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                    case 5:
                        

                    case 6:
                        System.out.println("You are logged out!");
                        break;
                }
            } catch (Exception ex) {
                System.out.println("Error !" + ex.getMessage());
            } finally {
                inputInteger = new Scanner(System.in);
                inputString = new Scanner(System.in);
            }
        } while (n != 6);
    }
}
