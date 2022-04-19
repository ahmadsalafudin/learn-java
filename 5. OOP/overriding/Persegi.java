package pertemuan4.overriding;

/**
 *
 * @author ahmad
 */

public class Persegi extends BangunDatar {

    float s;

    @Override
    float luas() {
        float luas = s * s;
        System.out.println("Luas Persegi = "+luas);
        return luas;
    }

    @Override
    float keliling() {
        
        
        float keliling = 4 * s;
        System.out.println("Keliling persegi = "+keliling);
        return keliling;
        
    }
    
}
