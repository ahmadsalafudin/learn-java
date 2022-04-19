package DataCollection;

/**
 *
 * @author ahmad
 */
public class CobaArrayMultiDimensi {

    public static void main(String[] args) {
        //                  0     1     2
        //                 0 1   0 1   0 1
        int[][] angka = {{1, 2}, {3, 4}, {5, 6}};

        System.out.println(angka[1][1]);
        System.out.println("------------------");
//         baris | kolom
        String[][] tas = {
            //  0         1           2
            {"Pensil", "Sepidol", "Pulpen"},
            //  0        1       2       3
            {"Nasi", "Peyek", "Telor", "Ayam"},
            // 0          1      2          3
            {"Catatan", "Bon", "KTP", "Foto Mantan"}
        };
        System.out.println("Cetak dengan loop for");
        //                         3
        for (int b = 0; b < tas.length; b++) {
            //                          
            for (int k = 0; k < tas[b].length; k++) {
                System.out.println("Isi ke " + b + " , " + k + " = " + tas[b][k]);
            }
            System.out.println("------------");
        }
       
        System.out.println("Cetak dengan loop for each");
        
        for (String[] b : tas) {
            for (String k : b) {
                System.out.println("Isi = " + k);
            }
            System.out.println("----------------");
        }

    }

}
