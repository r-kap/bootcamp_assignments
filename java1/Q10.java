package Demo.Assignment;

public class Q10
{
    public static void add(int x, int y)
    {
        System.out.println(x+y);
    }

    public static void add(float x, float y)
    {
        System.out.println(x+y);
    }

    public static void mul(int a, int b)
    {
        System.out.println(a*b);
    }

    public static void mul(float a, float b)
    {
        System.out.println(a*b);
    }

    public static void concate(String a, String b)
    {
        String c = a+b;
        System.out.println(c);
    }

    public static void concate(String a, String b, String c)
    {
        String d = a+b+c;
        System.out.println(d);
    }

    public static void main(String[] args)
    {
        int a, b;
        float c, d;
        String x, y, z;

        a = 10;
        b = 20;
        c = 5;
        d = 10;
        x = "This";
        y = " is ";
        z = "sparta!";

        add(a, b);
        add(c, d);
        mul(a, b);
        mul(c, d);
        concate(x, y);
        concate(x, y, z);
    }
}
