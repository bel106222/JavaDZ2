/*
Задание 1
Выведите на экран надпись «Fall seven times and stand up eight»
на разных строках. Пример вывода:
        Fall seven times
        and
        stand up eight

Задание 2
Пользователь вводит с клавиатуры два числа. Необходимо найти сумму чисел,
разницу чисел, произведение чисел. Результат вычислений вывести на экран.

Задание 3
Пользователь с клавиатуры вводит четырёхзначное число. Необходимо
перевернуть число и отобразить результат. Например, если введено
4512, результат 2154.

Задание 4
Пользователь с клавиатуры вводит количество часов. Если полученное
значение находится в диапазоне от 0 до 6 нужно вывести надпись
«Good Night», если в диапазоне от 6 до 13 «Good Morning», если в
диапазоне от 13 до 17 «Good Day», если в диапазоне от 17 до 0
«Good Evening». Верхняя граница диапазона не включается. Например,
число 6 относится к 6 до 13.

Задание 5
Пользователь вводите клавиатуры целое шестизначное число. Написать
программу, которая определяет, является ли введенное число — счастливым
(Счастливым считается шестизначное число, у которого сумма первых 3
цифр равна сумме вторых трех цифр). Например, 123321 — счастливое число,
так как 1+2+3 = 3+2+1. С другой стороны 378423 — несчастливое число,
так как 3+7+8 != 4+2+3. Если пользователь ввел не шестизначное число
требуется вывести сообщение об ошибке.

Задание 6
Пользователь вводит с клавиатуры число в диапазоне от 1 до 100.
Если число кратно 3 (делится на 3 без остатка) нужно вывести слово «Fizz».
Если число кратно 5 нужно вывести слово «Buzz». Если число кратно 3 и 5
нужно вывести «Fizz Buzz». Если число не кратно не 3 и 5 нужно вывести
само число. Если пользователь ввел значение не в диапазоне от 1 до 100
требуется вывести сообщение об ошибке.

Задание 7
Пользователь вводит с клавиатуры число. Требуется посчитать факториал числа.
Например, если введено 3, факториал числа 1*2*3 = 6. Формула для расчета
факториала: n!=1*2*3...*n, где n — число для расчета факториала.

Задание 8
Показать на экран все простые числа в диапазоне, указанном пользователем.
Число называется простым, если оно делится без остатка только на себя и на
единицу. Например, три — это простое число, а четыре нет.

Задание 9
Пользователь с клавиатуры вводит элементы одномерного массива. Необходимо
найти сумму элементов массива, среднее арифметическое, отобразить на экран
все элементы массива.

Задание 10
Пользователь с клавиатуры вводит элементы одномерного массива и некоторое
число. Необходимо посчитать сколько раз данное число присутствует в массиве.

Задание 11
Напишите метод, который возвращает сумму чисел в указанном диапазоне.
Границы диапазона передаются в качестве параметров.

Задание 12
Напишите метод, высчитывающий факториал каждого элемента массива. Метод
возвращает новый массив, содержащий полученные факториалы.
*/

