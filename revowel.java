
import java.util.Scanner;
public class revowel
{
	public static String remvowel(String str)
	{
		int n = str.length();
		char []t = str.toCharArray();
		String rem = " ";
		for(int i = 0; i < n; i++)
		{
			if(!(t[i] == 'a' || t[i] == 'e' || t[i] == 'i' ||t[i] == 'o' || t[i] == 'u'|| t[i] == 'A'|| t[i] == 'E'|| t[i] == 'I'|| t[i] == 'O'|| t[i] == 'U'))
			{
				rem = rem + str.charAt(i);
			}
		}
		return rem;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rem = remvowel(str);
		System.out.println("after removing vowel: "+rem);
	}
}