package Function;

/**
 *
 * @author ahmad
 */
public class FungsiDalamFungsi {

    //luas persegi
    static int luasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;

    }
    //luas kubus
    static int luasPermukaanKubus(int sisi) {
        int luas = 6 * luasPersegi(sisi);
        return luas;
    }
    //luas lingkaran
    
    //luas tabung
    
    public static void main(String[] args) {
        
        System.out.println(luasPermukaanKubus(10));
    }

}
