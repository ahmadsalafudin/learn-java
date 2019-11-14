package pertemuan4.mvc.view;

import pertemuan4.mvc.controller.ControllerMahasiswa;
import pertemuan4.mvc.model.Mahasiswa;

/**
 *
 * @author ahmad
 */
public class Main {
    
    public static void main(String[] args) {
        Mahasiswa model = new Mahasiswa();
        ViewMahasiswa view = new ViewMahasiswa();
        
        ControllerMahasiswa conn = new ControllerMahasiswa(model, view);
        conn.createView();
    }
    
}
