/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator;

import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class VariableDataDiri {
     public static void main(String[] args) {
        //Deklarasi
        String nama;
        String alamat;
        int umur;
        char jk;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Namanya siapa sih ? = ");
        nama = scan.nextLine();
        System.out.println("Umurnya Berapa ? = ");
        umur = scan.nextInt();
        alamat = scan.nextLine();
        System.out.println("Alamatnya Dimana ? = ");
        alamat = scan.nextLine();
        System.out.println("Jenis Kelamin ? = ");
        jk = scan.next().charAt(0);
        

        System.out.println("==================");
        System.out.println("Namanya Adalah = " + nama);
        System.out.println("Alamatnya Di " + alamat);
        System.out.println("Umurnya Adalah = " + umur);
        System.out.println("Jenis Kelamin = " + jk);
    }
}
