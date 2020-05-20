package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
        //      сумма всех продаж
    void shouldCalculateSumAllSales() {


        int expected = 180;
        int actual = service.allSumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
        //   Средняя сумма продаж в месяц
    void shouldCalculateAverageAmount() {


        int expected = 15;
        int actual = service.averageAmount(sales);

        assertEquals(expected, actual);
    }

    @Test
        //  Номер месяца, в котором был пик продаж
    void shouldCalculateFindMaxMonth() {

        int expected = 8;
        int actual = service.findMax(sales);

        assertEquals(expected, actual);
    }

    @Test
//    Номер месяца, в котором был минимум продаж
    void shouldCalculateFindMinMonth() {

        int expected = 9;
        int actual = service.findMin(sales);

        assertEquals(expected, actual);

    }

    @Test
//    Кол-во месяцев, в которых продажи были ниже среднего
    void shouldCalculateSaleBelowMiddle() {

        int expected = 5;
        int actual = service.saleBelowMiddle(sales);

        assertEquals(expected, actual);
    }

    @Test
//    Кол-во месяцев, в которых продажи были выше среднего
    void shouldCalculateSaleAboveMiddle() {

        int expected = 5;
        int actual = service.saleAboveMiddle(sales);

        assertEquals(expected, actual);
    }
 }






