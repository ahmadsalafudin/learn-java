/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.dao2.dao;

import java.sql.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DAO.dao2.model.Mahasiswa;

/**
 *
 * @author ardianto
 */
public class MahasiswaDaoImpl implements MahasiswaDao {

    private Connection connection;
    private PreparedStatement insertStatement;
    private PreparedStatement updateStatement;
    private PreparedStatement deleteStatement;
    private PreparedStatement getByIdStatement;
    private PreparedStatement getAllStatement;

    private final String INSERT_QUERY = "INSERT INTO mahasiswa(nim,nama,alamat) VALUES (?, ?, ?)";
    private final String UPDATE_QUERY = "UPDATE mahasiswa SET nama = ?, alamat = ? where nim = ?";
    private final String DELETE_QUERY = "DELETE FROM mahasiswa WHERE nim = ?";
    private final String GET_BY_ID_QUERY = "SELECT m.nama, j.gaji from mahasiswa m join jabatan j where j.kj = m.kj where nim = ?";
    private final String GET_ALL_QUERY = "SELECT * FROM mahasiswa";

    @Override
    public List<Mahasiswa> getAll() throws SQLException {
        List<Mahasiswa> mahasiswa = new ArrayList<>();
        ResultSet rs = getAllStatement.executeQuery();

        while (rs.next()) {
            String nim = rs.getString("nim");
            String nama = rs.getString("nama");
            String alamat = rs.getString("alamat");
            System.out.println(nim + "\t|\t" + nama + "\t|" + alamat + "\t|");
        }
        return mahasiswa;
    }

    @Override
    public Mahasiswa getById(String nim) throws SQLException {
        getByIdStatement.setString(1, nim);
        ResultSet rs = getByIdStatement.executeQuery();

        if (rs.next()) {
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.setNim(rs.getString("nim"));
            mahasiswa.setNama(rs.getString("nama"));
            mahasiswa.setAlamat(rs.getString("alamat"));
            System.out.println(nim + "\t|\t" + mahasiswa.getNama() + "\t|" + mahasiswa.getAlamat() + "\t|");
            return mahasiswa;
        }
        return null;
    }

    @Override
    public Mahasiswa saveOrUpdate(Mahasiswa mahasiswa, boolean isUpdate) throws SQLException {
        // Cek untuk update atau insert
        if (!isUpdate) {
            insertStatement.setString(1, mahasiswa.getNim());
            insertStatement.setString(2, mahasiswa.getNama());
            insertStatement.setString(3, mahasiswa.getAlamat());
            insertStatement.executeUpdate();
        } else {
            updateStatement.setString(1, mahasiswa.getNama());
            updateStatement.setString(2, mahasiswa.getAlamat());
            updateStatement.setString(3, mahasiswa.getNim());
            updateStatement.executeUpdate();
        }
        return mahasiswa;
    }

    @Override
    public Mahasiswa delete(Mahasiswa mahasiswa) throws SQLException {
        deleteStatement.setString(1, mahasiswa.getNim());
        deleteStatement.executeUpdate();
        return mahasiswa;
    }

    @Override
    public void setConnection(Connection connection) throws SQLException {
        this.connection = connection;
        getAllStatement = (PreparedStatement) this.connection.prepareStatement(GET_ALL_QUERY);
        insertStatement = (PreparedStatement) this.connection.prepareStatement(INSERT_QUERY);
        updateStatement = (PreparedStatement) this.connection.prepareStatement(UPDATE_QUERY);
        deleteStatement = (PreparedStatement) this.connection.prepareStatement(DELETE_QUERY);
        getByIdStatement = (PreparedStatement) this.connection.prepareStatement(GET_BY_ID_QUERY);

    }

}
