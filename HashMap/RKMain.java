package HashMap;

import java.util.HashMap;

public class RKMain {

	public static void main(String[] args) {
	
	RK r1 = new RK(12,"Radhe",20000);
	RK r2 = new RK(15,"Shyam",30000);
	RK r3 = new RK(1,"Mahamai",40000);
	
	HashMap<RK,Integer> h1 = new  HashMap<RK, Integer>();
	h1.put(r1,1);
	h1.put(r2,1);
	h1.put(r3,1);
	
	System.out.println(h1);

	}

}
