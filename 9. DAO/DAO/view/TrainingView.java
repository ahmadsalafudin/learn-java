package pertemuan6.DAO.view;

import java.sql.SQLException;
import java.util.Scanner;
import pertemuan6.DAO.Model.Training;
import pertemuan6.DAO.koneksi.DatabaseKoneksi;
import pertemuan6.DAO.service.TrainingService;

/**
 *
 * @author ahmad
 */
public class TrainingView {

    public void tampilData() throws SQLException {
        DatabaseKoneksi dk = new DatabaseKoneksi();
        TrainingService ts = new TrainingService(dk.getSQLServerDataSource());

        for (Training t : ts.getTraining()) {
            System.out.println(t.getNama() + " | "
                    + t.getAlamat() + " | "
                    + t.getNohp());
        }
        dk.closeDataSource();
    }

    public void tampil() throws SQLException {
        DatabaseKoneksi dk = new DatabaseKoneksi();
        TrainingService ts = new TrainingService(dk.getSQLServerDataSource());

        Training tr = new Training();
        Scanner sc = new Scanner(System.in);
        tr.setNohp(sc.next());
        //System.out.println(tr.getNama());
        System.out.println("-- data training --");
        //ts.getId(tr.getNohp());
        ts.getId(tr.getNohp());
        System.out.println(ts.getId(tr.getNama()));
        System.out.println(ts.getId(tr.getAlamat()));

        dk.closeDataSource();
    }

    public void tambahData() throws SQLException {
        DatabaseKoneksi dk = new DatabaseKoneksi();
        TrainingService ts = new TrainingService(dk.getSQLServerDataSource());
        Training tr = new Training();

        Scanner sc = new Scanner(System.in);
        System.out.println("-- Menu Tambah Data --");
        System.out.print("Masukan Nama Anda : ");
        tr.setNama(sc.next());
        System.out.print("Masukan Alamat Anda :");
        tr.setAlamat(sc.next());
        System.out.print("Masukan No HP Anda :");
        tr.setNohp(sc.next());

        ts.save(tr, true);
        dk.closeDataSource();
    }

    public void editData() throws SQLException {
        DatabaseKoneksi dk = new DatabaseKoneksi();
        TrainingService ts = new TrainingService(dk.getSQLServerDataSource());
        //ts.sqlServer();
        Training tr = new Training();
        tampilData();
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Menu Edit Data --");
        System.out.print("Masukan No Hp (id) yg mau di edit : ");
        tr.setNohp(sc.next());
        System.out.print("Masukan nama yg akan di ubah : ");
        tr.setNama(sc.next());
        System.out.println("Berhasil di ubah");

        ts.save(tr, false);
        dk.closeDataSource();
    }

}