import java.util.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.printf("ДОМАШНЕЕ ЗАДАНИЕ №2\n");

        for (int i = 1; i <= 12; i++) {
            System.out.println("Задание №" + i);
            switch(i)
            {
                case 1:
                    stingShow();
                    break;
                case 2:
                    numberOperations();
                    break;
                case 3:
                    fourDigitNumber();
                    break;
                case 4:
                    dayTime();
                    break;
                case 5:
                    happyNumber();
                    break;
                case 6:
                    fizzBuzz();
                    break;
                case 7:
                    factorialN();
                    break;
                case 8:
                    simpleNumbers();
                    break;
                case 9:
                    sumArray();
                    break;
                case 10:
                    contain();
                    break;
                case 11:
                    sumNumbers();
                    break;
                case 12:
                    bigArray();
                    break;
            }
        }
    }
    //Задание 1
    private static void stingShow(){
        System.out.println("1-й cпособ (Escape):");
        System.out.println("\t\t\t\tFall seven times\n\t\t\t\tand\n\t\t\t\tstand up eight");
        System.out.print("2-й cпособ (StringTokenizer):");
        String currentString = "Fall seven times and stand up eight";
        StringTokenizer strToken = new StringTokenizer(currentString);
        String tab = "\n\t\t\t\t";
        while (strToken.hasMoreTokens())
        {
            if (strToken.countTokens()==7 || strToken.countTokens()==4 || strToken.countTokens()==3){
                System.out.print(tab);
            }
            System.out.print(strToken.nextToken() + " ");
        }
        System.out.print("\n3-й cпособ (split):");
        String[] tokens = currentString.split(" ");
        int counter = 0;
        for (String token : tokens) {
            if (counter==0 || counter==3 || counter==4){
                System.out.print(tab);
            }
            System.out.print(token + " ");
            ++counter;
        }
        System.out.println();
    }
    //Задание 2
    private static void numberOperations(){
        int first = inputInt("Введите первое число:>");
        int second = inputInt("Введите второе число:>");
        System.out.println(String.format("Сумма чисел %d и %d равна %d", first, second, first + second));
        System.out.println(String.format("Разность чисел %d и %d равна %d", first, second, first - second));
        System.out.println(String.format("Произведение чисел %d и %d равна %d", first, second, first * second));
    }
    //Задание 3
    private static void fourDigitNumber(){
        int num = 0;
        while (true){
            num = inputInt("Введите четырёхзначное число:>");
            if (Integer.toString(num).length() == 4){
                break;
            } else {
                System.out.println("Ошибка: введено не четырёхзначное число, попробуйте снова...");
            }
        }
        String currentString = Integer.toString(num);
        List<Character> charList = new ArrayList<>();
        for (char symbol : currentString.toCharArray()) {
            charList.add(symbol);
        }
        System.out.print("Переворачиваем: ");
        Collections.reverse(charList);
        for (Character symbol : charList) {
            System.out.print(symbol);
        }
        System.out.println();
    }
    //Задание 4
    private static void dayTime(){
        int num = 0;
        while (true){
            num = inputInt("Введите количество часов от 0 до 23:>");
            if (num >= 0 && num <= 23){
                break;
            } else {
                System.out.println("Ошибка: число не в диапазоне от 0 до 23, попробуйте снова...");
            }
        }
        String time = null;
        if (num >= 0 && num < 6) {
            time = "Good Night";
        } else if (num >= 6 && num < 14) {
            time = "Good Morning";
        } else if (num >= 14 && num < 18){
            time = "Good Day";
        } else if (num >= 18 && num <= 23){
            time = "Good Evening";
        }
        System.out.println(time);
    }
    //Задание 5
    private static void happyNumber(){
        int num = 0;
        while (true){
            num = inputInt("Введите шестизначное число:>");
            if (Integer.toString(num).length() == 6){
                break;
            } else {
                System.out.println("Ошибка: введено не шестизначное число, попробуйте снова...");
            }
        }
        String currentString = Integer.toString(num);
        int left =  Integer.parseInt(String.valueOf(currentString.charAt(0))) +
                Integer.parseInt(String.valueOf(currentString.charAt(1))) +
                Integer.parseInt(String.valueOf(currentString.charAt(2)));
        int right = Integer.parseInt(String.valueOf(currentString.charAt(3))) +
                Integer.parseInt(String.valueOf(currentString.charAt(4))) +
                Integer.parseInt(String.valueOf(currentString.charAt(5)));
        String pref = (left == right) ? "" : " не";
        System.out.println("Число " + num + pref + " является счастливым.");
    }
    //Задание 6
    private static void fizzBuzz(){
        int num = 0;
        while (true){
            num = inputInt("Введите число от 1 до 100:>");
            if (num > 0 && num <= 100){
                break;
            } else {
                System.out.println("Ошибка: число не в диапазоне от 1 до 100, попробуйте снова...");
            }
        }
        if (num % 3 != 0 && num % 5 != 0) {
            System.out.println(num);
        } else if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Fizz Buzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println("Buzz");
        }
    }
    //Задание 7
    private static void factorialN(){
        int num = inputInt("Введите целое число:>");
        System.out.println(String.format("Факториал числа %d равен %e", num, factorial(num)));
    }
    //Задание 8
    private static void simpleNumbers(){
        int num1 = inputInt("Введите начало диапазона:>");
        int num2 = inputInt("Введите конец диапазона:>");
        System.out.print("Простые числа от " + num1 + " до " + num2 + ": ");
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    //Задание 9
    private static void sumArray(){
        int size = inputInt("Введите размер массива:>");
        int[] array = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = inputInt("Введите " + (i+1) + " элемент массива:>");
            sum += array[i];
        }
        System.out.println("Создан массив: " + Arrays.toString(array));
        System.out.println("Сумма его элементов равна: " + sum + ", а среднее арифметическое равно: " + ((float) sum / size));
    }
    //Задание 10
    private static void contain(){
        int size = inputInt("Введите размер массива:>");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = inputInt("Введите " + (i+1) + " элемент массива:>");
        }
        System.out.println("Создан массив: " + Arrays.toString(array));
        int value = inputInt("Введите искомое значение:>");
        int count = 0;
        for ( int num : array){
            count += (num == value) ? 1 : 0;
        }
        System.out.println(String.format("Значение %d в нём встречается %d раз.", value, count));
    }
    //Задание 11
    private static void sumNumbers(){
        int begin = inputInt("Введите начало диапазона:>");
        int end = inputInt("Введите конец диапазона:>");
        System.out.println(String.format("Сумма чисел в диапазоне от %d до %d равна: %d", begin, end, (summa(begin, end))));
    }
    //Задание 12
    private static void bigArray(){
        int size = 10;
        int[] array = new int[size];
        Random random = new Random();
        System.out.print("Сгенерирован массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(8) + 3;
            System.out.print(array[i] + " ");
        }
        System.out.print("\nСоздан массив факториалов: " + Arrays.toString(factorialArray(array)));
    }

    private static double[] factorialArray(int[] currentArray) {
        double[] newArray = new double[currentArray.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = factorial(currentArray[i]);
        }
        return newArray;
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