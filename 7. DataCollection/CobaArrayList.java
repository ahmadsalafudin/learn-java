package DataCollection;

import java.util.ArrayList;

/**
 *
 * @author ahmad
 */
public class CobaArrayList {
    public static void main(String[] args) {
        ArrayList tas = new ArrayList();
        
        //mengisi data ke arraylist
        tas.add("Kotak nasi"); // index 0
        tas.add(1245); // index 1
        tas.add(0.2); // index 2
        tas.add(true); // index 3
        
           
        //tampilkan 
        System.out.println(tas.get(0));
        System.out.println(tas.get(1));
        System.out.println(tas.get(2));
        System.out.println(tas.get(3));
        
        //edit
        System.out.println("==edit====");
        tas.set(0, 652671);
        tas.set(1, "Kotak saran");
        tas.set(2, true);
        tas.set(3, 0.4);
        
        System.out.println(tas.get(0));
        System.out.println(tas.get(1));
        System.out.println(tas.get(2));
        System.out.println(tas.get(3));
        
        System.out.println("===Delete====");
        tas.remove(0);
        
        System.out.println(tas.get(0));
        System.out.println(tas.get(1));
        System.out.println(tas.get(2));
        
        System.out.println("=============");
        
        //nampilin semua isi data
        for (Object o : tas){
            System.out.println(o);
        }
                
                
                
                
                
        

    }
    
}
