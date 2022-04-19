package pertemuan4.overriding;


/**
 *
 * @author ahmad
 */
public class Main {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        System.out.println("===Superclass=====");
        bd.luas();
        bd.keliling();        
        System.out.println("--------------------");
        Persegi p = new Persegi();
        System.out.println("=====Sub Class persegi======");
        p.s = 10;
        p.luas();
        p.keliling();
        System.out.println("--------------------");
        
        Lingkaran l = new Lingkaran();
        System.out.println("=====Sub Class Lingkaran======");
        l.r = 7;
        l.luas();
        l.keliling();
        
        Kubus k = new Kubus();
        System.out.println("====================");
        k.s = p.s;
        k.luas();
    }
}
