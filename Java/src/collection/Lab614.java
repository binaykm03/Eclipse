package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab614 {
		public static void main(String[] args) {
			List ls = new ArrayList();
			Iterator it = ls.iterator();
			if (it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("Main Completed");
		}
}
