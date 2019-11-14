package pertemuan4.interfaced;

/**
 *
 * @author ahmad
 */
public class Laporan implements Printer {

    @Override
    public void cetakA3() {
        System.out.println("Kertas Ukuran A3");
    }

    @Override
    public void cetakA4() {
        System.out.println("Kertas Ukuran A4");
    }

}
