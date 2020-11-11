public class StatsService {
    public static void main(String[] args) {
        StatServ service = new StatServ();
        int[] orders = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int ordersTotal = service.calculateSum(orders); //
        int period = orders.length;
        float ordersAverage = ordersTotal/period;
        int maxOrdersMonth = service.numberMaxOrders(orders);
        int minOrdersMonth = service.numberMinOrders(orders);
        int monthUnderAverage = service.MonthsUnderAverage(orders,ordersAverage);
        int monthOverAverage = service.MonthsUnderAverage(orders,ordersAverage);


    }
}
class StatServ {
    public int calculateSum(int[] orders){
        int sum = 0;
        for (int order:orders){
            sum += order;
        }
        return sum;

    }
    public int numberMaxOrders(int[] orders){
        int index = 0;
        int indexMax = 0;
        int currentMax = orders[0];
        for (int order:orders){
            if (currentMax < order){
                currentMax = order;
                indexMax = index;
            }
            index += 1;
        }
        return indexMax+1;
    }
    public int numberMinOrders(int[] orders){
        int index = 0;
        int indexMin = 0;
        int currentMin = orders[0];
        for (int order:orders){
            if (currentMin > order){
                currentMin = order;
                indexMin = index;
                }
            index += 1;
        }
        return indexMin+1;
    }
    public int MonthsUnderAverage(int[] orders,float average){
        int count = 0;
        for ( int order:orders){
            if (order < average){
                count += 1;
            }
        }
        return count;
    }
    public int MonthsOverAverage(int[] orders,float average){
        int count = 0;
        for ( int order:orders){
            if (order > average){
                count += 1;
            }
        }
        return count;
    }


}