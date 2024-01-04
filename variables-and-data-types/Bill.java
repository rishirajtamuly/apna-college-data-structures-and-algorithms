/* Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

import java.util.*; 

public class Bill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost of a pencil : ");
        float pencil = sc.nextFloat();
        System.out.print("Enter cost of a pen : ");
        float pen = sc.nextFloat();
        System.out.print("Enter cost of an eraser : ");
        float eraser = sc.nextFloat();
        sc.close();
        float total = pencil + pen + eraser;
        System.out.println("Bill is : " + total);

        //Add on - with 18% tax
        float newTotal = total + (0.18f * total);
        System.out.println("Bill with 18% tax : " + newTotal);
    }
}
