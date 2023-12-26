// Assigning values: Array of objects
class Student
{
    public int rollno;
    public String name;
    Student (int r, String n) {this.rollno=r; this.name=n;}
}
public class arr04
    {
    public static void main(String args[])    
        {
            Student s[]= new Student[3];
            s[0] = new Student(10,"Pradip");
            s[1] = new Student(20,"Sanjay");
            s[2] = new Student(30,"Vijay");
            
            for (int i=0; i<s.length; ++i)
            {
                System.out.println("Rollno " + i + " = " + s[i].rollno + "\tName " + i + " = " + s[i].name);
            }
        }
    }