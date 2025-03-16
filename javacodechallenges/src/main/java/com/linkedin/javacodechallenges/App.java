package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        // TODO: Implement method
        double minCharge = 18.84;
        double limitMinCharge = 1496.00;
        double CCF = 748.00;
        double additionalCharge = 3.9;

        if (gallonsUsage <= limitMinCharge)
        {
            return minCharge;
        }
        else {
            double res = ((gallonsUsage-limitMinCharge)/CCF);
            int numOfAdditionalCCF = (int)Math.ceil(res);
            System.out.println("additional CCF = " + numOfAdditionalCCF);
            return minCharge + (additionalCharge * numOfAdditionalCCF);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
