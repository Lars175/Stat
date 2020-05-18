package ru.netology.stats;

public class StatsService {

//    int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    public long allSumSales(long[] sales) {

        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageAmount(long[] sales) {

        StatsService service = new StatsService();
        long averageSum = allSumSales(sales) / sales.length;

        return averageSum;
    }

    public long findMax(long[] sales) {

        long maxSale  = sales[0];
        long mothMaxSale = 0;
        for (long i = 0;  i < sales.length; i++) {
            long sale = sales[(int) i];
            if (maxSale <= sale) {
                maxSale = sale;
                mothMaxSale = i + 1;
            }
        }

        return mothMaxSale;
            }


    public long findMin(long[] sales)  {

        long minSale = sales[0];
        long mothMinSale = 0;
        for (long i = 0;  i < sales.length; i++) {
            long sale = sales[(int) i];
            if (minSale >= sale) {
                minSale = sale;
                mothMinSale = i + 1;
            }
        }
        return mothMinSale;
    }

    public long belowMiddleSale(long[] sales) {

        StatsService service = new StatsService();

        long belowMiddle = 0;
        for (long sale : sales) {
            if (service.averageAmount(sales) < sale)
                belowMiddle += 1;
        }
        return belowMiddle;
    }

    public long aboveMiddleSale(long[] sales) {
        StatsService service = new StatsService();
        long aboveMiddle = 0;
        for (long sale : sales) {
            if (service.averageAmount(sales) > sale)
                aboveMiddle += 1;
        }
        return aboveMiddle;
    }
}