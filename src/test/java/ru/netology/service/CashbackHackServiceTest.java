package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test

    public void buyInAddition() {
        int actual = service.remain(100);

        assertEquals(actual, 900);
    }

    @Test
    public void withoutRemain() {
        int actual = service.remain(1000);

        assertEquals(actual, 0);
    }
}