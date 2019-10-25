
/*
using scanner/for loop and array
complete initialized array/scanner values and use for-loops to iterate and print out sum of entry

ask user for 10 numbers
save them in an array
using array compete sum & average
 */

import java.util.Scanner;

public class arrayEx2 {
    public static void main(String[] args) {


        int sum = 0;
        float ave;
        int numbers[] = new int[10];
        // to populate array with ten numbers from user
        for (int i = 0; i < 10; i++) {
            System.out.println("enter number:");
            Scanner keybd = new Scanner(System.in);
            int userIn = keybd.nextInt();
            numbers[i] = userIn;
            sum = sum + numbers[i];
         //   System.out.println("sum is " + sum);
        }
      //  System.out.println("sum is " + sum);
        ave = (sum / 10);
        System.out.println("sum is " + sum);
        System.out.println("average is " + ave);

    }

}

