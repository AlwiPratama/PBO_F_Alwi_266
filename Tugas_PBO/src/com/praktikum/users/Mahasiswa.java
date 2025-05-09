package com.praktikum.users;

import java.util.Scanner;
import com.praktikum.actions.MahasiswaActions;

public class Mahasiswa extends User implements MahasiswaActions {

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return inputNama.equals(getNama()) && inputNim.equals(getNim());
    }

    @Override
    public void reportItem() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nama Barang: ");
            String nama = sc.nextLine();
            System.out.print("Deskripsi Barang: ");
            String deskripsi = sc.nextLine();
            System.out.print("Lokasi Terakhir/Ditemukan: ");
            String lokasi = sc.nextLine();
        }
        System.out.println("Laporan berhasil dikirim!");
    }

    @Override
    public void viewReportedItems() {
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }

    @Override
    public void displayAppMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilihan: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> reportItem();
                case 2 -> viewReportedItems();
            }
        } while (choice != 0);
    }
}
