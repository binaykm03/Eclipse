package collection;

import java.util.ArrayList;
import java.util.Collection;

public class LabTest {

	public static void main(String[] args) {
		Students st = new Students(10,"Sri");
		Collection al = new ArrayList();
		al.add(st);
		System.out.println(al);

	}

}
class Students{
	int sid;
	String sname;
	public Students(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
}


