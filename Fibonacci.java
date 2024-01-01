package com.mycompany.mavenproject1;
public class Fibonacci 
{
    public static void main(String args[])  
    {    
        int term1=0, term2=1, term3, i, totalTerm=10;    
        System.out.print(term1+" , "+term2);
        for(i=2;i<totalTerm;++i)
        {    
            term3 = term1 + term2;    
            System.out.print(" , " + term3);    
            term1 = term2;    
            term2 = term3;    
        }
    }    
}