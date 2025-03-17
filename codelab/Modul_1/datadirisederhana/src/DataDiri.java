import java.util.Scanner; //menggunakan scanner untuk mendapatkan input (library seperti stdio untuk scanf pada bahasa C??)
import java.time.LocalDate; //untuk menghitung mundur tahun yang di input oleh user

public class DataDiri { //membuat nama untuk kelas utama
    public static void main(String[] args) { //class utama yang akan di eksekusi (int main pada bahasa c??)
        Scanner scanner = new Scanner(System.in); //untuk mendapatkan input dari user (scanf pada bahasa c)

        System.out.print("Nama: "); //menampilkan tulisan "Nama: " pada terminal
        String nama = scanner.nextLine(); //untuk membaca string darri inputan user (scanf("%s") dan fgets pada bahasa c)

        System.out.print("Jenis Kelamin (P/L): ");
        char jk = scanner.next().charAt(0); //Membaca satu karakter dari input user (p/l) (mirip scanf("%c") pada C

        System.out.print("Tahun Lahir: ");
        int tahunLahir = scanner.nextInt(); //membaca angka dari input(scanf("%d") pada bahasa c)

        scanner.close(); //untuk menutup scanner

        int umur = LocalDate.now().getYear() - tahunLahir; //untuk menghitung tahun sekarang - tahun ahir dari input
        String jenisKelamin = (jk == 'L' || jk == 'l') ? "Laki-laki" : "Perempuan";

        System.out.println("\nData Diri:"); //menampilkan tulisan (printf pada bahasa c)
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur         : " + umur + " tahun");
    } //ngga pake return ?????????????????
}