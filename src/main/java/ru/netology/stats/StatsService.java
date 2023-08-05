package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageAmount(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (sum + sales[i]);
        }
        return sum / sales.length;
    }

    public int maxAmountMonth(int[] sales) {
        int maxValueMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxValueMonth]) {
                maxValueMonth = i;
            }
        }
        return maxValueMonth + 1;
    }

    public int minAmountMonth(int[] sales) {
        int minValueMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minValueMonth]) {
                minValueMonth = i;
            }
        }
        return minValueMonth + 1;
    }

    public int countMonthsLessEverage(int[] sales) {
        int countLess = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount(sales)) {
                countLess++;
            }
        }
        return countLess;
    }


    public int countMonthsMoreEverage(int[] sales) {
        int countMore = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount(sales)) {
                countMore++;
            }
        }
        return countMore;
    }


}