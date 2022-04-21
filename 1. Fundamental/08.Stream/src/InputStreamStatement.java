import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamStatement {
    public static void main(String[] args) throws IOException {

        FileInputStream inputFile = new FileInputStream("input.txt");

        System.out.print((char)inputFile.read());
        System.out.print((char)inputFile.read());
        System.out.print((char)inputFile.read());
        System.out.print((char)inputFile.read());
        System.out.print((char)inputFile.read());
        System.out.print((char)inputFile.read());
        System.out.print((char)inputFile.read());
        System.out.print((char)inputFile.read());
        System.out.print((char)inputFile.read());
        System.out.print((char)inputFile.read());
        System.out.print((char)inputFile.read());

        System.out.println("akhir dari program");

    }
}
