package Test;

public class SortingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		 int[] a= {10,4,11,23,43,1,0};
		 int temp=0;
		for (int i=0;i<a.length-1;i++)
		{
			for (int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}

}
