package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lab604 {

	public static void main(String[] args) {
		Collection al = new ArrayList();
		al.add("JDBC");	al.add("Sri");	al.add("JSP");
		al.add("Srinivas");	al.add("Java");	al.add("Dande");
		Collection al1 = new ArrayList();
		al1.add("Java");	al1.add("JDBC");	al1.add("JSP");
		System.out.println(al);
		System.out.println(al1);
		System.out.println(al.removeAll(al1));
		System.out.println(al);
		System.out.println(al1);
		
	}

}
