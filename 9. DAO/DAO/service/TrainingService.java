package pertemuan6.DAO.service;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import pertemuan6.DAO.Dao.TrainingDAO;
import pertemuan6.DAO.Dao.TrainingDAOImpl;
import pertemuan6.DAO.Model.Training;

/**
 *
 * @author ahmad
 */
public class TrainingService {

    private final TrainingDAO tao;
    private final Connection conn;

    public TrainingService(SQLServerDataSource sQLServerDataSource) throws SQLException {
        this.conn = sQLServerDataSource.getConnection();
        tao = new TrainingDAOImpl();
        tao.setKoneksi(conn);
    }

    public List<Training> getTraining() throws SQLException {
        return tao.getAll();
    }

    public Training getId(String nohp) throws SQLException {
        Training tr = new Training();
        try {
            tr = tao.getId(nohp);

           // System.out.println(tr.getNama());
        } catch (SQLException e) {
            e.getMessage();
            System.out.println("koneksi gagal");
        }

        return tr;
    }

    public Training save(Training training, boolean action) {
        try {
            conn.setAutoCommit(false);
            tao.saveOrUpdate(training, action);
            conn.commit();
            conn.setAutoCommit(true);
        } catch (SQLException e) {
            System.out.println("koneksi gagal" + e.getMessage());
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.getMessage();
                System.out.println("koneksi gagal");
            }
            return training;
        }
        return training;
    }

}
