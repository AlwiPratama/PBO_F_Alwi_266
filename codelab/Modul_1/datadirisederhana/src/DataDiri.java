import java.util.Scanner;
import java.time.LocalDate;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Jenis Kelamin (P/L): ");
        char jk = scanner.next().charAt(0);

        System.out.print("Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        scanner.close();

        int umur = LocalDate.now().getYear() - tahunLahir;
        String jenisKelamin = (jk == 'L' || jk == 'l') ? "Laki-laki" : "Perempuan";

        System.out.println("\nData Diri:");
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur         : " + umur + " tahun");
    }
}