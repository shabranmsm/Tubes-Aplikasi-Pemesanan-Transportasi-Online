package aplikasi_pemesanan_transportasi_online;

public abstract class Orang {
    private String nama, nomorTelepon, password, username;

    public Orang(String nama, String nomorTelepon, String password, String username) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.password = password;
        this.username = username;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }   
}
