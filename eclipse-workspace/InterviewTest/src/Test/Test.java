package Test;

public class Test {
	
	
	static void substring(char[] ch,int length)
	{
		for(int k= 0; k<length;k++)
		{
			for(int p=0;p<length-k;p++)
			{
			int a=p+k-1;
			for(int t=p;t<=a;t++)
			{
			System.out.println(ch[t]);
			}
			System.out.println();
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		String s="abcd";
		char[] ch=s.toCharArray();
		int length=ch.length;
		substring(ch, length);

	}

}
