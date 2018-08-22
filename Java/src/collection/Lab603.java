package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lab603 {

	public static void main(String[] args) {
		Collection al1 = new ArrayList();
		al1.add("JSP"); 
		al1.add("Srinivas"); 
		al1.add("Dande");
		al1.add("Java");
		al1.add("JDBC");
		System.out.println(al1+"\t"+al1.size());
		Collection al2 = new ArrayList();
		al2.add("Java"); al2.add("JDBC"); al2.add("JSP");
		System.out.println(al2+"\t"+al2.size());
		Collection al3 = new ArrayList();
		al3.add("Java"); al3.add("JDBC"); al3.add("EJB");
		System.out.println(al3+"\t"+al3.size());
		System.out.println(al1+"\t"+al2+"\t"+al3);
		System.out.println(al1.containsAll(al2));
		System.out.println(al1.containsAll(al3));
	}

}
