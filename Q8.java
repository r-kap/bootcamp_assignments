package Demo.assignment2;

//8. WAP to read words from the keyboard until the word done is entered.
// For each word except done, report whether its first character is equal to  its last character.
// For the required loop, use a
//a)while statement
//b)do-while statement

import java.util.Scanner;

public class Q8
{
    public static void checker(String s)
    {
        int l = s.length();
        if(s != null)
        {
            if (s.charAt(0) == s.charAt(l - 1))
                System.out.println("yes it has");
            else System.out.println("no it has not");
        }
    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        do
        {
            String s = obj.next();
            if(s.equals("done"))
                break;
            checker(s);
            s = null;
        }while(!obj.nextLine().equals("done"));

        //to do the same thing using while loop, un-comment the following lines of code -->
      /*
      *
      *
        while(!obj.next().equals("done"))
        {
          String s = obj.nextLine();
          checker(s);
        }

        *
       */
    }
}
