package Demo.Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Collections;
public class Q1
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        //Q1
        System.out.println("Enter the string, then enter the substring to substitute, " +
                "then enter the string with which to substitute it.");
        String s = obj.nextLine();
        String sub = obj.nextLine();
        String add = obj.nextLine();
        s = s.replace(sub, add);
        System.out.println("The new string is: "+ s);

    }
}

