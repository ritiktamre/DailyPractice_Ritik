package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class AdminMain {

	public static void main(String[] args) {
	
		Admin a1 = new Admin(12,"Radhe",30000,3000);
		Admin a2 = new Admin(16,"Shyam",35000,3500);
		Admin a3 = new Admin(11,"Kahna",40000,4000);
		Admin a4 = new Admin(1,"Mahamai",50000,5000);
		Admin a5 = new Admin(2,"Durga",20000,2000);
		
		HashMap<Admin,Integer> emp = new HashMap<>();
		 emp.put(a1, 12);
		 emp.put(a2, 34);
		 emp.put(a3, 1);
		 emp.put(a4,12);
		 emp.put(a5, 0);
		 
      System.out.println(emp);
		 
	

	}

}
