package javabasic.session1.latihan;

import java.util.HashMap;
import java.util.Map;

public class CobaMapKamus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> kamus = new HashMap<String, String>();
		kamus.put("satu", "siji");
		kamus.put("dua", "loro");
		kamus.put("pulang", "mulih");
		kamus.put("pergi", "tumindak");
		kamus.put("makan", "dahar");
		kamus.put("minum", "ngumbe");
		
		for(String key : kamus.keySet()){
			System.out.println("Bahasa Jawa nya " + "satu");
			System.out.println("adalah :" + kamus.get("satu"));
		}

	}

}
