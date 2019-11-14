/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.dao2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DAO.dao2.model.Jabatan;

/**
 *
 * @author ahmad
 */
public class JabatanDaoImpl implements JabatanDao {

    private Connection connection;
    private PreparedStatement insertStatement;
    private PreparedStatement updateStatement;
    private PreparedStatement deleteStatement;
    private PreparedStatement getByIdStatement;
    private PreparedStatement getAllStatement;

    private final String INSERT_QUERY = "INSERT INTO jabatan(nim,nama,alamat) VALUES (?, ?, ?)";
    private final String UPDATE_QUERY = "UPDATE jabatan SET nama = ?, alamat = ? where nim = ?";
    private final String DELETE_QUERY = "DELETE FROM jabatan WHERE nim = ?";
    private final String GET_BY_ID_QUERY = "SELECT * FROM jabatan WHERE nim = ?";
    private final String GET_ALL_QUERY = "SELECT * FROM jabatan";

    @Override
    public List<Jabatan> getAll() throws SQLException {
        List<Jabatan> jabatan = new ArrayList<>();
        ResultSet rs = getAllStatement.executeQuery();

        while (rs.next()) {
            int kj = rs.getInt("kj");
            String jbtan = rs.getString("jabatan");
            int gaji = rs.getInt("gaji");
            System.out.println(kj + "\t|\t" + jbtan + "\t|" + gaji + "\t|");
        }
        return jabatan;
    }

    @Override
    public Jabatan getById(int kj) throws SQLException {
        getByIdStatement.setInt(1, kj);
        ResultSet rs = getByIdStatement.executeQuery();

        if (rs.next()) {
            Jabatan jabatan = new Jabatan();
            jabatan.setKj(rs.getInt("kj"));
            jabatan.setJabatan(rs.getString("jabatan"));
            jabatan.setGaji(rs.getInt("gaji"));
            System.out.println(kj + "\t|\t" + jabatan.getJabatan() + "\t|" + jabatan.getGaji() + "\t|");
            return jabatan;
        }
        return null;
    }

    @Override
    public Jabatan saveOrUpdate(Jabatan jabatan, boolean isUpdate) throws SQLException {
        // Cek untuk update atau insert
        if (!isUpdate) {
            insertStatement.setInt(1, jabatan.getKj());
            insertStatement.setString(2, jabatan.getJabatan());
            insertStatement.setInt(3, jabatan.getGaji());
            insertStatement.executeUpdate();
        } else {
            updateStatement.setInt(1, jabatan.getKj());
            updateStatement.setString(2, jabatan.getJabatan());
            updateStatement.setInt(3, jabatan.getGaji());
            updateStatement.executeUpdate();
        }
        return jabatan;
    }

    @Override
    public Jabatan delete(Jabatan jabatan) throws SQLException {
        deleteStatement.setInt(1, jabatan.getKj());
        deleteStatement.executeUpdate();
        return jabatan;
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
