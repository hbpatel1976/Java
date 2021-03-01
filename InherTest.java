class room
{
int l,w;
room(int x, int y) {l=x; w=y; }
int area() { return l*w; }
}

class BedRoom extends room
{
int h;
BedRoom(int x, int y, int z)
	{
	super(x,y);
	h=z;
}
int volume()
	{
	return l*w*h;
}
}
class InherTest
{
	public static void main(String args[])
		{
		BedRoom room1 = new BedRoom(14,12,10);
		int area1 = room1.area();
		int volume1=room1.volume();
		System.out.println("Area 1 = "+area1);
		System.out.println("Volume 1 = "+volume1);
		}
}