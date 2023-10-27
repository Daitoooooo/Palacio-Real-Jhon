import java.util.Random;
import java.util.Scanner;

public class ActivityThreePalacio {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Random myOrder = new Random();
      int codePrint = myOrder.nextInt(5000);
      boolean isOrdering = true;
      boolean continueOrder = true;
      double dollar = 56.0;
     
      while (continueOrder) {
         System.out.println("Menu:");
         System.out.println("1. C1");
         System.out.println("2. C2");
         System.out.println("3. C3");
         System.out.println("Add ons:");
         System.out.println("4. R1");
         System.out.println("5. R2");
       
         int userRespo = scan.nextInt();
         
               
         switch (userRespo) {
            case 1:
               int price1 = 100;
               System.out.println("C1 - Php 100.00");
               System.out.print("Quantity: ");
               double qty1 = scan.nextDouble();
               double totalPrice1 = price1 * qty1 / dollar;
               
               String formattedTotalPrice1 = String.format("%.2f", totalPrice1);
               System.out.println("Total Price: $" + formattedTotalPrice1);
               System.out.println("Order Code: " + codePrint);
               break;
            case 2:
               int price2 = 150;
               System.out.println("C2 - Php 150.00");
               System.out.print("Quantity: ");
               double qty2 = scan.nextDouble();
               double totalPrice2 = price2 * qty2 / dollar;
               
               String formattedTotalPrice2 = String.format("%.2f", totalPrice2);
               System.out.println("Total Price: $" + formattedTotalPrice2);
               System.out.println("Order Code: " + codePrint);
               break;
            case 3:
               int price3 = 200;
               System.out.println("C3 - Php 200.00");
               System.out.print("Quantity: ");
               double qty3 = scan.nextDouble();
               double totalPrice3 = price3 * qty3 / dollar;
               
               String formattedTotalPrice3 = String.format("%.2f", totalPrice3);
               System.out.println("Total Price: $" + formattedTotalPrice3);
               System.out.println("Order Code: "+ codePrint);
               break;
            case 4:
               int priceR1 = 35;
               System.out.println("R1 - Php 35.00");
               System.out.print("Quantity: ");
               double qtyR1 = scan.nextDouble();
               double totalPriceR1 = priceR1 * qtyR1 / dollar;
               
               String formattedTotalPriceR1 = String.format("%.2f", totalPriceR1);
               System.out.println("Total Price: $" + formattedTotalPriceR1);
               System.out.println("Order Code: " + codePrint);
               break;
            case 5:
               int priceR2 = 50;
               System.out.println("R2 - Php 50.00");
               System.out.print("Quantity: ");
               double qtyR2 = scan.nextDouble();
               double totalPriceR2 = priceR2 * qtyR2 / dollar;
               
               String formattedTotalPriceR2 = String.format("%.2f", totalPriceR2);
               System.out.println("Total Price: $" + formattedTotalPriceR2);
               System.out.println("Order Code: " + codePrint);
               break;
            default:
               System.out.println("Invalid");
         }
         
         System.out.println("Do you want to continue ordering? (yes/no)");
         String continueResponse = scan.next().toLowerCase();
         if (!continueResponse.equals("yes")) {
            continueOrder = false;
         }
      }
   }
}
