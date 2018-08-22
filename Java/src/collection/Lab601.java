package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lab601 {

	public static void main(String[] args) {
		Collection al1 = new ArrayList();
		al1.add("Sri"); al1.add("Srinivas"); al1.add("Dande");
		System.out.println(al1+"\t"+al1.size());
		Collection al2 = new ArrayList();
		al2.add("Java"); al2.add("JDBC"); al2.add("JSP");
		System.out.println(al2+"\t"+al2.size());
		al1.addAll(al2);
		System.out.println(al1+"\t"+al1.size());
		
	}

}
