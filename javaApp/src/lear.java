package src;



import java.text.*;
import java.util.Scanner;

public class lear {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter your buying price per share: ");
            double buyingPrice = scan.nextDouble();
            DecimalFormat df = new DecimalFormat("0.00");
            int day = 1;
            double closingPrice = 0.1;
            
            while (true) {
                System.out.println("Enter the closing price for day: "
                        + day + " (any negative value to leave) : ");
                
                closingPrice = scan.nextDouble();
                if (closingPrice < 0.0) break;
                double earnings = closingPrice - buyingPrice;
                if (earnings > 0) {
                    System.out.println("After day " + day + " you earned "
                            + earnings + "per share. ");
                }
                else if (earnings < 0.0) {
                    System.out.println("After day " + day + " you lost "
                            + (-earnings )+ "per share. ");
                }
                else {
                    System.out.println("After day" + day + " you have " +
                            " no earnings per share");
                }
                day += 1;
            }
        }
    }
}

