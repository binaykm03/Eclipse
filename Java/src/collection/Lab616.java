package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab616 {
	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.add("Sri");	ls.add("Nivas");	ls.add("Dande");
		ls.add("Java");	ls.add("JDBC");	ls.add("JSP");
		Iterator it = ls.iterator();
		while (it.hasNext()) {
			Object obj = (Object) it.next();
			System.out.println(obj);
		}
	}
}
