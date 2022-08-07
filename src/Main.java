public class Main {
    public static void main(String[] args) {
        int[] sales = new int[]{22, 33, 44, 55};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.toString());
    }
}
