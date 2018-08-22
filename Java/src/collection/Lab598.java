package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lab598 {

	public static void main(String[] args) {
		Collection al = new ArrayList();
		al.add("Sri");
		al.add("Srinivas");
		al.add("SD");
		al.add("Dande");
		System.out.println(al);
		System.out.println(al.contains("Srinivas"));
		System.out.println(al.contains("Java"));
		System.out.println(al.remove("JDBC"));
		System.out.println(al.remove("SD"));
		System.out.println(al);
		al.clear();
		System.out.println(al);
		System.out.println(al.size());
	}

}
