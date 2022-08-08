public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int maxSale() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int stat() {
        int sum = 0;
        int result = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            result = (sum - getMax() - getMin()) / sales.length;

        }
        return result;
    }

    public int getMax() {
        int maxValue = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxValue) {
                maxValue = sales[i];
            }
        }
        return maxValue;
    }

    public int getMin() {
        int minValue = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < minValue) {
                minValue = sales[i];
            }
        }
        return minValue;
    }

    @Override
    public String toString() {
        return "Самая дорогая продажа: " + maxSale() + ". " + "Расчет обрезанного среднего: " + stat();
    }
}