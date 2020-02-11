package pertemuan6.DAO.koneksi;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.SQLException;

/**
 *
 * @author ahmad
 */
public class DatabaseKoneksi {

    private final SQLServerDataSource sqlSource;
   // private final MysqlDataSource mysqlDataSource;

    //constructor
    public DatabaseKoneksi() {
        sqlSource = new SQLServerDataSource();
    }

    //open koneksi
    public SQLServerDataSource getSQLServerDataSource() {
        sqlSource.setUser("sa");
        sqlSource.setPassword("12345");
        sqlSource.setDatabaseName("Test");
        sqlSource.setServerName("localhost");
        sqlSource.setPortNumber(1433);

        return sqlSource;

    }

    //close koneksi
    public void closeDataSource() throws SQLException {
        try {
            sqlSource.getConnection().close();
        } catch (SQLException e){
            e.getMessage();
        }
    }

}
