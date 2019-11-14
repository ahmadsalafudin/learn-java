package looping;

/**
 *
 * @author ahmad
 */
public class CobaBilanganPrima {

    public static void main(String[] args) {
        int nilai = 20;
        for (int i = 2; i < nilai; i++) {
            boolean prima = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima == true) {
                System.out.println(i + " adalah bilangan prima");
            }
        }

    }
}
