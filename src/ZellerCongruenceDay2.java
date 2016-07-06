/**
 * Created by DISACHDE on 7/6/2016.
 */

import java.util.Scanner;

public class ZellerCongruenceDay2 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean timeToQuit = false;

        do {
            System.out.println("Enter the day (in the range (1-31)");
            String line = sc.nextLine();
            timeToQuit = "quit".equalsIgnoreCase(line);

            if (timeToQuit)
                System.exit(0);

            int day = Integer.valueOf(line);


            System.out.println("Enter the month (in the range (1-12)");
            int month = Integer.parseInt(sc.nextLine());


            System.out.println("Enter the year (YYYY)");
            String line1 = sc.nextLine();
            int year = Integer.valueOf(line1);

            if ((month == 1) || (month == 2)) {
                month = month + 12;
                year = year - 1;
            }

            int a = (13 * (month + 1) / 5);
            int b = year / 4;
            int c = 6 * (int) (year / 100);
            int d = (int) (year / 400);

            int result = (a + b + c + d + year + day) % 7;

            switch (result) {
                case 0:
                    System.out.println("Saturday");
                    break;
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                default:
                    System.out.println("Invalid result");
            }

        } while (!timeToQuit);

    }
}
