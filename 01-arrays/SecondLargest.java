// Problem: Find the second largest distinct element
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

public class SecondLargest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];

        for(int i = 0; i < a; i++)
        {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int Secondlargest = Integer.MIN_VALUE;

        for(int i = 0; i < a; i++)
        {
            if(arr[i] > largest)
            {
                Secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > Secondlargest && arr[i] != largest)
            {
                Secondlargest = arr[i];
            }
        }

        System.out.println("The second largest element is " + Secondlargest);
    }
}
