package collection;

import java.util.ArrayList;
import java.util.List;

public class Lab607 {

	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.add("Sri"); ls.add("Nivas"); ls.add("Dande");	
		System.out.println(ls);
		ls.set(1, "Java");
		System.out.println(ls);
		Object obj = ls.get(2);
		System.out.println(obj);
		System.out.println(ls.get(1));
		
	}

}
