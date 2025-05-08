import java.util.Scanner;

// Superclass User
class User {
    private String nama;
    private String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public boolean login(String inputNama, String inputNim) {
        return false; // Akan di-override oleh subclass
    }

    public void displayInfo() {
        System.out.println("User: " + nama);
    }
}

// Subclass Admin
class Admin extends User {
    private String username;
    private String password;

    public Admin(String username, String password) {
        super("", "");
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login berhasil sebagai Admin!");
    }
}

// Subclass Mahasiswa
class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return inputNama.equals(getNama()) && inputNim.equals(getNim());
    }

    @Override
    public void displayInfo() {
        System.out.println("Login berhasil sebagai Mahasiswa!");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }
}

// Kelas utama LoginSystem
public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu Login");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");

        int choice = 0;
        while (true) {
            System.out.print("Masukkan pilihan (1/2): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Bersihkan buffer
                if (choice == 1 || choice == 2)
                    break;
            } else {
                scanner.nextLine(); // Buang input yang salah
            }
            System.out.println("Pilihan tidak valid. Harus berupa angka 1 atau 2.");
        }
        attemptLogin(choice, scanner);
        scanner.close();
    }

    private static void attemptLogin(int userType, Scanner input) {
        while (true) {
            if (userType == 1) {
                Admin admin = new Admin("Admin266", "Password266");
                System.out.print("Username: ");
                String inputUsername = input.nextLine();
                System.out.print("Password: ");
                String inputPassword = input.nextLine();

                if (admin.login(inputUsername, inputPassword)) {
                    admin.displayInfo();
                    return;
                } else {
                    System.out.println("Login gagal, silakan coba lagi!");
                }
            } else if (userType == 2) {
                Mahasiswa mahasiswa = new Mahasiswa("AlwPratama", "202410370110266");
                System.out.print("Masukkan Nama: ");
                String inputNama = input.nextLine();
                System.out.print("Masukkan NIM: ");
                String inputNim = input.nextLine();

                if (mahasiswa.login(inputNama, inputNim)) {
                    mahasiswa.displayInfo();
                    return;
                } else {
                    System.out.println("Login gagal, silakan coba lagi!");
                }
            }
        }
    }
}
