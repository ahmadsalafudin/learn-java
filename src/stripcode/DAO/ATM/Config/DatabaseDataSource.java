/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.ATM.Config;

import java.sql.SQLException;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;


/**
 *
 * @author dedem
 */
public class DatabaseDataSource {
    private final MysqlDataSource mysqlDataSource;
    
    public  DatabaseDataSource(){
        mysqlDataSource = new MysqlDataSource();
    }
    
    public MysqlDataSource getMysqlDataSource(){
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("");
        mysqlDataSource.setDatabaseName("project");
        mysqlDataSource.setServerName("localhost");
        mysqlDataSource.setPort(3306);
        
        return mysqlDataSource;
    }
    
    public void closeMysqlConnection(){
        try {
            mysqlDataSource.getConnection().close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
