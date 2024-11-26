import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    public static List<Integer> fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n должно быть натуральным числом (больше 0).");
        }

        List<Integer> fibSequence = new ArrayList<>();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            fibSequence.add(a);
            int next = a + b;
            a = b;
            b = next;
        }
        return fibSequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");

        try {
            int n = Integer.parseInt(scanner.nextLine());
            List<Integer> fibNumbers = fibonacci(n);
            System.out.println("Первые " + n + " чисел Фибоначчи: " + fibNumbers);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: пожалуйста, введите корректное натуральное число.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}