package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxIfSameNumbers() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 12, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxIfOnlyZeroes() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0, 0};
        long expected = 0;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxIfNegativeNumbers() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-100, -20};
        long expected = -20;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

}