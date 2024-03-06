package ru.netology.stats.hw6;

public class StatsService {
    public int sumSales(long[] sales) {             // Сумма всех месяцев
        int sum = 0;
        for (long i : sales) {
            sum += i;
        }
        return sum;
    }

    public int averageSumSale(long[] sales) {
        return sumSales(sales) / sales.length;     // Среднее значение
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {    // Минимальное значение
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMounth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMounth]) {     // Максимальное значение
                maxMounth = i;
            }
        }
        return maxMounth + 1;
    }

    public int getMinSale(long[] sales) {
        int minSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= averageSumSale(sales)) { // Меньше среднего
                minSale++;
            }
        }
        return minSale;
    }

    public int getMaxSale(long[] sales) {
        int maxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= averageSumSale(sales)) { // Больше среднего
                maxSale++;
            }
        }
        return maxSale;
    }
}