package collection;

import java.util.ArrayList;
import java.util.List;

public class Lab609 {

	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.add("Sri");	ls.add("Nivas");	ls.add("Dande");
		ls.add("Java");	ls.add("JDBC");	ls.add("Nivas");
		List ls1  = ls.subList(1, 4);
		System.out.println(ls);
		System.out.println(ls1);
	}

}
