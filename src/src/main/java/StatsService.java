public class StatsService {
    public static void main(String[] args) {
        StatServ service = new StatServ();
        int[] orders = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int ordersTotal = service.calculateSum(orders);
        int period = orders.length;
        float ordersAverage = ordersTotal/period;
        int maxOrdersMonth = service.numberMaxOrders(orders);
        int minOrdersMonth = service.numberMinOrders(orders);
        int monthsUnderAverage = service.monthsUnderAverage(orders);
        int monthsOverAverage = service.monthsUnderAverage(orders);

    }
}
