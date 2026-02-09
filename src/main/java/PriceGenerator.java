import java.util.Random;

public class PriceGenerator {

    public static int generateVisitId(Random random) {
        return 1000 + random.nextInt(9000); // 1000–9999
    }

    public static double[] generateItemPrices(Random random) {


        double[] items = new double[3];
        for (int i = 0; i < items.length; i++) {


            // $2.50 to $35.00
            double raw = 2.50 + (32.50 * random.nextDouble());
            items[i] = roundMoney(raw);
        }
        return items;
    }

    public static double generateTaxRate(Random random) {
        // 4% to 9%
        return 0.04 + (0.05 * random.nextDouble());
    }

    public static double subtotal(double[] items) {
        double sum = 0;

        for (double p : items) sum += p;

        return roundMoney(sum);
    }

    // Lucky visit bonus (if last digit is 7 => 7% off)
    public static double luckyVisitBonusDiscount(int visitId, double subtotal) {
        if (visitId % 10 == 7) {
            return roundMoney(subtotal * 0.07);
        }
        return 0.0;
    }

    // Mystery fee or discount
    public static double mysteryAdjustment(Random random, double subtotal) {
        boolean fee = random.nextBoolean();

        double percent = 0.02 + (0.04 * random.nextDouble()); // 2%..6%

        double amount = roundMoney(subtotal * percent);

        return fee ? amount : -amount;
    }

    // VIP coupon randomly works + case-insensitive check
    public static double couponDiscount(Random random, String couponCode, double subtotal) {
        if (couponCode != null && couponCode.trim().equalsIgnoreCase("VIP")) {
            boolean works = random.nextInt(10) < 6;// 60%
            if (works) {
                return roundMoney(subtotal * 0.15);
            }
        }
        return 0.0;
    }

    public static double roundMoney(double value) {
        return Math.round(value * 100.0) / 100.0;



    }
}
