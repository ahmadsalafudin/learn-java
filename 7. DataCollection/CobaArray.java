package DataCollection;

import java.util.Arrays;
/**
 *
 * @author ahmad
 */
public class CobaArray {

    public static void main(String[] args) {

        String nama1 = "Hamzah";
        String nama2 = "Riyenn";
        String nama3 = "Devie";
        String nama4 = "Niffari";

        System.out.println("nama 1 = " + nama1);
        System.out.println("nama 1 = " + nama2);
        System.out.println("nama 1 = " + nama3);
        System.out.println("nama 1 = " + nama4);
        System.out.println("=================");
        System.out.println();
        // Array adalah variable yg bisa menyimpan banyak data dalam datu variable
        //          index    0        1       2       3
        String[] nama = {"Hamzah", "Riyen", "Devie", "Niffari"};
        System.out.println(nama[0]);
        System.out.println(nama[1]);
        System.out.println(nama[2]);
        System.out.println(nama[3]);
        //nampilin semua isi array
        System.out.println(Arrays.toString(nama));
        System.out.println("=================");
        System.out.println();
        //membuat array tanpa nilai
        String[] nama5 = new String[4];

        nama5[0] = "Hamzah";
        nama5[1] = "Riyen";
        nama5[2] = "Devie";
        nama5[3] = "Niffari";

        System.out.println(Arrays.toString(nama5));

        // looping for untuk memanggil data dari array
        for (int i = 0; i < nama5.length; i++) {
            System.out.println("nama ke " + i + " " + nama5[i]);
        }

        System.out.println("======================");

        //looping for each
        for (String i : nama) {
            System.out.println("Nama = " + i);
        }

        System.out.println("==========================");
        int[] angka = new int[5];
        int [] angka2 = {0, 1, 2, 3, 4};
        System.out.println(angka);
        System.out.println(angka2);

        System.out.println(Arrays.toString(angka2));
        System.out.println(Arrays.toString(angka));

        angka = angka2;
        System.out.println(angka);
        System.out.println(angka2);
        angka[0] = 10;
        System.out.println();
        System.out.println(Arrays.toString(angka2));
        System.out.println(Arrays.toString(angka));
        
        double[] angka3 = new double[5];
        System.out.println(angka3);
        System.out.println(Arrays.toString(angka3));
        
        System.out.println("===========================");      
        
        
        
        System.out.println(Arrays.toString(nama5));
        
    }

}
