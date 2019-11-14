package pertemuan4.overriding;
/**
 *
 * @author ahmad
 */

public class Lingkaran extends BangunDatar {

    float r;

    @Override
    float luas() {
        float luas = (float) (Math.PI * Math.pow(r, 2));
        System.out.println("Luas Lingkaran = "+luas);
        return luas;
    }
    
    @Override
    float keliling(){
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran = "+keliling);
        return keliling;
    }
    
    

}
