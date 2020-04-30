package pl.kj.firstapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class test4 {
	
    private zad4 test4= new zad4(new int[]{4, 6, 4, 1, 2});


	@Test
	void test1(){
	assertArrayEquals(new int[]{4,6,4,1,2}, test4.newtab(new int[]{2,1,4,6,4});
}

}
