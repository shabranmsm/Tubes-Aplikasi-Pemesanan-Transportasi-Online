// Nama     : Gabe Dimas Wicaksana
// NIM      : 1301154245
// Kelas    : IF 39-07
//
// OBJECT ORIENTED PROGRAMMING FINAL PROJECT - TELKOM UNIVERSITY 2017
//

package Driver;
import Model.Aplikasi;
import java.util.ArrayList;
import java.util.Scanner;
import ViewConsole.Console;

public class Driver {
    public static void main(String[] args) {
    
        Aplikasi app = new Aplikasi();
        Console view = new Console(app);
        view.mainMenu();
    }
    
}
