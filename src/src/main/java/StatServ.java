public class StatServ {
    public int calculateSum(int[] orders) {
        int sum = 0;
        for (int order : orders) {
            sum += order;
        }
        return sum;
    }

    public float ordersAverage(int[] orders){
        //int ordersTotal = calculateSum(orders);
        //int period = orders.length;
        float orderAverage = calculateSum(orders)/orders.length;
        return orderAverage;
    }

    public int numberMaxOrders(int[] orders){ // метод находит только одно (первое) максимальное значение
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

    public int numberMinOrders(int[] orders){ // метод находит только одно (первое) минимальное значение
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

    public int monthsUnderAverage(int[] orders){
        int count = 0;
        float average = ordersAverage(orders);
        for ( int order:orders){
            if (order < average){
                count += 1;
            }
        }
        return count;
    }

    public int monthsOverAverage(int[] orders){
        int count = 0;
        float average = ordersAverage(orders);
        for ( int order:orders){
            if (order > average){
                count += 1;
            }
        }
        return count;
    }
}
