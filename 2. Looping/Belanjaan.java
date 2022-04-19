package pertemuan2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class Belanjaan {

    /* punya member ga?? (ya/tidak)
        dapet diskon 5ribu
        belanjanya lebih dari 500000
        dapet diskon belanja 50 rb
        kalo belanja lebih dari 300rb
        dapet diskon belanja 30 rb
        belanja 100 - 300 rbu
        dapet diskon 10 rb
     ga punya member gak dapet diskon
        belanjanya lebih dari 500000
        dapet diskon belanja 35 rb
        kalo belanja lebih dari 300
        dapet diskon belanja 15 rb
        belanja 100 - 300 rbu
        dapet diskon 5 rb
    
    
    mau infak ga?
    kembalian - jumlah infak
    
     */
    public static void main(String[] args) {

        double belanja, diskon = 0, bayar;
        String member, infak;

        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

       
            Scanner input = new Scanner(System.in);
            System.out.print("Masukan nilai belanjaan \t : ");
            belanja = input.nextInt();
            System.out.print("Punya member ga ? (ya/tidak) \t : ");
            member = input.next();

            if (member.equalsIgnoreCase("ya")) {
                diskon = 5000;
                System.out.println("Anda mendapat diskon kartu 5rb");
                if (belanja >= 500000) {
                    diskon += 50000;
                    System.out.println(" Anda Mendapat diskon 50ribu");

                } else if (belanja >= 300000 && belanja < 500000) {
                    diskon += 30000;
                    System.out.println("Anda mendapat diskon 30rb");
                } else if (belanja >= 100000 && belanja < 300000) {
                    diskon += 10000;
                    System.out.println("Anda mendapat diskon 10rb");
                } else {
                    diskon += 0;
                    System.out.println("Anda tidak dapat diskon belanjaan");
                }

                bayar = belanja - diskon;
                System.out.print("Total Bayar: " + kursIndonesia.format(bayar));

                System.out.print("Apakah mau infak minimal 2rb ? \t ");
                infak = input.next();
                if (infak.equalsIgnoreCase("ya")) {
                    int nominalInfak = 2000;
                    bayar = belanja - diskon;
                    bayar += nominalInfak;
                    System.out.println("Total Bayar: " + kursIndonesia.format(bayar));
                } else {
                    int nominalInfak = 0;
                    bayar = belanja - diskon;
                    bayar += nominalInfak;
                    System.out.println("Total Bayar: " + kursIndonesia.format(bayar));
                }
            } else if (member.equalsIgnoreCase("tidak")) {
                diskon = 0;
                System.out.println("Anda tidak mendapat diskon member");
                if (belanja >= 500000) {
                    diskon += 35000;
                    System.out.println(" Anda Mendapat diskon 35ribu");
                } else if (belanja >= 300000 && belanja < 500000) {
                    diskon += 15000;
                    System.out.println("Anda mendapat diskon 30rb");
                } else if (belanja >= 100000 && belanja < 300000) {
                    diskon += 5000;
                    System.out.println("Anda mendapat diskon 5rb");
                } else {
                    diskon += 0;
                    System.out.println("Anda tidak dapat diskon belanjaan");
                }
                bayar = belanja - diskon;
                System.out.print("Total Bayar: " + kursIndonesia.format(bayar));
                System.out.print("Apakah mau infak minimal 2rb ? \t ");
                infak = input.next();
                if (infak.equalsIgnoreCase("ya")) {
                    int nominalInfak = 2000;
                    bayar = belanja - diskon;
                    bayar += nominalInfak;
                    System.out.println("Total Bayar: " + kursIndonesia.format(bayar));
                } else {
                    int nominalInfak = 0;
                    bayar = belanja - diskon;
                    bayar += nominalInfak;
                    System.out.println("Total Bayar: " + kursIndonesia.format(bayar));
                }

            } else {
                System.out.println("Inputan tidak sesuai");

            }

    }

}
