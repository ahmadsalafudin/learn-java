/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.ATM.Dao;

import DAO.ATM.Model.Nasabah;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author dedem
 */
public interface nasabahDao {
    public Nasabah balance(String id) throws SQLException;
    public Nasabah transfer(String norek, String norekPengirim) throws SQLException;
    public Nasabah takeOrSave(Nasabah nasabah, int saldo, String id, boolean isTake) throws SQLException;
    public Nasabah login(Nasabah nasabah) throws SQLException;
    public void setConnection (Connection connection) throws SQLException;
    
}
