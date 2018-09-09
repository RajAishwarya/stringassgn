
import java.util.Scanner;
public class rstring
{
	public static String reverse(String temp)
	{
		int n = temp.length();
		char []s = temp.toCharArray();
		for(int i = 0; i < n/2; i++)
		{
			char tmp = s[i];
			s[i] = s[n - i - 1];
			s[n - i - 1] = tmp; 
		}
		temp = String.valueOf(s);
		return temp;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev = reverse(str);
		System.out.println("The reverse string is "+rev);
	}
}