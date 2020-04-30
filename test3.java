package pl.kj.firstapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class test3 {
    private Zad3 test3= new Zad3("dfs");
	
	 @Test
    void test2() {
		
        assertEquals(0,test3.as("fgdf"));
    }
	
    @Test
    void test() {
		
        assertNotEquals(0,test3.as("fgd"));
}
   
}
