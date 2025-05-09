package com.praktikum.users;

import java.util.Scanner;
import com.praktikum.actions.AdminActions;

public class Admin extends User implements AdminActions {
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
    public void manageItems() {
        System.out.println(">> Fitur Kelola Barang Belum Tersedia <<");
    }

    @Override
    public void manageUsers() {
        System.out.println(">> Fitur Kelola Mahasiswa Belum Tersedia <<");
    }

    @Override
    public void displayAppMenu() {
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("\n1. Kelola Laporan Barang");
                System.out.println("2. Kelola Data Mahasiswa");
                System.out.println("0. Logout");
                System.out.print("Pilihan: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 -> manageItems();
                    case 2 -> manageUsers();
                }
            } while (choice != 0);
        }
    }
}
