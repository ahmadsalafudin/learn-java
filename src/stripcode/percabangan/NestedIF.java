package percabangan;

/**
 *
 * @author ahmad
 */
public class NestedIF{

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        System.out.println("Start");

        if (a == 4) {
            if (b == 10) {
                System.out.println("Ini adalah aksi dimana a = 5 dan b = 10");
            } else {
                System.out.println("Ini adalah aksi dimana a = 5 bukan 10");
            }
        } else {
            System.out.println("ini adalah aksi dimana a salah");
        }
        
        System.out.println("finish");
    }

}
