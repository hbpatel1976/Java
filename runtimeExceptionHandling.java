package com.mycompany.mavenproject1;
public class runtimeExceptionHandling 
{ 
    public void sampleMethod() 
    { 
        throw new sampleMethod(); 
    } 
    public static void main(String[] args) 
    { 
        try {new runtimeExceptionHandling().sampleMethod();} 
        catch (Exception x) {System.out.println("example of runtime exception"); } 
    } 
} 
class sampleMethod extends RuntimeException 
{ 
    public sampleMethod() 
    { 
        super(); 
    } 
}