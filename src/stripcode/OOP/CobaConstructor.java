/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author ahmad
 */
public class CobaConstructor {
    private final String nama;
    private final int umur;
    
    public void perkenalan(){
        System.out.println("Nama saya " +nama+" umur saya "+umur+" tahun");
    }
    
    public CobaConstructor(String namaOrang, int umurOrang){
       nama =  namaOrang;
       umur =  umurOrang;
    }
}
