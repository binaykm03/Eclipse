package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lab599 {

	public static void main(String[] args) {
		Collection al = new ArrayList();
		al.add("Sri");
		al.add("Srinivas");
		al.add("Dande");
		Object arr[] = al.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+"\t"+arr[i]);
			arr[i]="JLC";
		}
		System.out.println(al);
	}

}
