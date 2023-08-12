import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//сумма всех
        int[] sumSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int allSum = 0;

        for (int i = 0; i < sumSale.length; i++) {
            allSum = allSum + sumSale[i];
        }
        System.out.println(allSum);

// средняя сумма
       /* int[] sumSale = {1,0,0};
        int sumAllSales = 0;

        for (int i = 0; i < sumSale.length; i++) {

            sumAllSales = sumAllSales + sumSale[i];
        }

        System.out.println("Сумма всех продаж " + sumAllSales);
        System.out.println("Количество месяцев " + sumSale.length);


        float averageSum = (float) sumAllSales / sumSale.length;
        System.out.println("Средння сумма продаж " + Math.rint(100*averageSum)/100);
*/
        //public int minSales(long[] sales) {

/*        int[] sales = {1, 3, 5, 2, 1};
        int countMinMonth = 0;
        int sumAllSales = 0;

        for (int i = 0; i < sales.length; i++) {
            sumAllSales = (int) (sumAllSales + sales[i]);
        }

        //System.out.println("Сумма всех продаж " + sumAllSales);

        float averageSum = (float) sumAllSales / sales.length;

        System.out.println("Средняя сумма продаж " + averageSum);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= averageSum) {
                countMinMonth = countMinMonth + 1;
            }

        }
        System.out.println("количество месяцев, в которых продажи были выше среднего " + countMinMonth);*/

    }
}




