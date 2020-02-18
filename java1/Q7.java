package Demo.Assignment;

import java.sql.SQLOutput;

public class Q7
{
    static String firstName = "Gitanshu";
    static String lastName = "Batra";
    static int age = 22;

    static
    {
        System.out.println("Inside static block -->");
        String firstName = "Varun";
        String lastName = "Kapoor";
        int age = 22;
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }

    static void display()
    {
        System.out.println("Inside a static method -->");
        String firstName = "Rohit";
        String lastName = "Kapoor";
        int age = 22;
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }

    public static void main(String[] args)
    {
        display();

        System.out.println("Now displaying the static variable: ");
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }
}
