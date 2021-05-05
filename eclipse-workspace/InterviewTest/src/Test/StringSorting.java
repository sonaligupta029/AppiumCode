package Test;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		 String[] a= {"sonali","sita","esrdtfygh","joy"};
		 String temp="";
		 int min;
		for (int i=0;i<a.length-1;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				min=i;
				if(a[j].compareTo(a[min])>0)
				{
				min=j;
				}
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		for (int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}

}
