package DAO.dao.view;

import java.sql.SQLException;
import java.util.Scanner;
import DAO.dao.config.DatabaseDatasource;
import DAO.dao.model.Mahasiswa;
import DAO.dao.services.MahasiswaServices;

/**
 *
 * @author ahmad
 */
public class ViewMahasiswa {
    static Scanner sc =  new Scanner(System.in);
    
    static void showMenu() throws SQLException {
        ViewMahasiswa vm = new ViewMahasiswa();
        System.out.println("-------------- Menu Mahasiswa --------------");
        System.out.println("1. Tampil Semua Data");
        System.out.println("2. Tambah Data");
        System.out.println("3. Tampil Data berdasarkan Nim");
        System.out.println("4. Ubah Data");
        System.out.println("5. Hapus Data");
        System.out.println("6. Keluar");
        
        int pilihMenu = sc.nextInt();
        
        switch(pilihMenu){
            case 1 :
                vm.tampilSemuaData();
                break;
            case 2 :
                break;
            case 3 :
                break;
            case 4 :
                break;
            case 5 :
                break;
            case 6 :
                break;
            default:
                System.out.println("Masukkan pilihan yang benar");
             
        }
        
    }
    
    
    public  void tampilSemuaData() throws SQLException {
        DatabaseDatasource mysql = new DatabaseDatasource();
        MahasiswaServices ms = new MahasiswaServices();
        ms.setDataSource(mysql.getMysqlDataSource());
        Mahasiswa mhs = new Mahasiswa();
        
        System.out.println("DATA MAHASISWA");
        ms.getPersons();
        
        
    }
}
