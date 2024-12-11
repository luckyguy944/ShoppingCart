import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Input the number of items
        System.out.print("Enter the number of items: ");
        int numItems = scanner.nextInt();

        // Step 3: Initialize arrays for item prices and quantities
        double[] itemPrices = new double[numItems];
        int[] quantities = new int[numItems];

        // Step 4: Input item prices and quantities
        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter price for item " + (i + 1) + ": ");
            itemPrices[i] = scanner.nextDouble();
            System.out.print("Enter quantity for item " + (i + 1) + ": ");
            quantities[i] = scanner.nextInt();
        }

        // Step 5: Input tax rate and discount
        System.out.print("Enter tax rate (as a percentage): ");
        double taxRate = scanner.nextDouble();
        System.out.print("Enter discount amount: ");
        double discount = scanner.nextDouble();

        // Step 6: Calculate subtotal
        double subtotal = 0;
        for (int i = 0; i < numItems; i++) {
            subtotal += itemPrices[i] * quantities[i];
        }

        // Step 7: Calculate tax
        double tax = subtotal * (taxRate / 100);

        // Step 8: Validate discount
        if (discount < 0) {
            System.out.println("Error: Discount cannot be negative.");
            discount = 0;
        }

        // Step 9: Calculate final total
        double finalTotal = subtotal + tax - discount;

        // Step 10: Display results
        System.out.println("----- Invoice -----");
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Discount: $%.2f\n", discount);
        System.out.printf("Final Total: $%.2f\n", finalTotal);

        // Step 11: Close the scanner
        scanner.close();
    }
}
