/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4.polimorfisme;

/**
 *
 * @author ahmad
 */
public class Kucing extends Hewan{
    
     @Override
     public void Nama(){
        String nama = "Kucing";
        System.out.println("Namanya "+nama);
    }
    
     @Override
    public void suara(){
        String suara = "Meaw";
        System.out.println("Suaranya "+suara);
    }
    
     @Override
    public void jalan(){
        String jalan = "Lompat-Lompat";
         System.out.println("Jalannya "+jalan);
    }
    
}
