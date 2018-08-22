package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Lab600 {

	public static void main(String[] args) {
		Collection al = new ArrayList();
		al.add("Sri");
		al.add("Srinivas");
		al.add("Dande");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			Object obj = (Object) it.next();
			System.out.println(obj);
			if (obj.equals("Sri")) {
				it.remove();
			}
		}
		System.out.println(al);
	}

}
