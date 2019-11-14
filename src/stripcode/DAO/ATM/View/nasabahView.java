/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.ATM.View;

import DAO.ATM.Config.DatabaseDataSource;
import DAO.ATM.Model.Nasabah;
import DAO.ATM.Services.nasabahService;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author dedem
 */
public class nasabahView {

    static Scanner sc = new Scanner(System.in);
    static String norek;
    static String pin;

    public static void showMenu() throws SQLException {
        int menu;
        nasabahView nv = new nasabahView();
        System.out.println("============ Menu Transaksi =============");
        System.out.println("1. Lihat Saldo                           ");
        System.out.println("2. Transfer                              ");
        System.out.println("3. Tarik Tunai                           ");
        System.out.println("4. Setor Tunai                           ");
        System.out.println("5. Keluar                                ");
        System.out.println("=========================================");
        System.out.print("Pilih menu : ");
        menu = sc.nextInt();
        try {

            sc.nextLine();

            switch (menu) {
                case 1:
                    nv.saldo();
                    break;
                case 2:
                    nv.transfer();
                    break;
                case 3:
                    tarik();
                    break;
                case 4:
                    setor();
                    break;
                case 5:
                    nv.keluarMenu();
                    break;
                default:
                    System.out.println("Pilihan menu anda salah ! ");
            }
        } catch (Exception e) {
            System.out.println("terjadi error " + e.getMessage());
        }

    }

    public void keluarMenu() {
        try {
            System.out.print("apakah anda ingin keluar ? ");
            String pilih = sc.nextLine();
            if (pilih.equalsIgnoreCase("y")) {
                System.out.println("terima kasih");

                System.exit(0);
            } else {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saldo() throws SQLException {
        DatabaseDataSource mysql = new DatabaseDataSource();
        nasabahService ns = new nasabahService();
        ns.setDataSource(mysql.getMysqlDataSource());
        Nasabah nsb = new Nasabah();

        System.out.println();
        System.out.println("===========================");
        System.out.println("=== SALDO ANDA SAAT INI ===");
        ns.balance(norek);
        System.out.println("===========================");
        System.out.println();
    }
    
    public void transfer() throws SQLException{
        DatabaseDataSource mysql = new DatabaseDataSource();
        nasabahService ns = new nasabahService();
        ns.setDataSource(mysql.getMysqlDataSource());
        Nasabah n = new Nasabah();
        
        System.out.println("=========================================");
        System.out.print("Masukkan Nomor Rekening Tujuan : ");
        String norek1 = sc.nextLine();
        
        
        ns.getPerson(norek1, norek);
        
        mysql.closeMysqlConnection();
        login();
        
        
    }


    public static void login() throws SQLException {
        DatabaseDataSource mysql = new DatabaseDataSource();
        nasabahService ns = new nasabahService();
        ns.setDataSource(mysql.getMysqlDataSource());

        Nasabah nasabah = new Nasabah();
        System.out.println("=========================================");
        System.out.println("------ Selamat Datang DI Bank BAT -------");
        System.out.println("=========================================");
        System.out.print("Masukkan No rekening : ");
        String rek = sc.nextLine();
        nasabah.setNorek(rek);
        System.out.print("Masukkan Pin anda    : ");
        String pn = sc.nextLine();
        nasabah.setPin(pn);
        System.out.println("=========================================");

        ns.login(nasabah);

        if (rek.equalsIgnoreCase(nasabah.getNorek()) && pn.equalsIgnoreCase(nasabah.getPin())) {
            System.out.println();
            System.out.println("------------ Hello Nasabah --------------");
            norek = rek;
            pin = pn;
            showMenu();
        } else {
            System.out.println("Akun Tidak Ditemukan !!!! ");
            login();
        }

    }
    
    static void setor(){
        DatabaseDataSource mysql = new DatabaseDataSource();
        nasabahService ns = new nasabahService();
        ns.setDataSource(mysql.getMysqlDataSource());
        Nasabah nsb = new Nasabah();
        
        System.out.println("=================================================");
        System.out.println("--------------- SETOR TUNAI ---------------------");
        System.out.println("=================================================");
        System.out.println("Masukkan jumlah yang ingin disetor : ");
        System.out.println("1. 100.000 \t\t\t 3. 500.000");
        System.out.println("2. 200.000 \t\t\t 4. 1.000.000");
        System.out.println("5. Jumlah lainnya");
        System.out.println("Masukkan pilihan >> ");
        int pilihan = sc.nextInt();
        sc.nextLine();
        
        
        switch (pilihan) {
            case 1:
                ns.takeOrSave(nsb, 100000, norek, false);
                System.out.println("Berhasil");
                break;
            case 2:
                ns.takeOrSave(nsb, 200000, norek, false);
                System.out.println("Berhasil");
                break;
            case 3:
                ns.takeOrSave(nsb, 500000, norek, false);
                System.out.println("Berhasil");
                break;
            case 4:
                ns.takeOrSave(nsb, 1000000, norek, false);
                System.out.println("Berhasil");
                break;
            case 5:
                System.out.println("Masukkan jumlah uang >> ");
                int jumlah = sc.nextInt();
                sc.nextLine();
                ns.takeOrSave(nsb, jumlah, norek, false);
                System.out.println("Berhasil");
                break;
            default:
                System.out.println("Masukan salah ");
                break;
        }
            mysql.closeMysqlConnection();
        }
        
    static void tarik(){
        DatabaseDataSource mysql = new DatabaseDataSource();
        nasabahService ns = new nasabahService();
        ns.setDataSource(mysql.getMysqlDataSource());
        Nasabah nsb = new Nasabah();
        
        System.out.println("================================================");
        System.out.println("---------------- TARIK TUNAI -------------------");
        System.out.println("================================================");
        System.out.println("Masukkan jumlah yang ingin disetor : ");
        System.out.println("1. 100.000 \t\t\t 3. 500.000");
        System.out.println("2. 200.000 \t\t\t 4. 1.000.000");
        System.out.println("5. Jumlah lainnya");
        System.out.println("Masukkan pilihan >> ");
        int pilihan = sc.nextInt();
        sc.nextLine();
        
        
        switch (pilihan) {
            case 1:
                ns.takeOrSave(nsb, 100000, norek, true);
                break;
            case 2:
                ns.takeOrSave(nsb, 200000, norek, true);
                break;
            case 3:
                ns.takeOrSave(nsb, 500000, norek, true);
                break;
            case 4:
                ns.takeOrSave(nsb, 1000000, norek, true);
                break;
            case 5:
                System.out.println("Masukkan jumlah uang >> ");
                int jumlah = sc.nextInt();
                sc.nextLine();
                ns.takeOrSave(nsb, jumlah, norek, true);
                break;
            default:
                System.out.println("Masukan salah ");
                break;
        }
            mysql.closeMysqlConnection();
    }


}
