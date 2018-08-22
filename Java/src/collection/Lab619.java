package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab619 {

	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.add("Sri");	ls.add("Nivas");	ls.add("Dande");
		ls.add("Java");	ls.add("JDBC");	ls.add("JSP");
		ListIterator lit = ls.listIterator();
		System.out.println("FORWARD ORDER");
		while (lit.hasNext()) {
			int indx = lit.nextIndex();
			Object obj = (Object) lit.next();
			System.out.println(indx+"\t"+obj);
		}
		System.out.println("REVERSE ORDER");
		while (lit.hasPrevious()) {
			int indx = lit.previousIndex();
			Object obj = (Object) lit.previous();
			System.out.println(indx+"\t"+obj);
			
		}
	}

}
