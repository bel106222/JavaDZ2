import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("1.ФАКТОРИАЛ.");
        int num = inputInt("Введите целое число:>");
        System.out.println("Факториал числа " + num + " равен " + factorial(num));

        System.out.println("2.ПРОСТЫЕ ЧИСЛА.");
        int num1 = inputInt("Введите начало диапазона:>");
        int num2 = inputInt("Введите конец диапазона:>");
        System.out.print("Простые числа от " + num1 + " до " + num2 + ": ");
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("3.МАССИВ.");
        int size = inputInt("Введите размер массива:>");
        int[] array = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = inputInt("Введите " + (i+1) + " элемент массива:>");
            sum += array[i];
        }
        System.out.println("Сгенерирован массив: " + Arrays.toString(array));
        System.out.println("Сумма его элементов равна: " + sum + ", а среднее арифметическое равно: " + (sum / size));

        System.out.println("4.СУММА ЧИСЕЛ В ДИАПАЗОНЕ.");
        int begin = inputInt("Введите начало диапазона:>");
        int end = inputInt("Введите конец диапазона:>");
        System.out.println("Сумма чисел в диапазоне от " + begin + " до " + end + " равна: " + (summa(begin, end)));

        System.out.println("5.МАССИВ ФАКТОРИАЛОВ.");
        int size2 = 10;
        int[] array2 = new int[size2];
        Random random = new Random();
        System.out.print("Сгенерирован массив: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(8) + 3;
            System.out.print(array2[i] + " ");
        }
        System.out.print("\nСгенерирован массив факториалов: " + Arrays.toString(factorialArray(array2)));

    }

    private static double[] factorialArray(int[] currentArray) {
        double[] array3 = new double[currentArray.length];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = factorial(currentArray[i]);
        }
        return array3;
    }

    private static int summa(int begin, int end) {
        int result = 0;
        for (int i = begin; i <= end; i++) {
            result += i;
        }
        return result;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static double factorial(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static int inputInt(String message) {
        int number = 0;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка: введено не целое число, попробуйте снова...");
                scanner.next(); // Очистка неверного ввода
            }
        }
        return number;
    }
}