package pertemuan6.DAO.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pertemuan6.DAO.Model.Training;

/**
 *
 * @author ahmad
 */
public class TrainingDAOImpl implements TrainingDAO {

    private Connection connect;
    private PreparedStatement getAll;
    private PreparedStatement insert;
    private PreparedStatement update;
    private PreparedStatement getOne;

    private final String getOneQuery = "select * from training where nohp=?";
    private final String getAllQuery = "select * from training";
    private final String insertQuery = "insert into training values (?,?,?)";
    private final String updateQuery = "update training set nama =?, alamat=? where nohp=?";

    @Override
    public List<Training> getAll() throws SQLException {
        List<Training> tr = new ArrayList<>();
        ResultSet rs = getAll.executeQuery();
        while (rs.next()) {
            //instance training
            Training t = new Training();
            t.setNama(rs.getString("nama"));
            t.setAlamat(rs.getString("alamat"));
            t.setNohp(rs.getString("nohp"));

            tr.add(t);
        }
        return tr;
    }

    @Override
    public void setKoneksi(Connection connect) throws SQLException {
        this.connect = connect;
        getAll = this.connect.prepareStatement(getAllQuery);
        insert = this.connect.prepareStatement(insertQuery);
        update = this.connect.prepareStatement(updateQuery);
        getOne = this.connect.prepareStatement(getOneQuery);

    }

    @Override
    public Training saveOrUpdate(Training training, boolean action) throws SQLException {
        if (action) {
            insert.setString(1, training.getNama());
            insert.setString(2, training.getAlamat());
            insert.setString(3, training.getNohp());
            insert.execute();
        } else {
            update.setString(1, training.getNama());
            update.setString(2, training.getAlamat());
            update.setString(3, training.getNohp());
            update.execute();
        }

        return training;

    }

    @Override
    public Training getId(String nohp) throws SQLException {
        getOne.setString(1, nohp);
        ResultSet rs = getOne.executeQuery();

        if (rs.next()) {
            Training tr = new Training();
            tr.setNohp(rs.getString("nohp"));
            tr.setNama(rs.getString("nama"));
            tr.setAlamat(rs.getString("alamat"));
            //System.out.println(tr.getNama());
            return tr;
        }

        return null;
    }
}
