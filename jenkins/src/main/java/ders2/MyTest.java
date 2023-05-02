package ders2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyTest {

    @Test
    public void testAddition() {
        int a = 2;
        int b = 3;
        int result = a + b;
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        int a = 5;
        int b = 3;
        int result = a - b;
        assertEquals(2, result);
    }


    @Test
    public void testSubtractionbolme() {
        int a = 6;
        int b = 3;
        int result = a / b;
        assertEquals(2, result);
    }

  




}
