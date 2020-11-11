import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldcalculateSumm() {
        StatServ service = new StatServ();
        int[] orders = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(orders);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldNumberMaxOrders() {
        StatServ service = new StatServ();
        int[] orders = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;
        int actual = service.numberMaxOrders(orders);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldNumberMinOrders() {
        StatServ service = new StatServ();
        int[] orders = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.numberMinOrders(orders);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldMonthsUnderAverage() {
        StatServ service = new StatServ();
        int[] orders = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int period = orders.length;
        int ordersTotal = 180;
        float average = ordersTotal/period;
        int expected = 5;
        int actual = service.MonthsUnderAverage(orders, average);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldMonthsOverAverage() {
        StatServ service = new StatServ();
        int[] orders = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int period = orders.length;
        int ordersTotal = 180;
        float average = ordersTotal/period;
        int expected = 5;
        int actual = service.MonthsOverAverage(orders, average);
        assertEquals(expected, actual);
    }
}