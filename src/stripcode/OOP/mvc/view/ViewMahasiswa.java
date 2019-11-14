package pertemuan4.mvc.view;

import pertemuan4.mvc.controller.ControllerMahasiswa;
import pertemuan4.mvc.model.Mahasiswa;
import java.util.Scanner;

/**
 *
 * @author ahmad
 */

public class ViewMahasiswa {
    
    public void inputData(){
        Mahasiswa mhs = new Mahasiswa();
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("===== Masukan Data Mahasiswa====");
        System.out.print("Nama = ");
        mhs.setNama(input.nextLine());
        System.out.print("Nim = ");
        mhs.setNim(input.nextLine());
        System.out.println();
        System.out.print("Umur = ");
        mhs.setUmur(input.nextInt());
        
        
        System.out.println("=====Output======");
        System.out.println("Nama = "+mhs.getNama());
        System.out.println("Nim = "+mhs.getNim());
        System.out.println("Umur = "+mhs.getUmur());
        
        
    }
    
      
    public static void main(String[] args) {
        Mahasiswa model = new Mahasiswa();
        ViewMahasiswa view = new ViewMahasiswa();
        
        ControllerMahasiswa conn = new ControllerMahasiswa(model, view);
        conn.createView();
    }
    
}
