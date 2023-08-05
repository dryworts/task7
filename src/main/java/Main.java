import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.sumSales(sales));
        System.out.println(service.averageAmount(sales));
        System.out.println(service.maxAmountMonth(sales));
        System.out.println(service.minAmountMonth(sales));
        System.out.println(service.countMonthsLessEverage(sales));
        System.out.println(service.countMonthsMoreEverage(sales));
    }
}
