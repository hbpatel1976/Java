/* IfElseTest.java */
class IfElseTest
        {
        public static void main(String args[])
                {
                int number[] = {50,65,56,71,81};
                int even=0,odd=0;
                for(int i=0; i<5; ++i)
                        {
                        if(number[i]%2==0){even++;}
                        else{odd++;}
                        }
            System.out.println("Even Numbers : "+even+"   Odd Numbers = "+odd);
                }
        }
