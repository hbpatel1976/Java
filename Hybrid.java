class Student
        {
        int rollNumber;
        void getNumber(int n)
                {rollNumber=n;}
        void putNumber()
                {System.out.println("Roll Number = "+rollNumber);}
        }
class Test extends Student
        {
        float part1,part2;
        void getMarks(float m1, float m2)
                {part1=m1;part2=m2;}
        void putMarks()
                {
                System.out.println("Marks Obtained");
                System.out.println("part1 = "+part1);
                System.out.println("part2 = "+part2);
                }
        }
interface Sports
        {
        float sportWt=6.0F;
        void putWt();
        }
class Results extends Test implements Sports
        {
        float total;
        public void putWt()
                {
                System.out.println("Sport Wt = "+sportWt);
                }
        void display()
                {
                total=part1+part1+sportWt;
                putNumber();
                putMarks();
                putWt();
                System.out.println("Total Score = " +total);
                }
        }
class Hybrid
        {
        public static void main(String args[])
                {
                Results student1=new Results();
                student1.getNumber(1234);
                student1.getMarks(27.5f,33.0f);
                student1.display();
                }
        }
