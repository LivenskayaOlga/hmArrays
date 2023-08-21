package ru.netology.stats.hwarrays.services;

public class StatsService {
    public int calcSumAllSales(int[] sumSale) { // считает сумму всех продаж;

        int allSum = 0;

        for (int i = 0; i < sumSale.length; i++) {
            allSum = allSum + sumSale[i];
        }

        return allSum;

    }

    public float calcAverageSumAllSales(int[] sumSale) { //средняя сумма продаж в месяц

        int sumAllSales = calcSumAllSales(sumSale);

/*        for (int i = 0; i < sumSale.length; i++) {

            sumAllSales = sumAllSales + sumSale[i];
        }*/


        float averageSum = (float) sumAllSales / sumSale.length;
        return (float) (Math.rint(100 * averageSum) / 100);
    }

    public int maxSales(int[] sales) { // номер месяца, в котором был пик продаж
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] sales) { // номер месяца, в котором был минимум продаж
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int numberMonthOnSalesBelowAwerege(int[] sales) { //продажи ниже средних
        int countMinMonth = 0;
        //int sumAllSales = 0;

        /*for (int i = 0; i < sales.length; i++) {
            sumAllSales = (int) (sumAllSales + sales[i]);
        }

        float averageSum = (float) sumAllSales / sales.length;*/
        float averageSum = calcAverageSumAllSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) {
                countMinMonth = countMinMonth + 1;
            }
        }
        return countMinMonth;

    }

    public int numberMonthOnSalesAboveAwerege(int[] sales) { //продажи выше средних
        int countMaxMonth = 0;
       //int sumAllSales = 0;

/*        for (int i = 0; i < sales.length; i++) {
            sumAllSales = (int) (sumAllSales + sales[i]);
        }

        float averageSum = (float) sumAllSales / sales.length;*/

        float averageSum = calcAverageSumAllSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) {
                countMaxMonth = countMaxMonth + 1;
            }
        }
        return countMaxMonth;

    }


}

