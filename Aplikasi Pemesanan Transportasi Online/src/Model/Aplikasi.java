// Nama     : Gabe Dimas Wicaksana
// NIM      : 1301154245
// Kelas    : IF 39-07
//
// OBJECT ORIENTED PROGRAMMING FINAL PROJECT - TELKOM UNIVERSITY 2017
//
package Model;

import Database.FileData;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Aplikasi {

    private List<Pelanggan> daftarPelanggan;
    private List<Pengemudi> daftarPengemudi;
    private FileData save;   
    private String IdLog;
    private String IdLogDriver;

    public Aplikasi() {
        daftarPelanggan = new ArrayList();
        daftarPengemudi = new ArrayList();
        save = new FileData();
    }

    //PELANGGAN------------------------------------------------------------------------------------------------------------------
    public void addPelanggan(String email, String nama, String noTelp, String password, String username) {
        Pelanggan cust = new Pelanggan(email, nama, noTelp, password, username);
        daftarPelanggan.add(cust);        
    }
    
    public boolean createPesanan(String lokasiAwal, String destinasi) {
        
        for (Pelanggan c : daftarPelanggan){
            if(c.getIdCustomer().equals(IdLog)) {
                c.createPesanan(lokasiAwal, destinasi);
                System.out.println(IdLog);
                return true;
            }
        }
        return false;
    }

    public boolean createKurir(String lokasiAwal, String destinasi) {

        for (Pelanggan c : daftarPelanggan) {
            if (c.getIdCustomer().equals(IdLog)) {
                c.createPesananKurir(lokasiAwal, destinasi);
                System.out.println(IdLog);
                return true;
            }
        }
        return false;
    }

    public boolean removePesanan(String idPesanan) {
        for (Pelanggan c : daftarPelanggan) {
            if (c.getIdCustomer().equals(IdLog)) {
                c.removePesanan(idPesanan);
                System.out.println(IdLog);
                return true;
            }
        }
        return false;
    }
    
    
    public Pelanggan getPelanggan(String id) {
        return daftarPelanggan.stream().filter(c -> c.getIdCustomer().equals(id)).findFirst().orElse(null);
    }

    public Pelanggan getPelanggan(int idx) {
        Pelanggan c = daftarPelanggan.get(idx);
        return c;
    }
    
    public boolean loginPelanggan(String username, String password) {
        for (Pelanggan c : daftarPelanggan) {
            if (c.getUsername().equals(username) && c.getPassword().equals(password)) {
                IdLog = c.getIdCustomer();
                System.out.println(IdLog);
                return true;
            }
        }
        return false;
    }
    
    public void searchPesanan(String id) {
        for(Pelanggan c : daftarPelanggan) {
            c.getPesanan(id);
        }
    }

    public boolean deletePelanggan(String id) {
        for (Pelanggan c : daftarPelanggan) {
            if (c.getIdCustomer().equals(id)) {
                daftarPelanggan.remove(c);
                return true;
            }
        }
        return false;
    }

        
    public void showAllPesanan() {
        for(Pelanggan c : daftarPelanggan) {
           c.toString();
        }
    }
    
    //PENGEMUDI------------------------------------------------------------------------------------------------------------------
    public void addPengemudi(String nomorKendaraan, String nama, String noTelp, String password, String username) {
        daftarPengemudi.add(new Pengemudi(nomorKendaraan, nama, noTelp, password, username));
    }

    public Pengemudi getPengemudi(String id) {
        return daftarPengemudi.stream().filter(d -> d.getIdDriver().equals(id)).findFirst().orElse(null);
    }

    public Pengemudi getPengemudi(int idx) {
        Pengemudi d = daftarPengemudi.get(idx);
        return d;
    }

    public boolean loginPengemudi(String username, String password) {
        for (Pengemudi d : daftarPengemudi) {
            if (d.getUsername().equals(username) && d.getPassword().equals(password)) {
                IdLogDriver = d.getIdDriver();
                System.out.println(IdLogDriver);
                return true;
            }
        }
        return false;
    }

    public boolean deletePengemudi(String id) {
        for (Pengemudi d : daftarPengemudi) {
            if (d.getIdDriver().equals(id)) {
                daftarPengemudi.remove(d);
                return true;
            }
        }
        return false;
    }

    public List<Pelanggan> getDaftarPelanggan() {
        return daftarPelanggan;
    }

    public List<Pengemudi> getDaftarPengemudi() {
        return daftarPengemudi;
    }

    //Prototype------------------------------------------------------------------------------------------------------------------
    public void viewListConsole(String[] list) {
        Arrays.stream(list).forEach(System.out::println);
    }

    public String[] getListPelanggan() {
        List idCust = daftarPelanggan.stream().map(c -> c.toString()).collect(Collectors.toList());
        return (String[]) idCust.stream().toArray(size -> new String[size]);
    }

    public String[] getListPengemudi() {
        List idDriv = daftarPengemudi.stream().map(d -> d.toString()).collect(Collectors.toList());
        return (String[]) idDriv.stream().toArray(size -> new String[size]);
    }
    
    
    //SAVE & LOAD TO FILE--------------------------------------------------------------------------------------------------------
    // Database Pelanggan
    public void loadPelaggan() throws FileNotFoundException, IOException{
        try {
            daftarPelanggan = (ArrayList<Pelanggan>) save.getObject("FilePelanggan.dat");
        } catch (FileNotFoundException ex) {
            File f = new File("FilePelanggan.dat");
            f.createNewFile();
        } catch (EOFException ex) {
            daftarPelanggan = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }
    
     public void savePelanggan() throws FileNotFoundException, IOException {
        try {
            save.saveObject(daftarPelanggan, "FilePelanggan.dat");
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("file not found");
        } catch (IOException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }
     
    // Database Pengemudi
    public void loadPengemudi() throws FileNotFoundException, IOException{
        try {
            daftarPengemudi = (ArrayList<Pengemudi>) save.getObject("FilePengemudi.dat");
        } catch (FileNotFoundException ex) {
            File f = new File("FilePengemudi.dat");
            f.createNewFile();
        } catch (EOFException ex) {
            daftarPengemudi = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }
    
     public void savePengemudi() throws FileNotFoundException, IOException {
        try {
            save.saveObject(daftarPengemudi, "FilePengemudi.dat");
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("file not found");
        } catch (IOException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }
            
}
