class Rectangle
        {
        int l,w;
        void getdata(int x,int y){l=x;w=y;}
        int area(){int a=l*w;return (a);}
        }
class RectArea
        {
        public static void main(String arga[])
                {
                int a1,a2;
                Rectangle r1=new Rectangle();
                Rectangle r2=new Rectangle();
                r1.l=15;
                r1.w=10;
                a1=r1.l*r1.w;
                r2.getdata(20,12);
                a2=r2.area();
                System.out.println("Area 1 = "+a1);
                System.out.println("Area 2 = "+a2);
                }
        }