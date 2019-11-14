package DAO;

// import bumbu-bumbu yang diperlukan
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class CobaJdbcShowData {

    // Menyiapkan paramter JDBC untuk koneksi ke datbase
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/batm";
    static final String USER = "root";
    static final String PASS = "";

    // Menyiapkan objek yang diperlukan untuk mengelola database
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public static void showData() {
        // Melakukan koneksi ke database
        // harus dibungkus dalam blok try/catch
        try {
            // register driver yang akan dipakai
            Class.forName(JDBC_DRIVER);

            // buat koneksi ke database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            // buat objek statement
            stmt = conn.createStatement();

            // fungsi untuk menampilkan data
            String sql = "SELECT * FROM trainee";

            // eksekusi query dan simpan hasilnya di obj ResultSet
            rs = stmt.executeQuery(sql);

            // tampilkan hasil query
            /*
            while (rs.next()) {
                System.out.println(rs.getInt("id");
                System.out.println(rs.getString("nama");
                System.out.println(rs.getString("alamat"));
            }
             */
            System.out.println("=====================================================================================");
            System.out.println("No | Nama \t Alamat \t tgl_lahir \t jk     status \t   batch \t  kampus \t");
            System.out.println("=====================================================================================");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " \t"
                        + rs.getString("nama") + " \t"
                        + rs.getString("alamat") + " \t"
                        + rs.getString("tgl_lahir") + " \t"
                        + rs.getString("jk") + "  "
                        + rs.getString("status") + " \t"                        
                        + rs.getString("batch") + " \t"
                        + rs.getString("kampus") + " \t");

            }
            System.out.println("======================================================================================");

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        showData();
    }

}
