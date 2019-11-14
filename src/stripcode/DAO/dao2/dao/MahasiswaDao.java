package DAO.dao2.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import DAO.dao2.model.Mahasiswa;

/**
 *
 * @author ardianto
 */
public interface MahasiswaDao {

    public List<Mahasiswa> getAll() throws SQLException;

    public Mahasiswa getById(String nim) throws SQLException;

    public Mahasiswa saveOrUpdate(Mahasiswa mahasiswa, boolean isUpdate) throws SQLException;

    public Mahasiswa delete(Mahasiswa mahasiswa) throws SQLException;

    public void setConnection(Connection connection) throws SQLException;
}
