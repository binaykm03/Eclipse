package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab620 {

	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.add("Sri");	ls.add("Nivas");	ls.add("Dande");
		ls.add("Java");	ls.add("JDBC");	ls.add("JSP");
		ListIterator lit = ls.listIterator(2);
		do {
			int index = lit.nextIndex();
			Object obj = lit.next();
			System.out.println(index+"\t"+obj);
			
		} while (lit.hasNext());
		System.out.println();
		lit=ls.listIterator(5);
		do {
			int index = lit.previousIndex();
			Object obj = lit.previous();
			System.out.println(index+"\t"+obj);
		} while (lit.hasPrevious());
	}

}
