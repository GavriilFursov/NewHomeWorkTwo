public class Main {
    public static void main(String[] args) {
        long[] sales = new long[]{22, 33, 44, 55};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.toString());
    }
}
