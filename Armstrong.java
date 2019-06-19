import java.util.*;
import java.lang.*;
import java.io.*;
public class Armstrong
{
	public static void main (String[] args) 
	{
		  int c=0,a,temp;  
    int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt(); 
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("yes");   
    else  
        System.out.println("no");   
   }  
	}
