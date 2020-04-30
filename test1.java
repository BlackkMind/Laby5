package pl.kj.firstapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class test1 {
    private zad1 test1= new zad1(12,31);

    @Test
    void test() {
        assertTrue(test1.ter(18,33));
    }
    @Test
    void test2() {
        assertTrue(test1.ter(112,22));
    }
    @Test
    void test3() {
        assertFalse(test1.ter(151,700));
    }
}
