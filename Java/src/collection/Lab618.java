package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab618 {
	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.add("Sri");	ls.add("Nivas");	ls.add("Dande");
		ls.add("Java");	ls.add("JDBC");	ls.add("JSP");
		ListIterator lit = ls.listIterator();
		System.out.println(ls);
		while (lit.hasNext()) {
			Object obj = (Object) lit.next();
			System.out.println(obj);
			if (obj.equals("Nivas")) {
				lit.remove();
			}
			else if (obj.equals("Java")) {
				lit.set("Core Java");
			}
			else if (obj.equals("JSP")) {
				lit.add("Servelets");
			}
		}
		System.out.println(ls);
	}
}
