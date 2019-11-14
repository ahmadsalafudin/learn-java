package DAO.dao2.view;

import java.sql.SQLException;
import java.util.Scanner;
import DAO.dao2.config.DatabaseDatasource;
import DAO.dao2.model.Mahasiswa;
import DAO.dao2.services.MahasiswaServices;

/**
 *
 * @author ardianto
 */
public class ViewMahasiswa {
    
    static Scanner sc = new Scanner(System.in);
    
    public void showMenu() throws SQLException {
        ViewMahasiswa vm = new ViewMahasiswa();
        System.out.println("-------------- Menu Mahasiswa --------------");
        System.out.println("1. Tampil Semua Data");
        System.out.println("2. Tambah Data");
        System.out.println("3. Tampil Data berdasarkan Nim");
        System.out.println("4. Ubah Data");
        System.out.println("5. Hapus Data");
        System.out.println("6. Keluar");
        
        int pilihMenu = sc.nextInt();
        sc.nextLine();
        
        switch (pilihMenu) {
            case 1:
                tampilSemuaData();
                break;
            case 2:
                simpan();
                break;
            case 3:
                tampilData();
                break;
            case 4:
                ubah();
                break;
            case 5:
                hapus();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Masukkan pilihan yang benar");
            
        }
        
    }
    
    public void tampilSemuaData() throws SQLException {
        DatabaseDatasource mysql = new DatabaseDatasource();
        MahasiswaServices ms = new MahasiswaServices();
        ms.setDataSource(mysql.getMysqlDataSource());
        Mahasiswa mhs = new Mahasiswa();
        
        System.out.println("DATA MAHASISWA");
        System.out.println("|Nim \t|\t Nama \t|Alamat \t|");
        ms.getPersons();
    }
    
    public void simpan() throws SQLException {
        DatabaseDatasource mysql = new DatabaseDatasource();
        MahasiswaServices ms = new MahasiswaServices();
        ms.setDataSource(mysql.getMysqlDataSource());
        Mahasiswa mhs = new Mahasiswa();
        
        System.out.println(" ---------- Masukkan Data Mahasiswa ------------");
        System.out.print("NIM       : ");
        mhs.setNim(sc.nextLine());
        System.out.print("Nama      : ");
        mhs.setNama(sc.nextLine());
        System.out.print("Alamat    : ");
        mhs.setAlamat(sc.nextLine());
        ms.saveOrUpdateSer(mhs, false);
        System.out.println("Data Berhasil Ditambahkan");
        mysql.closeMysqlConnection();
        showMenu();
    }
    
    public void ubah() throws SQLException {
        DatabaseDatasource mysql = new DatabaseDatasource();
        MahasiswaServices ms = new MahasiswaServices();
        ms.setDataSource(mysql.getMysqlDataSource());
        Mahasiswa mhs = new Mahasiswa();
        
        tampilSemuaData();
        System.out.print("Pilih NIM yang akan diubah : ");
        mhs.setNim(sc.nextLine());
        System.out.print("Masukkan Nama baru    : ");
        mhs.setNama(sc.nextLine());
        System.out.print("Masukkan Alamat baru  : ");
        mhs.setAlamat(sc.nextLine());
        
        ms.saveOrUpdateSer(mhs, true);
        System.out.println("Data Berhasil diubah");
        mysql.closeMysqlConnection();
        ms.getPerson(mhs.getNim());
        showMenu();
    }
    
    public void tampilData() throws SQLException {
        DatabaseDatasource mysql = new DatabaseDatasource();
        MahasiswaServices ms = new MahasiswaServices();
        ms.setDataSource(mysql.getMysqlDataSource());
        Mahasiswa mhs = new Mahasiswa();
        
        System.out.print("Masukkan Nim : ");
        mhs.setNim(sc.nextLine());
        System.out.println("DATA MAHASISWA");
        System.out.println("|Nim \t|\t Nama \t|Alamat \t|");
        ms.getPerson(mhs.getNim());
    }
    
    public void hapus() throws SQLException {
        DatabaseDatasource mysql = new DatabaseDatasource();
        MahasiswaServices ms = new MahasiswaServices();
        ms.setDataSource(mysql.getMysqlDataSource());
        Mahasiswa mhs = new Mahasiswa();
        
        System.out.print("Pilih Nim yang akan dihapus : ");
        mhs.setNim(sc.nextLine());
        ms.delete(mhs);
        mysql.closeMysqlConnection();
        showMenu();
    }
    
}
