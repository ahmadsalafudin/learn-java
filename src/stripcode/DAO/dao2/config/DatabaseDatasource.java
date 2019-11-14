package DAO.dao2.config;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;

/**
 *
 * @author ardianto
 */
public class DatabaseDatasource {

    private final MysqlDataSource mysqlDataSource;

    public DatabaseDatasource() {
        mysqlDataSource = new MysqlDataSource();
    }

    public MysqlDataSource getMysqlDataSource() {
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("");
        mysqlDataSource.setDatabaseName("mahasiswa");
        mysqlDataSource.setServerName("localhost");
        mysqlDataSource.setPortNumber(3306);
        return mysqlDataSource;
    }

    public void closeMysqlConnection() {
        try {
            mysqlDataSource.getConnection().close();
        } catch (SQLException e) {

        }
    }
}
