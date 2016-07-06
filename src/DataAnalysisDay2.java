/**
 * Created by DISACHDE on 7/6/2016.
 */

import java.util.Scanner;

public class DataAnalysisDay2 {

    public static void main (String args[]) {
        int i = 0;
        int smallest = 0;
        int largest =0;
        double sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of data items:");
        int number = Integer.parseInt(sc.nextLine());

        int arr[] = new int[number];
        System.out.println(" Enter the values");
        for (i = 0; i < number; i++) {
            arr[i] = Integer.parseInt(String.valueOf(sc.nextInt()));
            sum = sum + arr[i];

            if(i==0)
            {
                smallest = arr[0];
                largest = arr[0];
            }

            if (arr[i] < smallest)
                smallest = arr[i];
            if (arr[i] > largest)
                largest = arr[i];
        }

        double mean = sum / number;
        System.out.println("Mean of the numbers is " + mean);
        System.out.println("Smallest number is "+smallest);
        System.out.println("Largest number is "+largest);

    }
}
