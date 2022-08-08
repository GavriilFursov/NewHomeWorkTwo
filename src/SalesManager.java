public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long maxSale() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long stat() {
        long sum = 0;
        long result = 0;
        for (long i = 0; i < sales.length; i++) {
            sum = sum + sales[(int) i];
            result = (sum - getMax() - getMin()) / sales.length;

        }
        return result;
    }

    public long getMax() {
        long maxValue = sales[0];
        for (long i = 1; i < sales.length; i++) {
            if (sales[(int) i] > maxValue) {
                maxValue = sales[(int) i];
            }
        }
        return maxValue;
    }

    public long getMin() {
        long minValue = sales[0];
        for (long i = 1; i < sales.length; i++) {
            if (sales[(int) i] < minValue) {
                minValue = sales[(int) i];
            }
        }
        return minValue;
    }

    @Override
    public String toString() {
        return "Самая дорогая продажа: " + maxSale() + ". " + "Расчет обрезанного среднего: " + stat();
    }
}