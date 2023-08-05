package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumSales(sales);

        //производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateEverageAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageAmount(sales);

        //производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxAmountMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxAmountMonth(sales);

        //производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinAmountMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minAmountMonth(sales);

        //производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsLessEverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthsLessEverage(sales);

        //производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsMoreEverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthsMoreEverage(sales);

        //производим проверку
        Assertions.assertEquals(expected, actual);
    }

}
