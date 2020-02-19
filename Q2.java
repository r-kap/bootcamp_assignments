package Demo.assignment2;

import java.util.Comparator;
import java.util.Vector;

//2. WAP to sorting string without using string Methods?.
public class Q2
{
    //

    public static void main(String[] args)
    {
        String s = "This is a line";
        String[] arr = s.split(" ");
        Vector<String> v = new Vector<>();

        for(String x : arr)
            v.add(x);
        v.sort(new Comparator<String>()
        {
            @Override
            public int compare(String s1, String s2)
            {
                return s1.length() - s2.length();
            }

        });

        for(String i: v)
        {
            System.out.println(i);
        }
    }
}
