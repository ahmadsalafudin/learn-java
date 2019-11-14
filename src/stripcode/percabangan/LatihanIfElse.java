package percabangan;

import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class LatihanIfElse {

    public static void main(String[] args) {
        int bayar = 0, liter;

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan penggunaan air : ");
        liter = scan.nextInt();
        System.out.println("Anda menggunakan air" + liter + "m3");

        if (liter <= 10) {
            bayar = liter * 1000;
        } else if (liter <= 20) {
            bayar = 10 * 1000;
            bayar += (liter - 10) * 1500;
        } else if (liter <= 35) {
            bayar = 10 * 1000;<=
            bayar += 10 * 1500;
            bayar += (liter - 20) * 2000;
        } else if (liter > 35) {
            bayar = 10 * 1000;
            bayar += 10 * 1500;
            bayar += 15 * 2000;
            bayar += (liter - 35) * 3000;
        }

        System.out.println("=========");
        System.out.println("Kamu Harus Bayar : " + "Rp. " + bayar);
    }

}
