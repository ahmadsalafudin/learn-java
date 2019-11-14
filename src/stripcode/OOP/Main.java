package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class Main {

    public static void main(String[] args) {
        CobaCLassMobil cb = new CobaCLassMobil();

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan BBM : ");
        cb.bbm = sc.nextInt();
        System.out.println("Masukkan Kecepatan : ");
        cb.kecepatan = sc.nextInt();
       
        cb.belok();
        cb.matikanMesin();
    }
}