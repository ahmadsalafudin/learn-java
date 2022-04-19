package pertemuan6.DAO.Dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import pertemuan6.DAO.Model.Training;

/**
 *
 * @author ahmad
 */
public interface TrainingDAO {
    
    public Training getId(String nohp) throws SQLException;
    public void setKoneksi (Connection connect)throws SQLException;
    public List<Training> getAll()throws SQLException;
    public Training saveOrUpdate(Training training, boolean action) throws SQLException;
    
}
