package looping;

/**
 *
 * @author ahmad
 */
public class CobaLoopWhile {

    public static void main(String[] args) {
        int i = 0;

        while (i <= 2) {
            //blok kode yg akan diulang
            System.out.println("Perulangan ke = " + i);
            //increment
            i++;
        }
        System.out.println();
        System.out.println("===========================");

        
      /*  
        //program untuk menjumlahkan
        int a, b, hasil = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nilai Awal = ");
        a = sc.nextInt();
        System.out.print("Masukan Nilai kedua = ");
        b = sc.nextInt();

        while (a <= b) {

            hasil = hasil + a;

            System.out.println("Ditambah " + a + "Menjadi " + hasil);
            a++;
        }
*/

    }

}
