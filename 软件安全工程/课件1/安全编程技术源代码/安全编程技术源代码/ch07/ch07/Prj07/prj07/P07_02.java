package prj07;

import java.util.ArrayList;

class MyObject{
	protected void finalize() throws Throwable {
		System.out.println("finalize()");
	}
	
}
public class P07_02 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		for (int i = 1; i < 2; i++) {
			MyObject obj = new MyObject();
			al.add(obj);
			obj= null;
		}
		al = null;
		System.gc();
	}
}
