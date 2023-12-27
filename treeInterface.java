import java.util.*;
public class treeInterface 
{
     public static void main(String args[])
    {
        Set<Integer> tree = new TreeSet<>(); 
        tree.add(100);
        tree.add(50);
        tree.add(150);
        System.out.println(tree);
        tree.add(25);
        tree.add(75);
        tree.add(125);
        tree.add(175);
        System.out.println(tree);
        tree.add(150);
        System.out.println(tree);
    }
}
