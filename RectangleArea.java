class Rect
	{
	int l,w;
	Rect(int x, int y) {l=x; w=y; }
	int rectArea() { return l*w; }
	}
class RectangleArea
	{
	public static void main(String args[])
		{
		Rect rect1 = new Rect(15,10);
		int area1 = rect1.rectArea();
		System.out.println("Area1 = " + area1);
		}
	}