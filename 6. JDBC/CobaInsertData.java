package DAO;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class CobaInsertData {

    // Menyiapkan paramter JDBC untuk koneksi ke datbase
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/batm";
    static final String USER = "root";
    static final String PASS = "";

    // Menyiapkan objek yang diperlukan untuk mengelola database
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public static void main(String[] args) {

        try {

            // register driver yang akan dipakai
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            // fungsi untuk menampilkan data
            String sql = "INSERT INTO training (nama, alamat) VALUE('Salafudin','Bekasi')";

            // eksekusi query dan simpan hasilnya di obj ResultSet
            
            stmt.execute(sql);
            
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
