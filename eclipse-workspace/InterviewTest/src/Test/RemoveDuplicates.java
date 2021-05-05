package Test;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="I am am learning Java";
//		String[] str= s.split(" ");
//		Set<String> st=new LinkedHashSet<String>();
//		for (String s1: str) {
//			st.add(s1);
//		}
//		Iterator<String> itr=st.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//
//	}
		Integer [] a={10,20,20,30,30,30,40,50,50, 60, 70, 70,70};
		Set<Integer> set= new LinkedHashSet<Integer>();
		for(Integer i: a)
		{
			set.add(i);
		}
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		}}


