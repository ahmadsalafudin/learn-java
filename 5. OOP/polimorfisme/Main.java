
package pertemuan4.polimorfisme;

/**
 *
 * @author ahmad
 */
public class Main {
    public static void main(String[] args) {
        Hewan h = new Hewan();
        h.Nama();
        h.suara();
        h.jalan();
        
        System.out.println("=========");
        
        Kucing k = new Kucing();
        k.Nama();
        k.suara();
        k.jalan();
    }
    
}
