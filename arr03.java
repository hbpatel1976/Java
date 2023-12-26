// Initializing values: Array of objects
class Student
{
    public int rollno;
    public String name;
    Student (int r, String n) {this.rollno=r; this.name=n;}
}
public class arr03
    {
    public static void main(String args[])    
        {
            Student s[]= new Student[]{new Student(10,"Pradip"), new Student(20,"Sanjay"), new Student(30,"Vijay")};
            for (int i=0; i<s.length; ++i)
            {
                System.out.println("Rollno " + i + " = " + s[i].rollno + "\tName " + i + " = " + s[i].name);
            }
        }
    }