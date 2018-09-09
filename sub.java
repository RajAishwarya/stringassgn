import java.util.Scanner;
public class sub
{
    public static boolean check(String o, String s)
    {
        int flag = -1,j = 0;
        int n1 = o.length();
        int n2 = s.length();
        char []t = o.toCharArray();
        char []f = s.toCharArray();
        for(int i = 0; i < n1; i++)
        {
            //flag = -1;
            if(t[i] == f[0])
            {
                flag = -1;
                while(j < n2)
                {
                    if(!(t[i] == f[j])) flag = 0;
                    j++;
                    i++;
                }
            }
        }
        if(flag == 0) return false;
        else return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String origs = sc.nextLine();
        String ser = sc.nextLine();
        if(check(origs,ser)) System.out.println("substring found");
        else System.out.println("Not found");
    }
}
