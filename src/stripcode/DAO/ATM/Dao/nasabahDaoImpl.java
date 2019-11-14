package DAO.ATM.Dao;

import DAO.ATM.Model.Nasabah;
import DAO.ATM.View.nasabahView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author dedem
 */
public class nasabahDaoImpl implements nasabahDao {
    static nasabahView nv = new nasabahView();
    
    static Scanner sc = new Scanner(System.in);
    private Connection connection;
    private PreparedStatement getByNpStatement;
    private PreparedStatement getBySaldoStatement;
    private PreparedStatement getByNorekStatement;
    private PreparedStatement getByUpdateStatement;

    private final String GET_BY_NP = "select * from nasabah where norek = ? && pin = ?";
    private final String GET_BY_SALDO = "select * from nasabah where norek = ?";
    private final String GET_BY_NOREK = "select * from nasabah where norek = ?";
    private final String GET_BY_UPDATE = "update nasabah set saldo = ? where norek = ?";

    @Override
    public Nasabah balance(String id) throws SQLException {
        getBySaldoStatement.setString(1, id);
        ResultSet rs = getBySaldoStatement.executeQuery();

        if (rs.next()) {
            Nasabah nasabah = new Nasabah();
            nasabah.setId(rs.getInt("id"));
            nasabah.setSaldo(rs.getInt("saldo"));

            System.out.println(" \tRp. " + nasabah.getSaldo());
            return nasabah;
        }
        
        return null;
    }

    @Override
    public Nasabah transfer(String noker, String nokerPengirim) throws SQLException {
        //buat penerima
        getByNorekStatement.setString(1, noker);
        ResultSet rs = getByNorekStatement.executeQuery();
        

        int saldoAwal = 0;
        if (rs.next()) {
            Nasabah n = new Nasabah();
            n.setNama(rs.getString("nama"));
            //n.setNorek(rs.getString("norek"));
            n.setSaldo(rs.getInt("saldo"));

            saldoAwal = n.getSaldo();
            //System.out.println("Saldo penerima : "+saldoAwal);
            System.out.println("Nama Rekening Tujuan - " + n.getNama());

        }else{
            System.out.println("--- Nomor Rekening Tidak Tersedia ---");
            return null;
        }

        System.out.print("Masukkan Nominal Transfer -  ");
        int nominal = sc.nextInt();
        sc.nextLine();

        //buat pengirim
        getByNorekStatement.setString(1, nokerPengirim);
        rs = getByNorekStatement.executeQuery();

        int saldoAwal1 = 0;

        if (rs.next()) {
            Nasabah n = new Nasabah();
            n.setNama(rs.getString("nama"));
            //n.setNorek(rs.getString("norek"));
            n.setSaldo(rs.getInt("saldo"));
            saldoAwal1 = n.getSaldo();

        }

        if (saldoAwal1 < nominal) {
            System.out.println("Saldo Tidak Cukup");
            return null;
        } else {
            int totalSaldo = (saldoAwal + nominal);
            //System.out.println("saldo penerima akhir : "+totalSaldo);
            getByUpdateStatement.setInt(1, totalSaldo);
            getByUpdateStatement.setString(2, noker);
            getByUpdateStatement.executeUpdate();

            int totalSaldo1 = (saldoAwal1 - nominal);
            System.out.println("Jumlah Saldo : " + totalSaldo1);

            getByUpdateStatement.setInt(1, totalSaldo1);
            getByUpdateStatement.setString(2, nokerPengirim);
            getByUpdateStatement.executeUpdate();
            
            return null;
        }
    }

    @Override
    public Nasabah takeOrSave(Nasabah nasabah, int jumlah, String id, boolean isTake) throws SQLException {
        if (!isTake) {
            getBySaldoStatement.setString(1, id);
            ResultSet rs = getBySaldoStatement.executeQuery();

            int saldoAwal = 0;
            if (rs.next()) {
                nasabah.setId(rs.getInt("id"));
                nasabah.setSaldo(rs.getInt("saldo"));
                saldoAwal = nasabah.getSaldo();
            }
            
            int saldoAkhir = saldoAwal + jumlah;
            getByUpdateStatement.setInt(1, saldoAkhir);
            getByUpdateStatement.setString(2, id);
            getByUpdateStatement.executeUpdate();
            System.out.println("=========================================");
            System.out.println("------------- SETOR TUNAI ---------------");
            System.out.println("=========================================");
            System.out.println("Saldo awal      : " + saldoAwal);
            System.out.println("Jumlah setor    : " + jumlah);
            System.out.println("Jumlah Saldo    : " + saldoAkhir);
            System.out.println("-----------------------------------------");
            System.out.println("Uang Berhasil Disetor ");
            System.out.println("-----------------------------------------");

            return nasabah;

        } else {

            getBySaldoStatement.setString(1, id);
            ResultSet rs = getBySaldoStatement.executeQuery();

            int saldoAwal = 0;
            if (rs.next()) {
                nasabah.setId(rs.getInt("id"));
                nasabah.setSaldo(rs.getInt("saldo"));
                saldoAwal = nasabah.getSaldo();
            }

            if (saldoAwal < jumlah) {
                System.out.println("Saldo Tidak Cukup Gan !");
                return nasabah;
            } else {
                int saldoAkhir = saldoAwal - jumlah;
                getByUpdateStatement.setInt(1, saldoAkhir);
                getByUpdateStatement.setString(2, id);
                getByUpdateStatement.executeUpdate();

                System.out.println("=========================================");
                System.out.println("-------------- TARIK TUNAI --------------");
                System.out.println("=========================================");
                System.out.println("Saldo awal      : " + saldoAwal);
                System.out.println("Jumlah tarik    : " + jumlah);
                System.out.println("Jumlah Saldo    : " + saldoAkhir);
                System.out.println("-----------------------------------------");
                System.out.println("Uang Berhasil Ditarik ");
                System.out.println("-----------------------------------------");

                return nasabah;
            }

        }
    }

    @Override

    public Nasabah login(Nasabah nasabah) throws SQLException {
        getByNpStatement.setString(2, nasabah.getPin());
        getByNpStatement.setString(1, nasabah.getNorek());
        nasabahView ns = new nasabahView();

        ResultSet rs = getByNpStatement.executeQuery();

        if (rs.next()) {
            System.out.println("\t     Login Berhasil");

            nasabah.setNorek(rs.getString("norek"));
            nasabah.setPin(rs.getString("pin"));

            //System.out.println(nasabah.getNorek());
            return nasabah;
        } else {
            System.out.println("\t       PIN SALAH");
            ns.login();
            return null;
        }
    }

    @Override
    public void setConnection(Connection connection) throws SQLException {
        this.connection = connection;
        getByNpStatement = (PreparedStatement) this.connection.prepareStatement(GET_BY_NP);
        getBySaldoStatement = (PreparedStatement) this.connection.prepareStatement(GET_BY_SALDO);
        getByUpdateStatement = (PreparedStatement) this.connection.prepareStatement(GET_BY_UPDATE);
        getByNorekStatement = (PreparedStatement) this.connection.prepareStatement(GET_BY_NOREK);
    }

}
