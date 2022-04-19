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
public class LatihanLuasLingkaran {
     public static void main(String[] args) {
        double phi = 3.14;
        int r;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Nilai jari-jari = ");
        r = scan.nextInt();
        
        double luas = (double) (phi * r * r);

        System.out.println("Luas Lingkaran nya adlah = " + luas);
    }
    
}
