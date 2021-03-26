class Doctor
{
	String name;
	Doctor(String n) {name=n;}
}
class Surgeon extends Doctor
{
	String specialization;
	int charge;
	Surgeon(String n, String s, int c)
		{
		super(n);
		specialization=s; 
		charge=c;
		}
	void displaySurgeon()
	{
		System.out.println("Surgeon Information");
		System.out.println("Name : "+name);
		System.out.println("Specialization : "+specialization);
		System.out.println("Charge per hour : "+charge);
	}
}
class Physician extends Doctor
{
	String speciality;
	int fees;
	Physician(String n, String s, int f)
		{
		super(n);
		speciality=s; 
		fees=f;
		}
	void displayPhysician()
	{
		System.out.println("Physician Information");
		System.out.println("Name : "+name);
		System.out.println("Speciality : "+speciality);
		System.out.println("Fees per hour : "+fees);
	}
}
public class Assignment311
{
	public static void main(String args[])
	{
		Surgeon s=new Surgeon ("Dr. Ronak", "Heart Surgeon", 3000);
		Physician p=new Physician ("Dr. Dhruv", "Gynecologist", 2500);
		s.displaySurgeon();
		p.displayPhysician();
	}
}