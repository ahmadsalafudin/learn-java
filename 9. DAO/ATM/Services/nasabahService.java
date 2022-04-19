/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.ATM.Services;


import javax.sql.DataSource;
import DAO.ATM.Dao.nasabahDao;
import DAO.ATM.Dao.nasabahDaoImpl;
import DAO.ATM.Model.Nasabah;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author dedem
 */
public class nasabahService {
    private nasabahDao nasabahDao;
    
    private Connection connection;
    
    public void setDataSource(DataSource dataSource){
        try {
            connection = dataSource.getConnection();
            nasabahDao = new nasabahDaoImpl() {};
            nasabahDao.setConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Nasabah login(Nasabah nasabah){
        try {
            nasabah = nasabahDao.login(nasabah);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return nasabah;
    }

    
    public Nasabah balance(String id){
        Nasabah nasabah = new Nasabah();
        try{
            nasabah = nasabahDao.balance(id);
        }catch (SQLException e){
            System.out.println("Error Gan "+e.getMessage());
        }
        return nasabah;
    }
    
    public Nasabah takeOrSave(Nasabah nasabah, int saldo, String id, boolean isTake) {
        try {
            //set Autocommit ke False (buat nunggu perintah dulu)
            connection.setAutoCommit(false);
            // kita lakukan saveorUpdatenya
            nasabahDao.takeOrSave(nasabah, saldo, id, isTake);
            //dijalankan
            connection.commit();
            //Kembalikan autocommit ke true
            connection.setAutoCommit(true);

        } catch (SQLException e) {
            // jika comit gagal/error tampilkan pesan dan rollback
            System.out.println("Error saat commit " + e.getMessage());
            try {
                connection.rollback();
                //kalau rollback gagal tampilkan pesan gagalnya
            } catch (SQLException ex) {
                ex.getMessage();
            }
            return nasabah;
        }
        return nasabah;
    }
    
    public Nasabah getPerson(String norek, String norekPengirim){
        Nasabah n = new Nasabah();
        try {
            n = nasabahDao.transfer(norek, norekPengirim);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n;
    }


}
