package ru.netology.stats;

public class StatsService {

   public int allSumSales(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageAmount(int[] sales) {

       int sum = allSumSales(sales);

        return sum / sales.length;
    }

    public int findMax(int[] sales) {

        int maxSale  = sales[0];
        int mothMaxSale = 0;
        for (int i = 0;  i < sales.length; i++) {
            int sale = sales[i];
            if (maxSale <= sale) {
                maxSale = sale;
                mothMaxSale = i + 1;
            }
        }

        return mothMaxSale;
            }


    public int findMin(int[] sales)  {

        int minSale = sales[0];
        int mothMinSale = 0;
        for (int i = 0;  i < sales.length; i++) {
            int sale = sales[i];
            if (minSale >= sale) {
                minSale = sale;
                mothMinSale = i + 1;
            }
        }
        return mothMinSale;
    }

    public int saleBelowMiddle(int[] sales) {

        StatsService service = new StatsService();

        int belowMiddle = 0;
        for (int sale : sales) {
            if (service.averageAmount(sales) < sale)
                belowMiddle++;
        }
        return belowMiddle;
    }

    public int saleAboveMiddle(int[] sales) {
        StatsService service = new StatsService();
        int aboveMiddle = 0;
        for (int sale : sales) {
            if (service.averageAmount(sales) > sale)
                aboveMiddle++;
        }
        return aboveMiddle;
    }
}
