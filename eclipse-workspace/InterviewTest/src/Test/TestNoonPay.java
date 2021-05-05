package Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestNoonPay {
	static int [] a={10,20,20,30,30,30,40,50,50, 60, 70, 70,70};
	public static void main(String[] args) {

		Set<Integer> set= new LinkedHashSet();
		for(Integer i: a)
		{
			set.add(i);
		}
       Iterator<Integer> itr= set.iterator();
       while(itr.hasNext())
       {
    	   System.out.println(itr.next());
       }

		}
		

	}


