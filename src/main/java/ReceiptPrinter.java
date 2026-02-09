public class ReceiptPrinter {

    public static void print(


            String storeName,

            String customerName,

            int visitId,

            String receiptCode,

            double[] items,
            double subtotal,
            double taxRate,
            double tax,
            double mysteryAdjustment,
            double luckyBonusDiscount,

            String coupon,

            double couponDiscount,
            double total,
            double budget,
            double remaining


    ) {
        System.out.println();

        System.out.println("----- Welcome to " + storeName + " -----");

        System.out.println("Customer: " + customerName);

        System.out.println("Visit ID: " + visitId);

        System.out.println("Receipt Code: " + receiptCode);

        System.out.println("----------------------------------------");

        for (int i = 0; i < items.length; i++) {
            System.out.printf("Item %d: $%.2f%n", (i + 1), items[i]);
        }

        System.out.println("----------------------------------------");

        System.out.printf("Subtotal: $%.2f%n", subtotal);

        System.out.printf("Tax (%.1f%%): $%.2f%n", taxRate * 100.0, tax);

        if (mysteryAdjustment > 0) {
            System.out.printf("Mystery Fee: +$%.2f%n", mysteryAdjustment);

        } else if (mysteryAdjustment < 0) {
            System.out.printf("Mystery Discount: -$%.2f%n", Math.abs(mysteryAdjustment));
        }

        if (luckyBonusDiscount > 0) {
            System.out.printf("Lucky Visit Bonus: -$%.2f%n", luckyBonusDiscount);
        }

        if (couponDiscount > 0) {
            System.out.printf("Coupon (%s) Applied: -$%.2f%n", coupon.trim().toUpperCase(), couponDiscount);
        } else {
            System.out.printf("Coupon (%s): Not Applied%n", coupon.trim());
        }

        System.out.println("----------------------------------------");

        System.out.printf("FINAL TOTAL: $%.2f%n", total);

        System.out.printf("Budget: $%.2f%n", budget);

        if (remaining >= 0) {
            System.out.printf("Budget Remaining: $%.2f%n", remaining);
            if (remaining < 5) {
                System.out.println("WARNING: Tight budget. You're cutting it close.");
            }
        } else {
            System.out.printf("Short By: $%.2f%n", Math.abs(remaining));

            System.out.println("WARNING: You do not have enough budget to complete this order.");

        }

        System.out.println("----------------------------------------");


        System.out.println("Thank you. Come again.");
    }
}
