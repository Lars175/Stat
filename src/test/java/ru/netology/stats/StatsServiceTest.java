package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
        //      сумма всех продаж
    void shouldCalculateSumAllSales() {
        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.allSumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
        //   Средняя сумма продаж в месяц
    void shouldCalculateAverageAmount() {
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.averageAmount(sales);

        assertEquals(expected, actual);
    }

    @Test
        //  Номер месяца, в котором был пик продаж
    void shouldCalculateFindMaxMonth() {
        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.findMax(sales);

        assertEquals(expected, actual);
    }

    @Test
//    Номер месяца, в котором был минимум продаж
    void shouldCalculateFindMinMonth() {
        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.findMin(sales);

        assertEquals(expected, actual);

    }

    @Test
//    Кол-во месяцев, в которых продажи были ниже среднего
    void shouldCalculateSaleBelowMiddle() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.saleBelowMiddle(sales);

        assertEquals(expected, actual);
    }

    @Test
//    Кол-во месяцев, в которых продажи были выше среднего
    void shouldCalculateSaleAboveMiddle() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.saleAboveMiddle(sales);

        assertEquals(expected, actual);
    }
 }


