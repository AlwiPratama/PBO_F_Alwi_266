package com.praktikum.main;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Menu Login");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");

            int choice;
            while (true) {
                System.out.print("Masukkan pilihan (1/2): ");
                if (sc.hasNextInt()) {
                    choice = sc.nextInt();
                    sc.nextLine();
                    if (choice == 1 || choice == 2) break;
                } else {
                    sc.nextLine();
                }
                System.out.println("Pilihan tidak valid.");
            }

            User user = null;

            if (choice == 1) {
                user = new Admin("Admin266", "Password266");
                System.out.print("Username: ");
                String username = sc.nextLine();
                System.out.print("Password: ");
                String password = sc.nextLine();
                if (!user.login(username, password)) {
                    System.out.println("Login gagal.");
                    return;
                }
            } else {
                user = new Mahasiswa("AlwiPratama", "202410370110266");
                System.out.print("Nama: ");
                String nama = sc.nextLine();
                System.out.print("NIM: ");
                String nim = sc.nextLine();
                if (!user.login(nama, nim)) {
                    System.out.println("Login gagal.");
                    return;
                }
            }

            user.displayAppMenu();
        }
    }
}
