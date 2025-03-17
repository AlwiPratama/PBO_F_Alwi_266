import java.util.Scanner;

// Kelas RekeningBank
class RekeningBank {
    String nomorRekening, namaPemilik;
    double saldo;

    // Konstruktor
    RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Metode untuk menampilkan informasi rekening
    void tampilkanInfo() {
        System.out.println("\nNomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
    }
}

public class codelab_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data rekening tetap
        RekeningBank rekening1 = new RekeningBank("202410370110266", "Alwi Pratama", 5000000);
        RekeningBank rekening2 = new RekeningBank("280704", "Alwi", 900000);

        // Input nomor rekening
        System.out.print("Masukkan Nomor Rekening: ");
        String inputNomor = scanner.nextLine();

        // Menampilkan informasi rekening jika nomor cocok
        if (inputNomor.equals(rekening1.nomorRekening)) {
            rekening1.tampilkanInfo();
        } else if (inputNomor.equals(rekening2.nomorRekening)) {
            rekening2.tampilkanInfo();
        } else {
            System.out.println("Nomor rekening tidak ditemukan.");
        }

        scanner.close();
    }
}
