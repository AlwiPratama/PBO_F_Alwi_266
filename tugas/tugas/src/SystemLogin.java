import java.util.Scanner;

public class SystemLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //data admin
        String username ="Admin266";
        String password = "Password266";

        //data mahasiswa
        String nama = "AlwiPratama";
        String nim = "202410370110266";

        int pilihan;
        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        if (scanner.hasNextInt()) {
            pilihan = scanner.nextInt();
            scanner.nextLine();
        }else{
            System.out.println("inputan tidak valid mohon masukkan angka 1 atau 2");
            scanner.close();
            return;
        }

        if (pilihan == 1) { // Login Admin
            System.out.print("Masukkan username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String inputPassword = scanner.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) { // Login Mahasiswa
            System.out.print("Masukkan Nama: ");
            String inputNama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String inputNim = scanner.nextLine();

            if (inputNama.equals(nama) && inputNim.equals(nim)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
