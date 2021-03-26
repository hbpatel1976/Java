public class Assignment12
{
	public static void main(String args[])
	{
		int income=1950000;
		double tax=0;
		if(income<=250000)tax=0;
		else if(income>250000 && income<=500000)tax=(0.05*(income-250000));
		else if(income<=500000)tax=(0.05*(income-250000));
		else if(income<=750000)tax=(0.10*(income-500000))+12500;
		else if(income<=1000000)tax=(0.15*(income-750000))+12500+25000;
		else if(income<=1250000)tax=(0.02*(income-1000000))+12500+25000+37500;
		else if(income<=1500000)tax=(0.25*(income-1250000))+12500+25000+37500+50000;
		else tax=(0.30*(income-1500000))+12500+25000+37500+50000+62500;
		System.out.println("Tax="+tax);
	}
}