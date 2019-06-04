/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author rishabh
 */
class Tcs
{
    Tcs()
    {
        System.out.println("Base....Non para Tcs");
    }
     Tcs(int x)
    {
        System.out.println("Base....para Tcs");
    } 
     Tcs(int x,int y)
    {
        System.out.println("Base....Dual para Tcs");
    }
}

public class Aptron extends Tcs
{
    Aptron()
    {
        System.out.println("Driveed ... Non para Aptron");
    }
    Aptron(int a)
    {
        super(a,a);
        System.out.println("Driveed ... Non para Aptron");
    }
    
    public static void main(String []args)
    {
        Aptron obj = new Aptron(15);
    }
}
