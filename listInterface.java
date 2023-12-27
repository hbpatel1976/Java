package com.mycompany.mavenproject1;
import java.util.*;
public class listInterface 
{
    public static void main(String args[])
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0, 100);
        list.add(1, 120);
        System.out.println(list);
        list.add(300);
        list.add(450);
        list.add(629);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(2));
        list.set(0,99);
        System.out.println(list);
    }
}