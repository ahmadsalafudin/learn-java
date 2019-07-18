package javabasic.session1.belajar;

import java.util.Set;
import java.util.TreeSet;

import javabasic.session1.belajar.Mahasiswa;

public class SortTreeMahasiswa {
	public static void main(String[] args) {
		Set<Mahasiswa> students = new TreeSet<Mahasiswa>();
		
		Mahasiswa m1 = new Mahasiswa();
		m1.setNim(987);
		m1.setNama("Budi");
		
		Mahasiswa m2 = new Mahasiswa();
		m2.setNim(123);
		m2.setNama("Joni");
		
		Mahasiswa m3 = new Mahasiswa();
		m3.setNim(163);
		m3.setNama("Johan");
		
		students.add(m3);
		students.add(m1);
		students.add(m2);
		
		for(Mahasiswa m : students) {
			System.out.println(m.getNim() + " " + m.getNama());
		}
	}
}
