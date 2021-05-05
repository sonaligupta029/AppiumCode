package Test;

import java.util.HashMap;
import java.util.Iterator;

public class PrintDuplicate {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintDuplicate rm=new PrintDuplicate();
		rm.PrintDuplicate();
	}

	  void PrintDuplicate() {
		String str= "I am am I learning java java";
		String[] s=str.split(" ");
	
		HashMap<String, Integer>  hm=new HashMap<> ();
		for(String s1: s)
		{
			if(hm.get(s1)!=null)
				hm.put(s1, hm.get(s1)+1);
			else
				hm.put(s1,1);
		}
	 Iterator<String> itr=hm.keySet().iterator();	
	 while(itr.hasNext())
	 {
		 String stri= itr.next();
		 if(hm.get(stri)>1) {
			 System.out.println(stri +"duplicate");
			
		 }
		
	 }


	}

}
