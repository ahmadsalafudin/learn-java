package pertemuan4.mvc.controller;

import pertemuan4.mvc.model.Mahasiswa;
import pertemuan4.mvc.view.ViewMahasiswa;

/**
 *
 * @author ahmad
 */
public class ControllerMahasiswa {
    
    private final Mahasiswa model;
    private final ViewMahasiswa view;
    
    public ControllerMahasiswa(Mahasiswa model, ViewMahasiswa view){
        this.model = model;
        this.view = view;
    }
    
    public void createView(){
        view.inputData();
    }
    
}
