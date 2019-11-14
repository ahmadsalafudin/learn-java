package DAO.dao.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import DAO.dao.model.Mahasiswa;
import DAO.dao.dao.MahasiswaDao;
import DAO.dao.dao.MahasiswaDaoImpl;

/**
 *
 * @author ahmad
 */
public class MahasiswaServices {

    private MahasiswaDao mahasiswaDao;
    private Connection connection;

    public void setDataSource(DataSource dataSource) {
        try {
            connection = dataSource.getConnection();
            mahasiswaDao = new MahasiswaDaoImpl();
            mahasiswaDao.setConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Mahasiswa> getPersons() {
        try {
            return mahasiswaDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<Mahasiswa>();
    }
}
