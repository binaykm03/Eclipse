package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lab605 {

	public static void main(String[] args) {
		Collection al = new ArrayList();
		al.add("Sri");	al.add("Srinivas");	al.add("Dande");
		al.add("JDBC");	al.add("JAVA");	al.add("JSP");
		Collection al1 = new ArrayList();
		al1.add("JDBC");	al1.add("JAVA");	al1.add("JSP");
		System.out.println(al);
		System.out.println(al1);
		System.out.println(al.retainAll(al1));
		System.out.println(al);
		System.out.println(al1);
	}

}
