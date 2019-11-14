/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.dao2.view;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class ViewDashboard {

    static Scanner sc = new Scanner(System.in);

    public void showMenu() throws SQLException {
        ViewMahasiswa vm = new ViewMahasiswa();
        ViewJabatan vj = new ViewJabatan();
        System.out.println("-------------- Menu Mahasiswa --------------");
        System.out.println("1. Menu Mahasiswa");
        System.out.println("2. Menu Jabatan");
        System.out.println("0. Keluar");

        System.out.print("Silahkan pilih menu : ");
        int pilihMenu = sc.nextInt();
        sc.nextLine();

        switch (pilihMenu) {
            case 1:
                vm.showMenu();
                break;
            case 2:
                vj.showMenu();
                break;
           
            case 0:
                System.out.println("Terimakasih");
                System.exit(0);
                break;
            default:
                System.out.println("Masukkan pilihan yang benar");

        }

    }
}
