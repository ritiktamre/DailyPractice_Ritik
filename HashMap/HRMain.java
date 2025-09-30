package HashMap;

import java.util.HashMap;

public class HRMain {

	public static void main(String[] args) {
	
		HR h1 = new HR(12,"Ritik",30000);
		HR h2 = new HR(15,"Aadarsh",25000);
		HR h3 = new HR(20,"Anmol",20000);
		
		HashMap<HR,Integer> h = new HashMap<HR,Integer>();
		h.put(h1,12);
		h.put(h2,1);
		h.put(h3,34);
		
		System.out.println(h);

	}

}
