package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Lab612 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("Sri");	v.add("Nivas");	v.add("Dande");	v.add("SD");	
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			Object obj = (Object) en.nextElement();
			System.out.println(obj);
		}
	}

}
