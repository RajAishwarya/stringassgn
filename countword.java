import java.util.Scanner;
public class countword
{
	public static int countw(String str)
	{
		int c = 0, j = 0;
		int n = str.length();
		char []t = str.toCharArray();
		for(int i = 0; i < n; i++)
		{
			if((i > 0 && t[i] != ' ' && t[i - 1] == ' ') || (t[0] != ' ' && (i == 0)))
			{
				c++;
			}
		}
		return c;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int ans = countw(str);
		System.out.println("No of words in string "+ans);
	}
}