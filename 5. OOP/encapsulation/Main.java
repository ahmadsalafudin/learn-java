package pertemuan4.encapsulation;

/**
 *
 * @author ahmad
 */
public class Main {

    public static void main(String[] args) {
        CobaEncapsulation cb = new CobaEncapsulation();
        CobaEncapsulation cb2 = new CobaEncapsulation();
        CobaEncapsulation cb3 = new CobaEncapsulation();

        //mengisi nilai object 1
        cb.setUsername("admin");
        cb.setPassword(12345);
        //mengisi nilai object 2
        cb2.setUsername("hamzah");
        cb2.setPassword(123452);
        //mengisi nilai object 3
        cb3.setUsername("Sayid");
        cb3.setPassword(123453);

        //cetak
        System.out.println("================================");
        System.out.println("Usename \t : " + cb.getUsername());
        System.out.println("Password \t : " + cb.getPassword());
        //cetak object ke 2
        System.out.println("================================");
        System.out.println("Usename2 \t : " + cb2.getUsername());
        System.out.println("Password2 \t : " + cb2.getPassword());
        //cetak object ke 3
        System.out.println("================================");
        System.out.println("Usename3 \t : " + cb3.getUsername());
        System.out.println("Password3 \t : " + cb3.getPassword());
    }
}
