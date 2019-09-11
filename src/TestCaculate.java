import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCaculate {
    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        int a = 1;
        int b = 1;
        char o = '+';
        int expected = 2;

        int result = Refactoring.caculate(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing Subtraction")
    void testCalculateSub() {
        int a = 2;
        int b = 5;
        char o = '-';
        int expected = -3;

        int result = Refactoring.caculate(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing Multiplication")
    void testCalculateMutil() {
        int a = 2;
        int b = 5;
        char o = '*';
        int expected = 10;

        int result = Refactoring.caculate(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing Division")
    void testCalculateDivi() {
        int a = 100;
        int b = 20;
        char o = '/';
        int expected = 5;

        int result = Refactoring.caculate(a, b, o);
        assertEquals(expected, result);

    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int a = 2;
        int b = 0;
        char o = '=';

        assertThrows(RuntimeException.class,
                  ()-> {Refactoring.caculate(a, b, o);});
    }
}
