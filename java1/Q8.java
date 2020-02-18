package Demo.Assignment;

import java.util.Scanner;

public class Q8
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        StringBuffer sb = new StringBuffer(s);

        //buffer reversed
        sb.reverse();

        //replace as needed
        sb = sb.replace(4, 10, "");
        System.out.println(sb.toString());
    }
}
