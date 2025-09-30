package HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class HRMain {

	public static void main(String[] args) {
		
		HashSet<HR> hr = new HashSet<>();
		hr.add(new HR(12,"Ritik",30000));
		hr.add(new HR(1,"Aadarsh",25000));
		hr.add(new HR(15,"Anmol",20000));
		hr.add(new HR(18,"Duggu",15000));
		hr.add(new HR(3,"UV",10000));
		
		for(HR h : hr)
		{
			System.out.println(h);
		}
		
		System.out.println("Sorting the Data By Id ");
		List<HR> h1 = new ArrayList<HR>();
		Collections.sort(h1,new IdComparator());
		
			for(HR r : hr )
			{
				System.out.println(r);
			}
		
	}

		
	public static  class IdComparator implements Comparator<HR>
	{

		@Override
		public int compare(HR o1, HR o2) {
			// TODO Auto-generated method stub
			return o1.id-o2.id;
		}
		
	}

}
