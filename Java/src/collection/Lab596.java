package collection;

import java.util.Enumeration;
import java.util.Properties;

public class Lab596 {

	public static void main(String[] args) {
		Properties P = new Properties();
		P.put("JLC-99", "Sri");
		P.put("JLC-88", "VAS");
		P.put("JLC-77", "dande");
		System.out.println(P);
		Enumeration en = P.propertyNames();
		while (en.hasMoreElements()) {
			String pnm = (String) en.nextElement();
			String val = P.getProperty(pnm);
			System.out.println(pnm+"\t\t"+val);
		}
	}

}
