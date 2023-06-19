package com.config;

import java.util.Scanner;

public class Menu {

    public static void showMenu() {

        MyConfig.connection();

        while (true) {
            System.out.println("--------------------------------- ");
            System.out.println("1. read data");
            System.out.println("2. update data");
            System.out.println("3. edit data");
            System.out.println("4. delete data");
            System.out.println("pilih : 1 / 2 / 3 / 4 : ");
            System.out.println("--------------------------------- ");

            Scanner input = new Scanner(System.in);
            String pilihan = input.next();
            System.out.println("--------------------------------- ");

            switch (pilihan) {
                case "1":
                    Methode.getDatabase();
                    break;
                case "2":
                    Methode.insertData();
                    break;
                case "3":
                    System.out.println("input angka untuk mengganti jumlah stok di ID 2");
                    Methode.editData();
                    break;
                case "4":
                    System.out.println("input ID berapa yang ingin di hapus ");
                    Methode.deleteData();
                    break;
                default:
                    System.out.println("pilihan anda salah, silahkan pilih ulang ");
                    break;
            }
        }

    }
}
