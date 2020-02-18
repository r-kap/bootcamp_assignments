package Demo.Assignment;

import java.util.*;

public class Q6
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        Map<Integer, Integer> hm = new HashMap<>();
        int[] arr = {1,2,3,4,5,9,1,2,3,4,5};

        for(int i: arr)
        {
            //if the key(element) is already in the Map, we increase the count for occurences of the key by 1.
            //else we add the element to the map with count 1
            if(hm.containsKey(i))
                hm.replace(i, hm.get(i)+1);
            else
                hm.put(i, 1);
        }


        //iterating through the Map and checking if the value(counter) is 1.
        for(Map.Entry e: hm.entrySet())
        {
            //un-comment the following line to check the Map elements
            //System.out.println((int)e.getKey()+": "+ (int)e.getValue());
            if((int)e.getValue() == 1)
            {
                System.out.println((int)e.getKey());
                break;
            }
        }
    }
}
