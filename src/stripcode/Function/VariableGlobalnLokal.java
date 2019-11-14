package Function;

/**
 *
 * @author ahmad
 */
public class VariableGlobalnLokal {

    //variable global
    static String nama = "Hamzah";
    static String jk  = "Laki-Laki";

    static void trainingBatm() {
        //variable lokal => cuma bisa diakses didalem aja
        String nama1 = "Desi";
        String jk1 = "Perempuan";

        System.out.println("Nama \t : " + nama);
        System.out.println("Nama \t : " + jk);
    }

    public static void main(String[] args) {
        trainingBatm();
        
        
        System.out.println("================");
        System.out.println("Nama \t : " + nama);
        System.out.println("Nama \t : " + jk);
    }

}
