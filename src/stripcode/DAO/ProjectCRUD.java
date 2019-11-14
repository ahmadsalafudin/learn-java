package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class ProjectCRUD {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/batm";
    static final String USER = "root";
    static final String PASS = "";

    // Siapin object yang diperlukan buat untuk mengelola database
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    static Scanner input = new Scanner(System.in);
    static boolean run;

    // tampil menu
    static void listTrainee() {
        System.out.println("================ Menu Trainee ===============");
        System.out.println("1. Tampil Semua Data training               |");
        System.out.println("2. Tambah Data Training                     |");
        System.out.println("3. Edit Data Traing                         |");
        System.out.println("4. Hapus Data training                      |");
        System.out.println("5. Keluar                                   |");
        System.out.println("=============================================");

        System.out.print("Pilih menu : ");
        int pilih = input.nextInt();
        input.nextLine();
        switch (pilih) {
            case 1:
                tampilData();
                break;
            case 2:
                tambahData();
                break;
            case 3:
                editData();
                break;
            case 4:
                hapusData();
                break;
            case 5:
                keluar();
                break;
            default:
                System.out.println("pilihan anda tidak ada");
                System.out.println("Silahkan pilih menu yg benar");
        }

    }

    public static void koneksi() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
        } catch (Exception e) {
            System.out.println("Eror Koneksi : " + e.getMessage());
        }
    }

    public static void tampilData() {

        try {
            // registrasi dirver yang akan dipakai
            koneksi();
            // buat query
            String sql = "SELECT * FROM trainee";

            // eksekusi query dan simpan hasil kedalam object rs
            rs = stmt.executeQuery(sql);
// tampilkan hasil query
            System.out.println("============================================================= Trainee Batch 7 ==========================================================");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Id \t Nama \t\t Alamat \t Tanggal Lahir \t Jenis Kelamin \t Status \t Jenis Kelamin \t Asal Kampus \t");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " "
                        + rs.getString("nama") + " \t\t"
                        + rs.getDate("alamat") + "\t"
                        + rs.getString("tgl_lahir") + "\t"
                        + rs.getString("jk") + "\t"
                        + rs.getString("status") + "\t"
                        + rs.getString("batch") + "\t"
                        + rs.getString("kampus") + "\t"
                );

            }
            System.out.println("=======================================================================================================================================");

        } catch (Exception e) {
            System.out.println("Eror bos : " + e.getMessage());
        }
    }

    public static void tampilData(String id) {

        try {
            // registrasi dirver yang akan dipakai
            koneksi();
            // buat query
            String sql = "SELECT * FROM trainee WHERE ID = '" + id + "'";

            // eksekusi query dan simpan hasil kedalam object rs
            rs = stmt.executeQuery(sql);

            // tampilkan hasil query
            System.out.println("============================================================= Trainee Batch 7 ==========================================================");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Id \t Nama \t\t Alamat \t Tanggal Lahir \t Jenis Kelamin \t Status \t Jenis Kelamin \t Asal Kampus \t");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " "
                        + rs.getString("nama") + " \t\t"
                        + rs.getDate("alamat") + "\t"
                        + rs.getString("tgl_lahir") + "\t"
                        + rs.getString("jk") + "\t"
                        + rs.getString("status") + "\t"
                        + rs.getString("batch") + "\t"
                        + rs.getString("kampus") + "\t"
                );

            }
            System.out.println("=======================================================================================================================================");

            // tutup statament dan koneksi
        } catch (Exception e) {
            System.out.println("Eror bos : " + e.getMessage());
        }
    }

    private static void tambahData() {
        try {
            koneksi();

            System.out.print("Masukkan Nama             : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Alamat           : ");
            String alamat = input.nextLine();
            System.out.print("Masukkan Tanggal Lahir     : ");
            String ttl = input.nextLine();
            System.out.print("Masukkan Jenis Kelamin     : ");
            String jk = input.nextLine();
            System.out.print("Masukkan Status           : ");
            String status = input.nextLine();
            System.out.print("Masukkan Batch             : ");
            int batch = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan Asal Kampus       : ");
            String kampus = input.nextLine();
            // buat query
            String sql = "INSERT INTO trainee (nama,alamat, tgl_lahir, jk, status, batch, kampus) "
                    + "VALUES ('" + nama + "', '" + alamat + "', '" + ttl + "', '"
                    + jk + "', '" + status + "', '" + batch + "','" + kampus + "')";

            // eksekusi query dan simpan hasil kedalam object rs
            stmt.execute(sql);
            System.out.println("Data Berhasil Ditambahkan");
            // tampilkan hasil query
            tampilData();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menambahkan data : " + e.getMessage());
        }
    }

    private static void editData() {
        try {
            tampilData();
            System.out.print("Pilih Id yang akan diubah : ");
            String id_edit = input.nextLine();
            System.out.println("\n 1.Nama \n 2.Alamat \n 3.Tanggal Lahir"
                    + " \n 4.Jenis Kelamin \n 5.Status \n 6.Batch \n 7. Asal Kampus");
            System.out.print("Pilih field yang akan diubah : ");
            int field = input.nextInt();
            //utk enter
            input.nextLine();
            //buat array untuk menampung data yg akan di edit
            String pilihan[] = {"nama", "alamat", "tgl_lahir", "jk", "status", "batch", "kampus"};

            System.out.print("Masukkan " + pilihan[(field - 1)] + " Baru           : ");
            String field_baru = input.nextLine();

            // buat query
            String update = "UPDATE trainee SET " + pilihan[(field - 1)] + " = '" + field_baru + "' WHERE id = " + id_edit;

            // eksekusi query dan simpan hasil kedalam object rs
            stmt.execute(update);
            System.out.println("Data Berhasil Diubah");
            // tampilkan hasil query
            tampilData(id_edit);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menambahkan data : " + e.getMessage());
        }
    }

    private static void hapusData() {
        try {
            tampilData();
            System.out.print("Pilih Id yang akan diapus : ");
            String id_dell = input.nextLine();
            // buat query
            String hapus = "DELETE FROM trainee WHERE id = " + id_dell;

            // eksekusi query dan simpan hasil kedalam object rs
            stmt.execute(hapus);
            System.out.println("Data Berhasil Dihapus");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menambahkan data : " + e.getMessage());
        }
    }

    private static void keluar() {
        System.out.println("Yakin ada akan keluar ? ");
        String jawaban = input.nextLine();
        if (jawaban.equalsIgnoreCase("ya")) {
            System.out.println("Terimakasih silahkan segera pergi");
            System.exit(0);
        } else {
            listTrainee();
        }
    }

    public static void main(String[] args) {
        run = true;
        do {
            listTrainee();
        } while (run);
    }
}
