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
            if(hm.containsKey(i))
                hm.replace(i, hm.get(i)+1);
            else
                hm.put(i, 1);
        }



        for(Map.Entry e: hm.entrySet())
        {
            System.out.println((int)e.getKey()+": "+ (int)e.getValue());
            if((int)e.getValue() == 1)
            {
                System.out.println((int)e.getKey());
                break;
            }
        }
    }
}
