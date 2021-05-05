
public class Test {
	static int[] a ={12,12, 3, 4, 1, 6,3,9, 9};
	static int sum=24;

	public static void main(String[] args) {
//		for (int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length-1;j++)
//			{
//				if((a[i]+a[j]+a[j+1])==sum) {
//					System.out.println(a[i] +" "+a[j] +" "+a[j+1]);
////				for(int k=j+1;k<a.length;k++)
////				{
////					
////				}				
//			}			
//		}
//	}
		int j=0;
		int[] temp=new int[a.length];
		for (int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				a[i]=0;
			}
	
			
			
		}

		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}}

