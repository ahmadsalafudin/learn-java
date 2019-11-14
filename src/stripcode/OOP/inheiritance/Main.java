package pertemuan4.inheiritance;

/**
 *
 * @author ahmad
 */
public class Main {

    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        System.out.println("Class induk");
        bd.luas();
        bd.keliling();
        System.out.println("============");
        
        Lingkaran l = new Lingkaran();
        System.out.println("Class child - lingkaran");
        l.luas();
        l.keliling();
        System.out.println("============");
        
        Persegi p = new Persegi();
        System.out.println("Class child - Persegi");
        p.luas();
        p.keliling();
        System.out.println("============");
    }
}
