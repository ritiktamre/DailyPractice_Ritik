package HashMap;

import java.util.HashMap;

public class SalesManagerMain {

	public static void main(String[] args) {
	
		SalesManager s1 = new SalesManager(12,"Radhe",30000,3000);
		SalesManager s2 = new SalesManager(11,"Shyam",20000,1000);
		SalesManager s3 = new SalesManager(15,"Kahna",10000,500);
		
		HashMap<SalesManager, Integer> adm = new HashMap<>();
		adm.put(s1, 12);
		adm.put(s2, 12);
		adm.put(s3,8);
		
		System.out.println(adm);

	}

}
