import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public boolean validateLogin(String inputNama, String inputNim) {
        return inputNama.equals(nama) && inputNim.equals(nim);
    }
}

class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean validateLogin(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}

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

    private static void attemptLogin (int userType, Scanner input){
        while (true) {
            if (userType == 1) {
                Admin dataAdmin = new Admin("Admin266", "Password266");

                System.out.print("Username: ");
                String inputUsername = input.nextLine();
                System.out.print("Password: ");
                String inputPassword = input.nextLine();

                if (dataAdmin.validateLogin(inputUsername, inputPassword)) {
                    System.out.println("Login berhasil Sebagai Admin1");
                    return;
                }else{
                    System.out.println("Login gagal, silahkan coba lagi");
                }
            }else if (userType == 2) {
                Mahasiswa dataMahasiswa = new Mahasiswa("AlwiPratama", "202410370110266");
                System.out.print("Masukkan Nama: ");
                String inputNama = input.nextLine();
                System.out.print("Masukkan NIM: ");
                String inputNim = input.nextLine();

                if (dataMahasiswa.validateLogin(inputNama, inputNim)) {
                    System.out.println("Login berhasil Sebagai Mahasiswa");
                    System.out.println("Nama: " + dataMahasiswa.getNama());
                    System.out.println("NIM: " + dataMahasiswa.getNim());
                    return;
                }else{
                    System.out.println("Login gagal, silahkan coba lagi");
                }
            }
        }
    }
}