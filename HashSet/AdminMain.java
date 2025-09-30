package HashSet;

import java.util.HashSet;

public class AdminMain {

	public static void main(String[] args) {
	
		HashSet<Admin> adm  = new HashSet<Admin>();
		adm.add(new Admin(12,"Radhe",30000,3000));
		adm.add(new Admin(11,"Shyam",35000,3500));
		adm.add(new Admin(20,"Kahna",25000,2500));
		adm.add(new Admin(15,"Mahamai",20000,2000));
		adm.add(new Admin(10,"Durga",40000,4000));
		
		for(Admin a : adm)
		{
			System.out.println(a);
		}
	}

}
