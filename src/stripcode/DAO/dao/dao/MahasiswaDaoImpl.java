/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.dao.dao;

import java.sql.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DAO.dao.model.Mahasiswa;

/**
 *
 * @author ahmad
 */
public class MahasiswaDaoImpl implements MahasiswaDao {

    private Connection connection;
    private PreparedStatement insertSatement;
    private PreparedStatement updateStatement;
    private PreparedStatement deleteSatement;
    private PreparedStatement getByIdSatement;
    private PreparedStatement getAllSatement;

    private final String INSERT_QUERY = "INSERT INTO mahasiswa VALUES (?, ?, ?)";
    private final String UPDATE_QUERY = "UPDATE mahasiswa SET nama = ?, alamat = ? where nim = ?";
    private final String DELETE_QUERY = "DELETE FROM mahasiswa WHERE nim = ?";
    private final String GET_BY_ID_QUERY = "SELECT * FROM mahasiswa WHERE nim = ?";
    private final String GET_ALL_QUERY = "SELECT * FROM mahasiswa";

    @Override
    public List<Mahasiswa> getAll() throws SQLException {
        List<Mahasiswa> mahasiswa = new ArrayList<>();
        ResultSet rs = getAllSatement.executeQuery();

        while (rs.next()) {
            String nim = rs.getString("nim");
            String nama = rs.getString("nama");
            String alamat = rs.getString("alamat");
            System.out.println("|Nim \t|\t Nama \t|Alamat \t|");
            System.out.println(nim +"\t|\t"+ nama +"\t|"+ alamat+"\t|");
        }
        return mahasiswa;
    }

    @Override
    public Mahasiswa getById(String nim) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mahasiswa saveOrUpdate(Mahasiswa mahasiswa, boolean isUpdate) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mahasiswa delete(Mahasiswa mahasiswa) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setConnection(Connection connection) throws SQLException {
        this.connection = connection;
        getAllSatement = (PreparedStatement) this.connection.prepareStatement(GET_ALL_QUERY);
    }
}
