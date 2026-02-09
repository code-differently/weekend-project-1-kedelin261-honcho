import java.util.Random;
import java.util.Scanner;

public class ReceiptApp {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // User Input
        System.out.print("What is your name? ");
        String name = scanner.nextLine().trim();

        System.out.print("What is your budget? ");
        double budget = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What is your coupon code: ");
        String coupon = scanner.nextLine();

        // Random Input
        int visitId = PriceGenerator.generateVisitId(random);
        double[] items = PriceGenerator.generateItemPrices(random);
        double taxRate = PriceGenerator.generateTaxRate(random);

        String receiptCode = CodeGenerator.buildReceiptCode(name, visitId);

        double subtotal = PriceGenerator.subtotal(items);
        double tax = subtotal * taxRate;

        double luckyDiscount = PriceGenerator.luckyVisitBonusDiscount(visitId, subtotal);
        double mystery = PriceGenerator.mysteryAdjustment(random, subtotal);
        double couponDiscount = PriceGenerator.couponDiscount(random, coupon, subtotal);

        double total = subtotal + tax + mystery - luckyDiscount - couponDiscount;
        total = PriceGenerator.roundMoney(Math.max(0, total));

        double remaining = PriceGenerator.roundMoney(budget - total);

        ReceiptPrinter.print(
                "Ken's Grocery Store",
                name,
                visitId,
                receiptCode,
                items,
                subtotal,
                taxRate,
                tax,
                mystery,
                luckyDiscount,
                coupon,
                couponDiscount,
                total,
                budget,
                remaining
        );

        scanner.close();
    }
}

