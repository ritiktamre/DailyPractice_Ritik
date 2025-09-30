package HashSet;

import java.util.HashSet;

public class SalesManagerMain {

	public static void main(String[] args) {

		HashSet<SalesManager> sal = new HashSet<SalesManager>();
		
		sal.add(new SalesManager(12,"Radhe",30000,3000,30));
		sal.add(new SalesManager(15,"Shyam",20000,2000,20));
		sal.add(new SalesManager(19,"Kahna",25000,2500,25));
		sal.add(new SalesManager(1,"Mahamai",40000,4000,40));
		sal.add(new SalesManager(8,"Durga",35000,3500,35));
		sal.add(new SalesManager(6,"KalBharav",22000,2200,22));
		
		for(SalesManager s : sal)
		{
			System.out.println(s);
		}

	}

}
