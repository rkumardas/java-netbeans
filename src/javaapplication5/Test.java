/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Test 
{
    
    long a,b,n;
    
    void GetEl()
    {
        Scanner sc = new Scanner(System.in);
        
        a= sc.nextLong();
        b= sc.nextLong();
        n= sc.nextLong();
        long r= Int_Div();
        System.out.println(r);
        
    }
    
    long Int_Div()
    {
        if(n%2!=0)
        {
            a=2*a;
        }
            
        
        
        long m=Math.max(a,b);
        long mi=Math.min(a,b);
        
        long res=m/mi;
        return res;
    }
    public static void main(String []arg)
    {
        int t;
        
        Scanner input = new Scanner(System.in);

        Test a = new Test();
        
        t = input.nextInt();
        
    
        
        for(int i = 0 ; i < t ; i++)
        {
            a.GetEl();
        }
    }

}
