public class testingStringClass 
{
    public static void main(String args[])
    {
        String college = "Vidush Somany Institute of Technology and Research";
        System.out.println ("College Name : " + college);
        System.out.println ("College Name Length : " + college.length());
        System.out.println ("Character at 7th position : " + college.charAt(7));
        System.out.println ("Substring from 7th position : " + college.substring(7));
        System.out.println ("Substring between 7th & 13th position : " + college.substring(7, 13));
        
        String university = " Kadi Sarva Vishwavidyalaya";
        System.out.println ("Combined / Concataneted : " + college.concat(university));
        System.out.println ("College Name : " + college);
        System.out.println ("University Name : " + university);
        
        System.out.println("First occurance of the word Institute : " + college.indexOf("Institute"));
        System.out.println("First occurance of the character a after 15: " + college.indexOf('a',15));
        
        System.out.println("String Equality : " + college.equals(university));
        System.out.println("String Equality : " + college.equals(college));
        
        System.out.println("College name in lower Case : " + college.toLowerCase());
        System.out.println("College name in UPPER Case : " + college.toUpperCase());
        System.out.println ("College Name : " + college);
        
        System.out.println("Replace a with x : " + college.replace('a','x'));
    }
}