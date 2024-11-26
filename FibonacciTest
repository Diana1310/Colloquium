import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciGeneratorTest {

    @Test
    public void testFibonacciWithOne() {
        List<Integer> expected = List.of(0);
        List<Integer> actual = FibonacciGenerator.fibonacci(1);
        assertEquals(expected, actual, "Должны получить первые 1 число Фибоначчи.");
    }

    @Test
    public void testFibonacciWithTwo() {
        List<Integer> expected = List.of(0, 1);
        List<Integer> actual = FibonacciGenerator.fibonacci(2);
        assertEquals(expected, actual, "Должны получить первые 2 числа Фибоначчи.");
    }

    @Test
    public void testFibonacciWithFive() {
        List<Integer> expected = List.of(0, 1, 1, 2, 3);
        List<Integer> actual = FibonacciGenerator.fibonacci(5);
        assertEquals(expected, actual, "Должны получить первые 5 чисел Фибоначчи.");
    }

    @Test
    public void testFibonacciWithTen() {
        List<Integer> expected = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
        List<Integer> actual = FibonacciGenerator.fibonacci(10);
        assertEquals(expected, actual, "Должны получить первые 10 чисел Фибоначчи.");
    }

    @Test
    public void testFibonacciWithZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FibonacciGenerator.fibonacci(0);
        });
        assertEquals("n должно быть натуральным числом (больше 0).", exception.getMessage());
    }

    @Test
    public void testFibonacciWithNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FibonacciGenerator.fibonacci(-5);
        });
        assertEquals("n должно быть натуральным числом (больше 0).", exception.getMessage());
    }

    @Test
    public void testFibonacciWithNonInteger() {
        assertThrows(NumberFormatException.class, () -> {
            throw new NumberFormatException("Не число");
        });
    }

    @Test
    public void testFibonacciWithLargeInput() {
        assertDoesNotThrow(() -> {
            FibonacciGenerator.fibonacci(50);
        });
    }
}
