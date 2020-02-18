package Demo.Assignment;

import java.util.HashMap;
import java.util.Map;

public class Q2
{
    public static void main(String[] args) {

        //Q2
        Map<String , Integer> myMap = new HashMap<>();
        String ss = "This my name who you name";
        String[] arr = ss.split(" ");

        for(String x: arr)
        {
            System.out.println("current string:" + x);
            if(myMap.containsKey(x))
            {
                myMap.replace(x, myMap.get(x)+1);
            }
            else
            {
                myMap.put(x,1);
            }
        }

        System.out.println("Duplicate words in the string -->");
        //a lambda expression to iterate through the Map elements
        myMap.forEach((key, value) -> {
            if ((int) value > 1)
                System.out.print((String) key);
        });

        System.out.println(myMap);
    }
}
