package prj07;

class Customer{
	   private String account;
	   private String password;
	   private String cname;
	protected void finalize() throws Throwable {
		System.out.println("finalize()");
	}	   
	}

public class P07_01 {

	public static void main(String[] args) {
		Customer cus = new Customer();
		//给cus置空
		cus = null;
		//强制垃圾回收
		System.gc();
	}

}
