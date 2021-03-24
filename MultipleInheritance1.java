interface motorcycle
{
	int speed=50;
	public void distanceCovered();
}
interface cycle
{
	int time=60;
	public void runningTime();
}
class TwoWheeler implements motorcycle, cycle
{
	int avgSpeed=speed;
	int avgTime=time;
	public void distanceCovered() {System.out.println("Distance Travelled = "+avgSpeed*avgTime);}
	public void runningTime() {System.out.println("Average Running Time = "+avgTime);}
}
public class MultipleInheritance1 
{
	public static void main(String args[])
	{
		TwoWheeler t = new TwoWheeler();
		t.distanceCovered();
		t.runningTime();
	}
}