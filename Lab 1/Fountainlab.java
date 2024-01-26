import java.util.*;
import java.text.NumberFormat;
// A sample input/output exchange for a correctly completed version of
// this program is listed as a separate attachment.

public class FountainLab {

    public static void main(String args[]) {
// Create a Scanner to read from user input
        Scanner in = new Scanner(System.in);
// TODO - delete this section - it simply shows you how you might
// keep asking the user for an input.
       
        double radius = 0;
        double width1 = 0;
        double width2 = 0;
        double depth = 0;
        

        System.out.println("What is the radius?");

        while (radius < 10.0 || radius > 15.0) {
            System.out.println("Enter a number between 10.0 and 15.0: ");
            radius = in.nextDouble();

            if (radius < 10.0 || radius > 15.0) {
                System.out.println("INVALID INPUT");
            }
        }

        System.out.println("What is the width?");

        while (width1 < 2.0 || width1 > 8.0) {
            System.out.println("Enter a number between 2.0 and 8.0: ");
            width1 = in.nextDouble();

          if (width1 < 2.0 || width1 > 8.0) {
                System.out.println("INVALID INPUT");
            }

        }

        System.out.println("What is the second width?");
        while (width2 < 2.0 || width2 > 8.0) {
            System.out.println("Enter a number between 2.0 and 8.0: ");
            width2 = in.nextDouble();

            if (width2 < 2.0 || width2 > 8.0) {
                System.out.println("INVALID INPUT");
            }
        }

        System.out.println("What is the depth?");
        while (depth < 1.0 || depth > 3.0) {
            System.out.println("Enter a number between 1.0 and 3.0: ");
            depth = in.nextDouble();

            if (depth < 1.0 || depth > 3.0) {
                System.out.println("INVALID INPUT");
            }
        }
// TODO - ask for each of ‘radius‘, ‘width1‘, ‘width2‘, ‘depth‘.
// Remember to keep asking if the value is out of range, and to
// tell the user that they’ve entered an invalid value.
// TODO - print the calculated statistics specified in
// "NABI, WHY ARE YOU IGNORING US!!!!"
// You can print dollar amounts with the following code. Note that
// if you just print a double, it may not print two decimal places
// worth of pennies (e.g. "$8.80" would appear as "$8.8").

              double cyl_volume =  Math.PI * Math.pow(radius,2)*depth;
                    System.out.println("Your cylinder volume is " + cyl_volume);
                      
              double rec_volume = width1 *depth * width2;
                   System.out.println("Your rectangle volume is " + rec_volume);
                   
              double total_volume = cyl_volume - rec_volume;
                 System.out.println("Your total volume is " + total_volume);

            double gallons = total_volume *  7.481;
            System.out.println("Your volume in gallons are " + gallons);
            
            double rounded = Math.ceil(gallons) * .10;
       
            
        double cost = rounded;
        System.out.println("That amount of water will cost: "
                + NumberFormat.getCurrencyInstance().format(cost));
        
        
    }
}
