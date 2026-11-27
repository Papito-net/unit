package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashbackHackServiceJUnit5Test {

    @Test
    void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(100, service.remain(900));
    }

    @Test
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(0, service.remain(1000)); // Упадёт из-за бага в сервисе
    }

    @Test
    void shouldReturn400IfAmountIs1600() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(400, service.remain(1600));
    }
}
