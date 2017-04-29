// Nama     : Gabe Dimas Wicaksana
// NIM      : 1301154245
// Kelas    : IF 39-07
//
// OBJECT ORIENTED PROGRAMMING FINAL PROJECT - TELKOM UNIVERSITY 2017
//

package Model;
import java.util.List;
import sun.security.util.Password;

public abstract class Orang {
    private String nama;
    private String noTelp;
    private String password;
    private String username;

    public Orang(String nama, String noTelp, String password, String username) {
        this.nama = nama;
        this.noTelp = noTelp;
        this.password = password;
        this.username = username;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }   
}