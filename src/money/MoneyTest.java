package money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 */
class MoneyTest {

    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        // assertEqualsメソッドは与えられたオブジェクト同士を.equals()メソッドを呼び出すことで比較する
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}