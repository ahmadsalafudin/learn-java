package looping;

/**
 *
 * @author ahmad
 */
public class CobaDoWhile {

    public static void main(String[] args) {
        //do
        // aksi
        // while (kondisi)
        int a = 0;
        boolean kondisi = true;

        do {
            a++;
            System.out.println("Do while ke - " + a);
            
            if (a == 2) {
                kondisi = false;
            }
            
        } while (kondisi);

    }

}
