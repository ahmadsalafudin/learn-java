package Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class ProjectFungsi {

    /*
    ==================STASIUN=================
    1. Tampil Semua Trainee
        Jika belum ada stsiun maka tampilkan belum ada stasiun
    2. Tambah stasiun
    3. Edit nama Trainee
    4. Hapus Trainee
    5. Keluar
    
     */
    static ArrayList listTrainee = new ArrayList();

    static Scanner input = new Scanner(System.in);
    
    static void showTrainee(){
        System.out.println("========Trainee============");
        System.out.println("1. Tampil Semua Trainee");
        System.out.println("2. Tambah Trainee");
        System.out.println("3. Edit nama Trainee");
        System.out.println("4. Hapus data Trainee");
        System.out.println("5. Keluar");

        System.out.println("Pilih Menu : ");
        int pilihTrainee = input.nextInt();

        switch (pilihTrainee) {
            case 1:
                tampilTrainee();
                break;
            case 2:
                tambahTrainee();
                break;
            case 3:
                editTrainee();
                break;
            case 4:
                hapusTrainee();
                break;
            case 5:
                keluar();
            default:
                System.out.println("Pilihan anda tidak ada");
                System.out.println("Silahkan pilih menu yg benar");
        }

    }

    private static void tampilTrainee() {
        if (listTrainee.isEmpty()) {
            System.out.println("Belum ada stasiun");
        } else {
            for (int i = 0; i < listTrainee.size(); i++) {
                System.out.println("Trainee ke " + (i+1) + " " + listTrainee.get(i));
            }
        }

    }

    private static void tambahTrainee() {

        //tambah stasiun
        System.out.print("Nama Trainee : ");
        String namaTrainee = input.nextLine();
        listTrainee.add(namaTrainee);
    }

    private static void editTrainee(){
        //edit Trainee
        tampilTrainee();
        System.out.println("Pilih Trainee : ");
        int indexTrainee = input.nextInt();
        System.out.println("Masukan Trainee Baru : ");
        String namaBaru = input.nextLine();

        listTrainee.set(indexTrainee-1, namaBaru);
        System.out.println(" ------------------- ");
        System.out.println(" Data Trainee sudah di update ");
        tampilTrainee();
    }

    private static void hapusTrainee() {
        tampilTrainee();
        System.out.println("Pilih stasiun yang akan dihapus : ");
        String indexTrainee = input.next();
        listTrainee.removeIf(name -> name.equals(indexTrainee));
        tampilTrainee();
    }
    
    private static void keluar() {
        System.out.println("Apakah anda yakin ingin keluar ? y/n");
        String pilih = input.next();
        switch(pilih){
            case "y":
                System.exit(0);
                break;
            case "n":
                showTrainee();
                break;
            default :
                System.out.println("Silahkan masukan keyword yg benar");
        }
    }

    public static void main(String[] args) {
        boolean run = true;
        do {
            showTrainee();
        } while (run);
        
    }

}
