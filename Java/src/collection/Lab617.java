package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab617 {

	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.add("Sri");	ls.add("Nivas");	ls.add("Dande");
		ls.add("Java");	ls.add("JDBC");	ls.add("JSP");
		ListIterator lit = ls.listIterator();
		while (lit.hasNext()) {
			Object obj = (Object) lit.next();
			System.out.println(obj);
		}
	}

}
