package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Lab610 {

	public static void main(String[] args) {
		Vector v = new Vector();
		Enumeration en = v.elements();
		System.out.println(en.hasMoreElements());
		System.out.println(en.nextElement());
		
	}

}
