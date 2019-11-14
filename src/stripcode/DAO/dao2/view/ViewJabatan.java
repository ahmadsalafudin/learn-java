package DAO.dao2.view;

import java.sql.SQLException;
import java.util.Scanner;
import DAO.dao2.config.DatabaseDatasource;
import DAO.dao2.model.Jabatan;
import DAO.dao2.services.JabatanService;

/**
 *
 * @author ardianto
 */
public class ViewJabatan {
    
    static Scanner sc = new Scanner(System.in);
    
    public void showMenu() throws SQLException {
        ViewJabatan vm = new ViewJabatan();
        System.out.println("-------------- Menu Jabatan --------------");
        System.out.println("1. Tampil Semua Data");
        System.out.println("2. Tambah Data");
        System.out.println("3. Tampil Data berdasarkan KJ");
        System.out.println("4. Ubah Data");
        System.out.println("5. Hapus Data");
        System.out.println("6. Keluar");
        
        int pilihMenu = sc.nextInt();
        sc.nextLine();
        
        switch (pilihMenu) {
            case 1:
                vm.tampilSemuaData();
                break;
            case 2:
                vm.simpan();
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
        JabatanService ms = new JabatanService();
        ms.setDataSource(mysql.getMysqlDataSource());
        Jabatan jbt = new Jabatan();
        
        System.out.println("DATA JABATAN");
        System.out.println("|KJ \t|\t Jabatan \t|Gaji \t|");
        ms.getPersons();
    }
    
    public void simpan() throws SQLException {
        DatabaseDatasource mysql = new DatabaseDatasource();
        JabatanService ms = new JabatanService();
        ms.setDataSource(mysql.getMysqlDataSource());
        Jabatan jbt = new Jabatan();
        
        System.out.println(" ---------- Masukkan Data Jabatan ------------");
        System.out.print("KJ       : ");
        jbt.setKj(sc.nextInt());
        System.out.print("Jabatan      : ");
        jbt.setJabatan(sc.nextLine());
        System.out.print("Gaji    : ");
        jbt.setGaji(sc.nextInt());
        ms.saveOrUpdate(jbt, false);
        System.out.println("Data Berhasil Ditambahkan");
        mysql.closeMysqlConnection();
        showMenu();
    }
    
    public void ubah() throws SQLException {
        DatabaseDatasource mysql = new DatabaseDatasource();
        JabatanService ms = new JabatanService();
        ms.setDataSource(mysql.getMysqlDataSource());
        Jabatan jbt = new Jabatan();
        
        tampilSemuaData();
        System.out.print("Pilih KJ yang akan diubah : ");
        jbt.setKj(sc.nextInt());
        System.out.print("Masukkan Nama baru    : ");
        jbt.setJabatan(sc.nextLine());
        System.out.print("Masukkan Alamat baru  : ");
        jbt.setGaji(sc.nextInt());
        
        ms.saveOrUpdate(jbt, true);
        System.out.println("Data Berhasil diubah");
        mysql.closeMysqlConnection();
        ms.getPerson(jbt.getKj());
        showMenu();
    }
    
    public void tampilData() throws SQLException {
        DatabaseDatasource mysql = new DatabaseDatasource();
        JabatanService ms = new JabatanService();
        ms.setDataSource(mysql.getMysqlDataSource());
        Jabatan jbt = new Jabatan();
        
        System.out.print("Masukkan KJ : ");
        jbt.setKj(sc.nextInt());
        System.out.println("DATA JABATAN");
        System.out.println("|KJ \t|\t Jabatan \t|Gaji \t|");
        ms.getPerson(jbt.getKj());
    }
    
    public void hapus() throws SQLException {
        DatabaseDatasource mysql = new DatabaseDatasource();
        JabatanService ms = new JabatanService();
        ms.setDataSource(mysql.getMysqlDataSource());
        Jabatan jbt = new Jabatan();
        
        System.out.print("Pilih KJ yang akan dihapus : ");
        jbt.setKj(sc.nextInt());
        ms.delete(jbt);
        mysql.closeMysqlConnection();
        showMenu();
    }
    
}
