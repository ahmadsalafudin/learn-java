package pertemuan6.DAO.Controller;

import java.sql.SQLException;
import pertemuan6.DAO.view.TrainingView;

/**
 *
 * @author ahmad
 */
public class ControllerTraining {

    private final TrainingView tv;

    public ControllerTraining(TrainingView tv) {
        this.tv = tv;
    }

    public void tampil() throws SQLException {
        tv.tampilData();
    }

    public void tambah() throws SQLException {
        tv.tambahData();
    }
    
    public void edit() throws SQLException {
        tv.editData();
    }
     public void getOne() throws SQLException {
        tv.tampil();
    }

}
