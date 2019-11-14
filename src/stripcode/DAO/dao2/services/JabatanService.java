package DAO.dao2.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import DAO.dao2.model.Jabatan;
import DAO.dao2.dao.JabatanDao;
import DAO.dao2.dao.JabatanDaoImpl;

/**
 *
 * @author ardianto
 */
public class JabatanService {

    private JabatanDao jabatanDao;
    private Connection connection;

    public void setDataSource(DataSource dataSource) {
        try {
            connection = dataSource.getConnection();
            jabatanDao = new JabatanDaoImpl();
            jabatanDao.setConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Jabatan> getPersons() {
        try {
            return jabatanDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<Jabatan>();
    }

    public Jabatan saveOrUpdate(Jabatan jabatan, boolean isUpdate) {
        try {
            // Set Auto Commit ke False
            connection.setAutoCommit(false);
            // Kita Lakukan saveOrUpdatenya
            jabatanDao.saveOrUpdate(jabatan, isUpdate);
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
            return jabatan;
        }
        return jabatan;
    }

    public Jabatan delete(Jabatan jabatan) {
        try {
            connection.setAutoCommit(false);
            jabatanDao.delete(jabatan);
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            e.getMessage();
        }
        return jabatan;
    }

    public Jabatan getPerson(int kj) {
        Jabatan jabatan = new Jabatan();
        try {
            jabatan = jabatanDao.getById(kj);
        } catch (SQLException e) {
            e.getMessage();
        }
        return jabatan;
    }

}
