/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4.overriding;

/**
 *
 * @author ahmad
 */
public class Kubus extends Persegi {

    Persegi p = new Persegi();

    @Override
    float luas() {
        float luas = 6 * (s *s);
        System.out.println("Luas kubus = "+luas);
        return luas;
    }

    @Override
    float keliling() {
        float keliling = 4 * s;
        System.out.println("Keliling persegi = " + keliling);
        return keliling;

    }

}
