package javabasic.session1.belajar;

import java.util.HashMap;
import java.util.Map;

public class CobaMap {
	public static void main(String[]args){
		Map<Integer, String> hp = new HashMap<Integer, String>();
		hp.put(1, "Samsung");
		hp.put(2, "Iphone");
		hp.put(3, "Nokia");
		
		for(Integer key : hp.keySet()){
			System.out.println("Key : "+ key);
			System.out.println("Handphone : " + hp.get(key));
		}
	}

}
