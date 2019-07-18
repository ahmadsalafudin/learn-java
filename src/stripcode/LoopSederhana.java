package stripcode;

import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class LoopSederhana {

    public static void main(String[] args) {

        // program untuk menjumlahkan angka dengan rentang
        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;

        while (nilaiAwal <= nilaiAkhir) {
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }

        // tugas -> for loop, do while...
    }
	
	
        int i = 0;

        while (i <= 10) {
            // blok kode yang akan diulang
            System.out.println("Perulangan ke-" + i);

            // increment nilai i
            i++;
        }
    }

}
