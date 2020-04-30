package pl.kj.firstapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class test2 {
    private zad2 test2= new zad2(new int[]{9, 5, 8, 1, 2, 3,4},0);
    @Test
    void test() {
        assertTrue(test2.sek(new int[]{1, 2, 3,5,2},1));
    }
    @Test
    void test2() {
        assertFalse(test2.sek(new int[]{1, 2, 6,2},1));
    }
    @Test
    void test3() {
        assertFalse(test2.sek(new int[]{0,0,0,0},1));
    }
}
