
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
        Scanner keybd = new Scanner(System.in);
        int sum = 0, usrNo = 0;
        double ave;


        System.out.println("how many numbers would you like to enter?");
        usrNo= keybd.nextInt();
        keybd.nextLine();


        // to populate array with ten numbers from user
        int numbers[] = new int[usrNo];
        for (int i = 0; i < usrNo; i++) {
            System.out.println("enter number:");

            int userIn = keybd.nextInt();
            keybd.nextLine();
            numbers[i] = userIn;
            sum = sum + numbers[i];
         //   System.out.println("sum is " + sum);
        }
      //  System.out.println("sum is " + sum);
        ave = sum / (usrNo*1.0);
        System.out.println("sum is " + sum);
        System.out.println("average is " + ave);

    }

}

