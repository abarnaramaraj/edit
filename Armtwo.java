import java.util.*;
import java.lang.*;
import java.io.*;
public class Armtwo
{
	public static void main (String[] args) 
	{
	  int a, b;
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();
      b = sc.nextInt();
 
      for (int i = a; i<b; i++)
{
         int n, rem, sum = 0;
         n= i;
         while(n != 0)
 {
            rem = n% 10;
            sum = sum + (rem * rem * rem);
            n= n/ 10;
         }
         if(sum == i)
{
            System.out.print(i);
         }
      }
}
}
