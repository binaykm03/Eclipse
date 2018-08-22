package collection;

import java.util.ArrayList;
import java.util.List;

public class Lab608 {

	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.add("Sri");	ls.add("Nivas");	ls.add("Dande");
		ls.add("Java");	ls.add("Nivas");	ls.add("JDBC");
		System.out.println(ls);
		int x = ls.indexOf("Nivas");
		int y = ls.lastIndexOf("Nivas");
		System.out.println(x);
		System.out.println(y);
		System.out.println(ls.indexOf("Nivas"));
		System.out.println(ls.lastIndexOf("Nivas"));
		
	}

}
