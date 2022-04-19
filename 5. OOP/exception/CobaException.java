package pertemuan4.exception;

/**
 *
 * @author ahmad
 */
public class CobaException {

    public static void main(String[] args) {
        try {
            int a = 10;
            System.out.println("Harusnya eror nih "+ a/0);
        } catch (Exception e) {
            //untuk menampilkan error nya
            System.out.println(e.getMessage());
            System.out.println("Terojadi kesalahan");
        } finally {
            System.out.println("lanjut jalan");
    }

    }
}
