package javabasic.session1.belajar;

import java.util.HashSet;
import java.util.Set;

public class CobaSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> buku =new HashSet<String>();
		buku.add("java");
		buku.add("PHP");
		buku.add("Ionic");
		
		//mereplace "java" yg atas kedalam set karena sama
		buku.add("C+"); //jika String sama maka hasil tidk di print double
		
		for(String book : buku)
			System.out.println("Buku:" +book);

	}

}
