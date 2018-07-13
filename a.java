import java.io.*;
import java.util.*;
class a
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            if(n%2==0)
            {
                System.out.print("EVEN");
            }
            else if(n<0)
            {
                System.out.print("Invalid");
            }
            else
            {
                System.out.print("ODD");
            }
    }
}
