/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
Scanner sc = new Scanner(System.in);
int t=sc.nextInt();
long a,b,c;
while(t!=0){
    a=sc.nextLong();
    b=sc.nextLong();
    c=sc.nextLong();
    if(c%2!=0){
        a=a*2;
    }
    long max=Math.max(a,b);
    long min=Math.min(a,b);
    System.out.println(max/min);
    t=t-1;
}
	}
}
