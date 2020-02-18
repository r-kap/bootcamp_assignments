package Demo.Assignment;
import java.util.*;

public class Q5
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int[] arr1;
        int[] arr2;
        arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arr2 = new int[]{10, 20, 30, 40, 7, 60, 70, 3, 90, 100};

        int min1, min2;
        int i = 0, j = 0;

        //using a HashSet to store the elements of one array.
        Set<Integer> comms = new HashSet<Integer>();

        for(int x: arr1)
        {
            comms.add(x);
        }

        //if the set contains any element of the 2nd array already, we just print them out.
        for(int y : arr2)
        {
            if(comms.contains(y))
            {
                System.out.println(y);
            }
        }
    }
}
