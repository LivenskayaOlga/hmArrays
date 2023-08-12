import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.hwarrays.services.StatsService;

public class StatsSeviceTest {

    @Test
    public void calcSumAllSalesIfHaveEqualAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.calcSumAllSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void AverageSumAllSalesEqualSalesOnMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        float expectedAverage = 15;
        float actualAverege = service.calcAverageSumAllSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverege);

    }

    @Test
    public void MonthMaxSalesIfHaveEqualAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonthSales = 6;
        int actualMaxMonthSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonthSales, actualMaxMonthSales);

    }

    @Test
    public void MonthMinSalesIfManthMinOnlyOne() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonthSales = 9;
        int actualMinMonthSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonthSales, actualMinMonthSales);

    }

    @Test
    public void numberMonthOnSalesBelowAweregeIfSalesOnMontEqualAwerege() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumberMonth = 5;
        int actualNumberMonth = service.numberMonthOnSalesBelowAwerege(sales);

        Assertions.assertEquals(expectedNumberMonth, actualNumberMonth);

    }

    @Test
    public void numberMonthOnSalesAboveAweregeIfSalesOnMontEqualAwerege() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumberMonth = 5;
        int actualNumberMonth = service.numberMonthOnSalesAboveAwerege(sales);

        Assertions.assertEquals(expectedNumberMonth, actualNumberMonth);

    }
}
