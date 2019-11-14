package percabangan;

import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class LatihanNestedIf {

    // if pertama ==> punya kartu member ga?
    // dapet diskon kartu 5k
    // if kedua ==> jika punya kartu belanjanya lebih dari 500000
    // maka dapet diskon 50k
    // kalo belanjanya >= 300rb maka dapet diskon 30k
    // kalo belanjanya 100k - <300k diskonnya 10k
    // 
    // Kalo ga punya kartu ga dapet diskon
    // kalo ga punya kartu belanjanya 500k dapet diskonnya 25k
    // kalo 300k - 500k diskon 10 rb;
    // kalo belanjanya dibawah 300 ga dapet diskon
    
     public static void main(String[] args) {
        
        int belanjaan, bayar, diskon;
        String kartu;

        Scanner scan = new Scanner(System.in);
        System.out.print("Punya Kartu member kah (ya/tidak)? ");
        kartu = scan.next();
        System.out.print("Masukan nilai belanjaan = ");
        belanjaan = scan.nextInt();
        System.out.println("------------------");
        
        // proses
        
        if (kartu.equalsIgnoreCase("ya")) {
            diskon = 5000;
            System.out.println("Anda mendapat diskon  kartu sebesar 5rb");
            if (belanjaan >= 500000) {
                diskon += 50000;
                System.out.println("Anda Mendapat diskon 50rb");
            } else if (belanjaan >=300000 && belanjaan <=500000){
                diskon += 30000;
                System.out.println("Anda Mendapat diskon 30k");
            }else if (belanjaan < 300000 && belanjaan >=100000 ) {
                diskon += 10000;
                System.out.println("Anda Mendapat diskon 10k");
            } else {
                diskon += 0;
                System.out.println("Maaf anda tidak mendapat diskon belanjaan");
            }

        } else {
            diskon = 0;
            System.out.println("Anda tidak mendapat diskon kartu ");
            if (belanjaan >= 500000) {
                diskon += 25000;
                System.out.println("Anda mendapat diskon belanjaan 5rb");
            } else if (belanjaan <500000 && belanjaan <=300000){
                diskon = 10000;
                System.out.println("Anda mendapatkan iskon belanjaan sebesar 10rb");
            } else {
                diskon += 0;
                System.out.println("Anda tidak dapat diskon belanjaan");
            }

        }
        //total yang harus dibayar
        bayar = belanjaan - diskon;

        // output
        System.out.println("-----------------");
        System.out.println("Total Bayar: Rp " + bayar);
    }

}
