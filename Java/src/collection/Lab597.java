package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lab597 {

	public static void main(String[] args) {
		Collection al = new ArrayList();
		System.out.println(al);
		System.out.println("Size :"+al.size());
		System.out.println("Empty :"+al.isEmpty());
		al.add("Sri");
		al.add("Nivas");
		al.add("Srini");
		al.add("Dande");
		System.out.println(al);
		System.out.println("Size :"+al.size());
		System.out.println("Empty :"+al.isEmpty());
	}

}
