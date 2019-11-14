/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author ahmad
 */
public class CobaCLassMobil {

    // buat attribut
    int bbm = 0;
    int kecepatan = 0;

    // Method atau prilaku
    // Kecepatan < 20
    // Boleh belok
    protected void belok() {
        if (kecepatan < 20) {
            System.out.println("Silahkan Belok");
        } else {
            System.out.println("Jangan Belok Takut Nyungsruk");
        }
    }

    // Method Maju Kencang
    // kalau BBM > 10 kecepatan > 80 maka noleh maju kencang
    public void majuKencang() {
        if (bbm > 10 || kecepatan > 80) {
            System.out.println("Boleh maju kencang");
        } else {
            System.out.println("Jangan kencang-kencang bensin mau habis");
        }
    }

    // Method Matikan Mesin
    // Kalau bensin < 1
    // Kecepatannya < 1
    // Buat Scannernya di class Main
    protected void matikanMesin() {
        if (bbm < 1 || kecepatan < 1) {
            System.out.println("Matikan Mesin");
        } else {
            System.out.println("Masih bisa jalan");
        }
    }

    public static void main(String[] args) {
        CobaCLassMobil cb = new CobaCLassMobil();
        cb.belok();
    }

}
