interface Area
        {
        final static float pi=3.14f;
        float compute(float x, float y);
        }
class R implements Area
        {
        public float compute(float x, float y)
                { return (x*y); }
        }
class C implements Area
        {
        public float compute(float x, float y)
                { return (x*x*pi); }
        }
class InterfaceTest
        {
        public static void main(String args[])
                {
        		R rect=new R();
                C cir=new C();
                Area area;
                area=rect;
                System.out.println("Area of Rectangle = "+rect.compute(10,20));
                area=cir;
                System.out.println("Area of Circle = "+cir.compute(10,0));
                }
        }