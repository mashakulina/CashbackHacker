package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test

    public void buyInAddition() {
        int actual = service.remain(100);

        assertEquals(900, actual);
    }

    @Test
    public void withoutRemain() {
        int actual = service.remain(1000);

        assertEquals(0, actual);
    }
}