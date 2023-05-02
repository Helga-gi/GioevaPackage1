package ru.netology.GioevaPackage1.Services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthOfVacationServiceTest {
    @Test
    public void ShouldCalculateVacation() {
        MonthOfVacationService service = new MonthOfVacationService();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }
}