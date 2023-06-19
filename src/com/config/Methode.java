package com.config;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Methode {

    private static Connection connect;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void getDatabase() {
        MyConfig.connection();
        try {
            String query = "SELECT ID, NAMA, HARGA, JUMLAH FROM `tb_produk` ORDER BY ID DESC";
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("Id") + ". " + resultSet.getString("Nama") + ": Rp."
                        + resultSet.getString("Harga") + " (" + resultSet.getString("Jumlah") + ")");

            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertData() {
        String namaBaru;
        long hargaBaru;
        int jumlahBaru;

        Scanner input = new Scanner(System.in);

        System.out.print("Nama : ");
        namaBaru = input.nextLine();

        System.out.print("Harga : ");
        hargaBaru = input.nextLong();

        System.out.print("Jumlah : ");
        jumlahBaru = input.nextInt();

        MyConfig.connection();
        input.close();

        try {
            String query = "INSERT INTO `tb_produk` (`ID`, `NAMA`, `HARGA`,`JUMLAH`) VALUES (NULL, '"
                    + namaBaru + "', '" + hargaBaru + "', '" + jumlahBaru + "')";
            statement = connect.createStatement();
            statement.executeUpdate(query);
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void editData() {
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        try {
            System.out.println("input untuk mengganti jumlah stok di ID 2 ");
            String query = "UPDATE `tb_produk` SET `Jumlah` = '" + jumlah + "'WHERE `tb_produk`.`ID` = 2;";
            System.out.println("data berhasil diubah");
            statement = connect.createStatement();
            statement.executeUpdate(query);
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        input.close();
    }

    public static void deleteData() {
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        try {
            System.out.println("Input ID berapa yang ingin dihapus ");
            statement = connect.createStatement();
            String sql = "DELETE FROM `tb_produk` WHERE `ID` = " + id + ";";
            statement.executeUpdate(sql);
            System.out.println("Data berhasil dihapus");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        input.close();
    }

}
