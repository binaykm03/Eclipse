package collection;

import java.util.ArrayList;
import java.util.List;

public class Lab606 {

	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.add("Sri");	ls.add("Nivas");	ls.add("Dande");
		System.out.println(ls);
		ls.add(1, "java");
		System.out.println(ls);
		ls.remove(2);
		System.out.println(ls);
	}

}
