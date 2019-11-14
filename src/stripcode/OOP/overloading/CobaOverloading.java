/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4.overloading;

/**
 *
 * @author ahmad
 */
public class CobaOverloading {
    
    public void tambah(){
        int a = 5 , b =10;
        System.out.println("hasilnya = "+(a + b));
        System.out.println("===================");
    }
    
    public void tambah(int a, int b){
        System.out.println("hasilnya = "+(a * b));
        System.out.println("===================");
    }
    
    public void tambah(int x, int y, int z){
        System.out.println("hasilnya = "+(x * y * z));
        System.out.println("===================");
    }
    
    
}
