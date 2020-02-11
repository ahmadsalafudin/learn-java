package pertemuan9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class CobaSP {

    static Statement stm;

    public static void koneksi() throws SQLException {

        try {
            String con = "jdbc:sqlserver://localhost:1433;databaseName=Test;"
                    + "user=sa;"
                    + "password=12345";
            Connection conn = DriverManager.getConnection(con);
            stm = conn.createStatement();

        } catch (SQLException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());

        }
    }

    public static void add() throws SQLException {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("masukan nama : ");
            String nama = in.next();
            System.out.print("masukan alamat : ");
            String alamat = in.next();
            System.out.print("masukan no hp : ");
            String nohp = in.next();
            String SQL = "usp_insertTraining '" + nama + "','" + alamat + "','" + nohp + "'";
            stm.execute(SQL);

        } catch (SQLException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage() + " Koneksi gagal");
        }

    }

    public static void show() throws SQLException {
        try {

            String SQL = "showGajiByName";
            ResultSet rs = stm.executeQuery(SQL);
            while (rs.next()) {
                System.out.println(rs.getString("nama") + " | "
                        + rs.getString("jabatan") + " | "
                        + rs.getInt("gaji"));
            }

        } catch (SQLException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage() + " Koneksi gagal");
        }

    }

    public static void update() throws SQLException {
        try {
            Scanner in = new Scanner(System.in);

            System.out.print("Pilih Nama Yang mau diedit : ");
            String nama = in.next();
            System.out.print("Edit alamat : ");
            String alamat = in.next();
            System.out.print("Edit no hp : ");
            String nohp = in.next();
            String SQL = "usp_updateTraining '" + nama + "','" + alamat + "','" + nohp + "'";
            stm.execute(SQL);

        } catch (SQLException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage() + " Koneksi gagal");
        }

    }

    public static void hapus() throws SQLException {
        try {
            Scanner in = new Scanner(System.in);

            System.out.print("Pilih Nama Yang mau dihapus : ");
            String nama = in.next();
            String SQL = "usp_hapusTraining '" + nama + "'";
            stm.execute(SQL);

        } catch (SQLException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage() + " Koneksi gagal");
        }

    }

    public static void main(String[] args) throws SQLException {
        koneksi();
        //add();
        //show();
       //update();
        show();
        //hapus();
    }
}
