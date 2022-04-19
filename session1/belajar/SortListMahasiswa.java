package javabasic.session1.belajar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListMahasiswa {
	public static void main(String []args){
		List<Mahasiswa> students = new ArrayList<Mahasiswa>();
		
		Mahasiswa m1 = new Mahasiswa();
		m1.setNama("Salaph");
		m1.setNim(311410500);
		
		Mahasiswa m2 = new Mahasiswa();
		m2.setNama("Ardianto");
		m2.setNim(311410563);
		
		Mahasiswa m3 = new Mahasiswa();
		m3.setNama("Yususp Aripin");
		m3.setNim(311410729);
		
		students.add(m1);
		students.add(m2);
		students.add(m3);
		
		System.out.println("Sebelum disorting");
		for(Mahasiswa m : students) {
			System.out.println(m.getNim() + " " + m.getNama());
		}
		Collections.sort(students, Collections.reverseOrder());
		System.out.println("Setelah di sorting");
		for(Mahasiswa m : students) {
			System.out.println(m.getNim() + " " + m.getNama());
		}
	}

}
