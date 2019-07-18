package javabasic.session1.latihan;

import java.util.ArrayList;
import java.util.List;

public class LatihanList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listSong = new ArrayList<String>();
		listSong.add("Surat Cinta Untuk Bang Toyib");
		listSong.add("Shepia");
		listSong.add("Dia");
		listSong.add("Asal Kau bAhagia");
		listSong.add("Sarjana Muda");
		
		System.out.println(listSong.contains("Shepia"));
		for(String song : listSong) {
			System.out.println(song);
		}

	}

}
