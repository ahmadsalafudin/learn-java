package DataCollection;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class CobaKtp {

    public static void main(String[] args) {
        ArrayList ktp = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        ktp.add(data);

        System.out.println(ktp.get(2));
        for (int i = 0; i < ktp.size(); i++) {
            System.out.println(ktp.get(i));
        }

    }

}
