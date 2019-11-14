package Function;

/**
 *
 * @author ahmad
 */
public class CobaProcedure {

    //procedure
    //non static
    void angka(int angka) {
        System.out.println(angka);
    }
    //static
    static void ucap(String ucap) {
        System.out.println(ucap);
    }

    public static void main(String[] args) {
        //instansiasi object untuk fungsi non static
        CobaProcedure cb = new CobaProcedure();
        cb.angka(1233);
        
        //pake static
        ucap("selamat sore");
    }

}
