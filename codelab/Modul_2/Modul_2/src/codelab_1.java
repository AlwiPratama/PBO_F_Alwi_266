import java.util.Scanner;

class Hewan {
    // untuk menyimpan nama, jenis, dan suara hewan
    String nama;
    String jenis;
    String suara;

    // menginisialisasi objek Hewan dengan nilai tertentu
    Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara; 
    }

    // menampilkan informasi hewan
    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara); 
        System.out.println();
    }
}

// Kelas Main
public class codelab_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek hewan
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Meong");
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Guk guk");

        // Memilih hewan
        System.out.println("Pilih hewan yang ingin ditampilkan:");
        System.out.println("1. Anjing");
        System.out.println("2. Kucing");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = scanner.nextInt();

        // Menampilkan informasi berdasarkan pilihan
        System.out.println();
        if (pilihan == 1) {
            hewan2.tampilkanInfo();
        } else if (pilihan == 2) {
            hewan1.tampilkanInfo();
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
