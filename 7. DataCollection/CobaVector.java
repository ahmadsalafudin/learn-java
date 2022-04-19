package DataCollection;

import java.util.Vector;

/**
size(), untuk mencari panjang ArrayList
add(), untuk menambah elemen baru
get(), untuk mengambil elemen pada indeks tertentu
isEmpty(), untuk memeriksa apakah ArrayList kosong atau tidak
indexOf(), untuk mengetahui indeks dari suatu nilai
contains(), untuk memeriksa apakah suatu nilai ada dalam ArrayList
set(), untuk menimpa nilai pada indeks tertentu
remove(), untuk menghapus nilai pada indeks tertentu
Sedangkan operasi yang dikhususkan untuk vector antara lain:

firstElement(), mengambil nilai elemen pertama dari vector
lastElement(), mengambil nilai elemen terakhir dari vector
insertElementAt(), menyisipkan nilai elemen pada indeks tertentu di dalam vector
 */
public class CobaVector {

    public static void main (String[] args){
        Vector<Integer> deret = new Vector<Integer>();

        System.out.println("Panjang deret awal: "+deret.size());

        for (int i = 0; i < 10; i++){
            deret.add(i * 10);
        }

        System.out.println("\nPanjang deret setelah ditambah elemen: "+deret.size());

        for (int i = 0; i < deret.size(); i++){
            System.out.println("elemen ke - " + i + " : " + deret.get(i));
        }

        //perikas apakah vector kososng
        System.out.println("\nMemeriksa apakah vector kosong: ");
        if (deret.isEmpty()) {
            System.out.println("Kosong");
        }
            System.out.println("Ada Isinya");

        System.out.println("\nMencari indeks dari suatu nilai di dalam vector: ");
        System.out.println(deret.indexOf(60));  
        System.out.println(deret.indexOf(70));  
        System.out.println(deret.indexOf(80));  

        System.out.println("\nMemeriksa keberadaan suatu nilai di dalam vector: ");
        System.out.println(deret.contains(60)); 
        System.out.println(deret.contains(70)); 
        System.out.println(deret.contains(80)); 

        System.out.println("\nMencari elemen pertama dan terakhir di dalam vector: ");
        System.out.println(deret.firstElement());   
        System.out.println(deret.lastElement());    

        System.out.println("\nUpdate suatu nilai di dalam vector: ");
        deret.set(6, 600);  
        deret.set(7, 700);  
        deret.set(8, 800);  

        System.out.println(deret.get(6));   
        System.out.println(deret.get(7));   
        System.out.println(deret.get(8));   

        System.out.println("\nMenghapus suatu nilai di dalam vector... ");
        deret.remove(6);    
        deret.remove(6);    
        deret.remove(6);    

        System.out.println("\nPanjang deret setelah menghapus beberapa elemen: "+deret.size());

        for (int i = 0; i < deret.size(); i++){
            System.out.println("elemen ke - " + i + " : " + deret.get(i));
        }

        System.out.println("\nMenyisipkan suatu nilai di dalam vector... ");
        deret.insertElementAt( 35005, 3 );

        System.out.println("\nPanjang deret setelah menyisipkan elemen: "+deret.size());

        for (int i = 0; i < deret.size(); i++){
            System.out.println("elemen ke - " + i + " : " + deret.get(i));
        }
    }

    
}
