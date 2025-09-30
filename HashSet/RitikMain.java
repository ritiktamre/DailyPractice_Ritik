package HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class RitikMain {

	public static void main(String[] args) {
	
		HashSet<Ritik> r = new HashSet<Ritik>();
		r.add(new Ritik(12,"Radhe",20000));
		r.add(new Ritik(13,"Shyam",30000));
		r.add(new Ritik(15,"Kahna",10000));
		r.add(new Ritik(1,"Mahamai",35000));
		r.add(new Ritik(5,"Durgajii",40000));
		
		
		for(Ritik r1 : r)
		{
			System.out.println(r1);
		}
		
		System.out.println();
		ArrayList<Ritik> r1 = new ArrayList<Ritik> (r);
         Collections.sort(r1,new IdComparator());
         for(Ritik r2 : r1)
        	 System.out.println(r2);
	}

}

 class IdComparator implements Comparator<Ritik>
{

	@Override
	public int compare(Ritik o1, Ritik o2) {
		// TODO Auto-generated method stub
		return o1.id - o2.id;
	}
	
}
