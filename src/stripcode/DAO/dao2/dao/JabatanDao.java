/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.dao2.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import DAO.dao2.model.Jabatan;

/**
 *
 * @author ahmad
 */
public interface JabatanDao {

    public List<Jabatan> getAll() throws SQLException;

    public Jabatan getById(int kj) throws SQLException;

    public Jabatan saveOrUpdate(Jabatan jabatan, boolean isUpdate) throws SQLException;

    public Jabatan delete(Jabatan jabatan) throws SQLException;

    public void setConnection(Connection connection) throws SQLException;



}
