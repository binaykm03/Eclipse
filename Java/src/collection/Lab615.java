package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab615 {

	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.add("Sri");	ls.add("Nivas");	ls.add("Dande");
		Iterator it = ls.iterator();
		System.out.println(ls.size());
		boolean b = it.hasNext();
		System.out.println(b);
		//ls.remove("Sri");
		for (int i = 0; i < ls.size(); i++) {
			System.out.println(it.next());
		}
		System.out.println("Main Complted");
	}

}
