package DataCollection;

import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class CobaArrayKelas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Membuat array         index luar | index dalam
        String[][]training = new String[3][3];

        // Isi data ke array
        for (int i = 0; i < training.length; i++) {
            for (int j = 0; j < training[i].length; j++) {
                System.out.print("nama ke " + i + " , " + j + " = ");
                training[i][j] = sc.nextLine();
            }
            System.out.println("--------------");
        }

        // Output
        for (String[] i : training) {
            for (String j : i) {
                System.out.print("\t|\t" + j + " \t|\t");
            }
            System.out.println();
        }
    }

}
