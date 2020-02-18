package Demo.Assignment;

import java.util.Scanner;

public class Q4
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String s = obj.next();
        int upper_count=0, lower_count=0, special_count=0, digit_count=0;

        //we just iterate through the String and check for ASCII ranges.
        //if a char lies in a particular range then we increment the corresponding counter.
        for(char c : s.toCharArray())
        {
            if(c <= 90 && c >=65)
            {
                upper_count++;
            }
            else if(c <= 122 && c >= 97)
            {
                lower_count++;
            }

            else if(c <= 57 && c >= 48)
                digit_count++;

            else
                special_count++;

        }
        int length = s.length();
        System.out.println("Number of things in this damn string:");

        System.out.println("upperCase letters: "+ upper_count + " " + ((float)upper_count/length)*100 + " %");
        System.out.println("lowerCase letters: "+ lower_count + " " + ((float)lower_count/length)*100 + " %");
        System.out.println("SpecialCase letters: "+ special_count + " " + ((float)special_count/length)*100 + " %");
        System.out.println("Digits: "+ digit_count + " " + ((float)digit_count/length)*100 + " %");

    }
}
