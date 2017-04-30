package javabasic.session1.belajar;

import java.util.ArrayList;
import java.util.List;

public class CobaList {
	public static void main(String[] args) {
		//List mirip spt array hanya saja lbh fleksible
		List<String> kumpulanBuku = new ArrayList<String>();
		kumpulanBuku.add("pemrograman java");
		kumpulanBuku.add("pemrograman c");
		kumpulanBuku.add("algoritma");
		kumpulanBuku.add("struktur data");
		kumpulanBuku.add("dasar komputer");
		kumpulanBuku.add("logika pemrograman");
		
		//untuk mengecek apakah kumpulan list tsb terdapat true atau false
		System.out.println(kumpulanBuku.contains("pemrograman ava"));
		
		for(String buku : kumpulanBuku) {
			System.out.println(buku);
		}
		
		//ini adalah contoh list yg buruk karna tdk ada generic type nya
		List badList = new ArrayList();
		badList.add(10);
		badList.add("abc");
		badList.add('c');
		for(Object a : badList){
			System.out.println(a);
		}
	}

}
