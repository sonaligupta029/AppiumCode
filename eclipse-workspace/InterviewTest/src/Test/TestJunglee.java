package Test;

public class TestJunglee {
	static void isPalindrome(String str)
	{
		
		char[] cha=str.toCharArray();
		String ch = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			ch=ch+cha[i];
		}
		if(str.equals(ch)) {
			System.out.println( str + " is a palindrome");

			}
		else
		{
			//System.out.println( str+ " is not a palindrome");
			String ne="";
			char[] newstr =str.toCharArray();
			for(int i=1;i<str.length()-1;i++ )
			{
				ne=ne+newstr[i];
			}
			isPalindrome(ne);
		}
	}

	public static void main(String[] args) {
		String str= "banana";
		isPalindrome(str);
		
	}

}
