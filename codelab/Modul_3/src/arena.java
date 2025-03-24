import java.util.Scanner;

class KarakterGame {
    private String nama;
    private int kesehatan;

    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    public void serang(KarakterGame target) {
        // Method ini akan di-override oleh subclass
    }
}

class Pahlawan extends KarakterGame {
    private String senjata;

    public Pahlawan(String nama, int kesehatan, String senjata) {
        super(nama, kesehatan);
        this.senjata = senjata;
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan " + senjata + "!");
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

class Musuh extends KarakterGame {
    private String senjata;

    public Musuh(String nama, int kesehatan, String senjata) {
        super(nama, kesehatan);
        this.senjata = senjata;
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan " + senjata + "!");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

public class arena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama Pahlawan: ");
        String namaPahlawan = scanner.nextLine();
        System.out.print("Masukkan senjata Pahlawan: ");
        String senjataPahlawan = scanner.nextLine();
        System.out.print("Masukkan persentase kesehatan Pahlawan: ");
        int kesehatanPahlawan = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.print("Masukkan nama Musuh: ");
        String namaMusuh = scanner.nextLine();
        System.out.print("Masukkan senjata Musuh: ");
        String senjataMusuh = scanner.nextLine();
        System.out.print("Masukkan persentase kesehatan Musuh: ");
        int kesehatanMusuh = scanner.nextInt();

        Pahlawan pahlawan = new Pahlawan(namaPahlawan, kesehatanPahlawan, senjataPahlawan);
        Musuh musuh = new Musuh(namaMusuh, kesehatanMusuh, senjataMusuh);

        System.out.println("\nStatus awal:");
        System.out.println(pahlawan.getNama() + " memiliki kesehatan: " + pahlawan.getKesehatan());
        System.out.println(musuh.getNama() + " memiliki kesehatan: " + musuh.getKesehatan());

        pahlawan.serang(musuh);
        musuh.serang(pahlawan);
        
        scanner.close();
    }
}
