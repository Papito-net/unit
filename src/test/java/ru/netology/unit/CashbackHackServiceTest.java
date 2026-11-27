package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual); // Этот тест упадёт и выявит баг (вернётся 1000 вместо 0)
    }

    @Test
    public void shouldReturn400IfAmountIs1600() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1600;

        int actual = service.remain(amount);
        int expected = 400;

        assertEquals(expected, actual);
    }
}


