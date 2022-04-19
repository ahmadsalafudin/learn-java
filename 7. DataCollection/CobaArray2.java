package DataCollection;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class CobaArray2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] training = new String[9];

        for (int i = 0; i < training.length; i++) {
            System.out.println("Input Nama : ");
            training[i] = input.nextLine();
            System.out.println("Nama Training ke " + i + " " + training[i]);
        }
        System.out.println(Arrays.toString(training));
    }

}
