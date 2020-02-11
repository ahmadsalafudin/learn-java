package pertemuan6.DAO.runner;

import java.sql.SQLException;
import pertemuan6.DAO.Controller.ControllerTraining;
import pertemuan6.DAO.view.TrainingView;

/**
 *
 * @author ahmad
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        TrainingView tr = new TrainingView();

        ControllerTraining ct = new ControllerTraining(tr);
        // ct.tambah();
         ct.tampil();
        // ct.edit();
        ct.getOne();
    }

}
