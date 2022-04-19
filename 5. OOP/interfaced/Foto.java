package pertemuan4.interfaced;

/**
 *
 * @author ahmad
 */
public class Foto implements Printer, Monitor{

    @Override
    public void cetakA3() {
        System.out.println("Kertas Ukuran A3 dan bingkai A3");
    }

    @Override
    public void cetakA4() {
        System.out.println("Kertas Ukuran A4 dan Bingkai A4");
    }

    @Override
    public void tampilGambar() {
        System.out.println("Tampilin foto di monitor");
    }
    
}
