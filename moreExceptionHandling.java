package com.mycompany.mavenproject1;
public class moreExceptionHandling 
{
    public static void main(String args[])
    {
        int number1=10, number2=0;
        try
        {
            System.out.println(number1/number2);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Something is wrong....following is the exact problem");
            System.out.println(e);
        }
        finally
        {
            System.out.println("Have a great day");
        }
    }   
}