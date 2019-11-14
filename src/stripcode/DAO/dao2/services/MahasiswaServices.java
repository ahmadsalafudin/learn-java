package DAO.dao2.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import DAO.dao2.model.Mahasiswa;
import DAO.dao2.dao.MahasiswaDao;
import DAO.dao2.dao.MahasiswaDaoImpl;

/**
 *
 * @author ardianto
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

    public Mahasiswa saveOrUpdateSer(Mahasiswa mahasiswa, boolean isUpdate) {
        try {
            // Set Auto Commit ke False
            connection.setAutoCommit(false);
            // Kita Lakukan saveOrUpdatenya
            mahasiswaDao.saveOrUpdate(mahasiswa, isUpdate);
            // Dijalankan
            connection.commit();
            // Kembalikan autoCommit ke true
            connection.setAutoCommit(true);

        } catch (SQLException e) {
            // Jika commit gagal/error tampilkan pesan dan roollback
            e.getMessage();
            try {
                connection.rollback();
            }// kalau rollbacknya gagal tampilkan pesan kegagalannya 
            catch (SQLException ex) {
                ex.getMessage();
            }
            return mahasiswa;
        }
        return mahasiswa;
    }

    public Mahasiswa delete(Mahasiswa mahasiswa) {
        try {
            connection.setAutoCommit(false);
            mahasiswaDao.delete(mahasiswa);
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            e.getMessage();
        }
        return mahasiswa;
    }

    public Mahasiswa getPerson(String nim) {
        Mahasiswa mahasiswa = new Mahasiswa();
        try {
            mahasiswa = mahasiswaDao.getById(nim);
        } catch (SQLException e) {
            e.getMessage();
        }
        return mahasiswa;
    }

}
