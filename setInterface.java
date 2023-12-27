import java.util.*;
public class setInterface 
{
     public static void main(String args[])
    {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        
        set1.addAll(Arrays.asList(new Integer[] {10,20,30,40,50}));
        set2.addAll(Arrays.asList(new Integer[] {5,20,35,40,70}));
        System.out.println("Set 1 : " + set1);
        System.out.println("Set 2 : " + set2);
        
        Set<Integer> union = new HashSet<Integer>(set1);
        union.addAll(set2);
        System.out.println("Union : " + union);
        
        Set<Integer> intersection = new HashSet<Integer>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection : " + intersection);
        
        Set<Integer> difference = new HashSet<Integer>(set1);
        difference.removeAll(set2);
        System.out.println("Difference : " + difference);
        
        System.out.println("Set 1 contains " + 10 + " is " + set1.contains(10));
        System.out.println("Set 2 contains " + 99 + " is " + set2.contains(99));
    }
}
