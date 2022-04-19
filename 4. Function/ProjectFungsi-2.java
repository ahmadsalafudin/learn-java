package pertemuan3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class ProjectFungsi {

    /*
    - Program Training
    
    - 1. Show data training
            - jika datanya kosong tampilkan data kosong
            - jika ada tampilin data tersebut
      2. Add data training
            - data berhasil ditambahkan
            - mau nambah??
                - gak mau (return to home)
                - iya boleh (return to add data)
      3. Edit data training
            - nampilin data trainingnya 
            - berhasil di edit
      4. Delete Data training
            - nampilin data trainingnya 
            - berhasil di hapus
      5. Keluar
            - Mau keluar?
                - iya
                - tidak    
    
     */
    static ArrayList trainee = new ArrayList();
    static Scanner input = new Scanner(System.in);

    static void menuData() {
        System.out.println("-------Program Training-------------");
        System.out.println("1. Show Data Training ");
        System.out.println("2. Add Data Training ");
        System.out.println("3. Edit Data Training ");
        System.out.println("4. Delete Data Training ");
        System.out.println("5. Exit ");

        System.out.print("Pilih Menu (1-5) : ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                showData();
                break;
            case 2:
                addData();
                break;
            case 3:
                editData();
                break;
            case 4:
                deleteData();
                break;
            case 5:
                keluar();
                break;
            default:
                System.out.println("Silahkan Pilih menu yang benar");
        }

    }

    private static void showData() {

        if (trainee.isEmpty()) {
            System.out.println("Belum Ada Data");
        } else {
            for (int i = 0; i < trainee.size(); i++) {
                System.out.println("Trainee ke " + i + ". " + trainee.get(i));
            }
        }
    }

    private static void editData() {
        //edit trainee
        showData();
        System.out.print("Pilih trainee yang mau di edit : ");
        int ind = input.nextInt();
        System.out.println("Masukan Data Baru : ");
        trainee.set(ind, input.next());
        System.out.println("Data trainee berhasil di update");
        System.out.println("-------------------------");
        showData();
    }

    private static void addData() {
        System.out.print("Nama : ");
        String nama = input.next();
        trainee.add(nama);

        System.out.println("Data Berhasil Ditambahkan mau nambah lagi gak ? y/n ");
        boolean tr = true;
        do {
            String pil = input.next();

            if (pil.equalsIgnoreCase("y")) {
                tr = false;
                addData();

            } else if (pil.equalsIgnoreCase("n")) {
                tr = false;
                menuData();
            } else if (!pil.equalsIgnoreCase("y") || !pil.equalsIgnoreCase("n")) {
                System.out.print("Pilih menu yg benar : ");
            }
        } while (tr);

    }

    private static void deleteData() {
        showData();
        System.out.print("Pilih data yang akan dihapus :");
        trainee.remove(input.nextInt());
        System.out.println("Data berhasil dihapus ");
        showData();
    }

    public static void main(String[] args) {
        do {
            menuData();
        } while (true);

    }

    private static void keluar() {
        System.out.println("Apakah anda ingin keluar ? y/n ");
        String in = input.next();
        boolean tr = true;
        do {
            if (in.equalsIgnoreCase("y")) {
                System.exit(0);
            } else if (in.equalsIgnoreCase("n")) {
                tr = false;
                menuData();
            } else if (!in.equalsIgnoreCase("y") || !in.equalsIgnoreCase("n")) {
                System.out.print("Pilih menu yg benar : ");
            }
        } while (tr);
    }

}
