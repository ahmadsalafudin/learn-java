package javabasic.session1.belajar;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javabasic.session1.belajar.Mahasiswa;

public class SortMapMahasiswa {
	public static void main(String[] args) {
		Map<Integer, Mahasiswa> mhsMap = new HashMap<Integer, Mahasiswa>();
		
		Mahasiswa m1 = new Mahasiswa();
		m1.setNim(987);
		m1.setNama("Budi");
		
		Mahasiswa m2 = new Mahasiswa();
		m2.setNim(123);
		m2.setNama("Joni");
		
		Mahasiswa m3 = new Mahasiswa();
		m3.setNim(163);
		m3.setNama("Johan");
		
		mhsMap.put(5, m3);
		mhsMap.put(7, m2);
		mhsMap.put(1, m1);
		
		Map<Integer, Mahasiswa> treeMap = new TreeMap<Integer, Mahasiswa>(mhsMap);
		for(Integer key : treeMap.keySet()) {
			System.out.println("Key: " + key);
			System.out.println("Mahasiswa: " + treeMap.get(key).getNim() + " " + treeMap.get(key).getNama());
		}
	}
}
