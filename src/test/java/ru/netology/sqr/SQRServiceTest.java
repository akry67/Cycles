package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldNumberOfSquares() {
        SQRService service = new SQRService();

        int lowerLimit = 200;
        int upperLimit = 300;
        int expected = 3;

// вызываем целевой метод:
        int actual = service.numberOfSquares(lowerLimit, upperLimit);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }
}