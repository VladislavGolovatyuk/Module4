package home;

import java.util.Random;
import java.util.Scanner;

/**
 * @author VladislavGolovatyuk
 * @version 2.0
 */
public class Module4 {

    public static void main(String[] args) {


        int numbersFromCounters = 0;
        int numberFromRecursion = 0;
        int firstNumber = 0;
        int secondNumber = 0;
        float firstNumberFloat = 0;
        float secondNumberFloat = 0;
        int widthOfRectangle = 0;
        int heightOfRectangle = 0;
        int sideOfRectangle = 0;

        System.out.println("Здравствуйте!!!");
        System.out.println("Выберите пожалуйста, какой функционал программы" +
                " Вы бы хотели посмотреть: ");
        System.out.println("Нажмите 1, если хотите посмотреть вывод цифры от 1 до него!!!");
        System.out.println("Нажмите 2, если хотите посмотреть вывод цифры от 1 до него рекурсивно!!!");
        System.out.println("Нажмите 3, если хотите узнать максимум для двух переменных типа Int!!!");
        System.out.println("Нажмите 4, есесли хотите узнать максимум для двух переменных типа Float!!!");
        System.out.println("Нажмите 5, если хотите нарисовать прямоугольник!!!");
        System.out.println("Нажмите 6, если хотите нарисовать квадрат!!!");


        while (true) {

            Scanner sc1 = new Scanner(System.in);
            int switchChoiser = sc1.nextInt();

            switch (switchChoiser) {
                case 1:
                    countersOfNumbers(numbersFromCounters);
                    break;

                case 2:
                    Scanner sc = new Scanner(System.in);

                    System.out.println("Для того, что бы увидеть счетчик числа от 1 до" +
                            " введенного Вами числа, который выполняется рекурсивно - введите своё число: ");

                    counterOfNumbersRecursion(numberFromRecursion = sc.nextInt());
                    break;

                case 3:
                    System.out.println(getMax(firstNumber, secondNumber));
                    break;

                case 4:
                    System.out.println(getMax(firstNumberFloat, secondNumberFloat));
                    break;

                case 5:
                    drawRectangle(widthOfRectangle, heightOfRectangle);
                    break;

                case 6:
                    drawRectangle(sideOfRectangle);
                    break;
                default:
                    System.out.println("Вы ввели некоректное число для выбора действия программы");
            }
            System.out.println();
            if (switchChoiser > 0 || switchChoiser < 7){
                System.out.println("Если желаете продолжить " +
                        "просмотр функций нажмите 1+ENTER (), а затем сново нажмите цифру функции, результат выполнения которой Вы" +
                        " хотите увидеть!");
                System.out.println("Если ходтите закончить работу программы нажмите 2");

                Scanner scUser = new Scanner(System.in);
                int userChoise = scUser.nextInt();
                if (userChoise == 2){
                    break;
                } else if (userChoise == 1){
                    continue;
                }
            }
        }
    }

    private static void drawRectangleRecursion(int widthOfRectangle, int heightOfRectangle) {


        if (widthOfRectangle > 0) {
            drawRectangle(widthOfRectangle - 1, heightOfRectangle);
            System.out.print("+ ");
        }

        if (heightOfRectangle > 0) {
            drawRectangle(widthOfRectangle, heightOfRectangle - 1);
            System.out.println();
        }
    }

    private static void counterOfNumbersRecursion(int numberFromRecursion) {


        if (numberFromRecursion > 0) {
            counterOfNumbersRecursion(numberFromRecursion - 1);
            System.out.print(numberFromRecursion + " ");
        }

    }

    private static float getMax(float firstNumberFloat, float secondNumberFloat) {

        System.out.println("Для того, что бы сравнить два числа типа Float введите их: ");
        Scanner sc = new Scanner(System.in);

        firstNumberFloat = sc.nextFloat();
        secondNumberFloat = sc.nextFloat();

        if (firstNumberFloat > secondNumberFloat) {
            return firstNumberFloat;
        } else {
            return secondNumberFloat;
        }
    }

    private static int getMax(int firstNumber, int secondNumber) {

        System.out.println("Для того, что бы сравнить два числа типа Int введите их: ");
        Scanner sc = new Scanner(System.in);

        firstNumber = sc.nextInt();
        secondNumber = sc.nextInt();

        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    private static void drawRectangle(int sideOfRectangle) {

        System.out.println("А теперь давайте нарисуем квадрат, у которого, как Вам известно, все стороны равны)!!!");
        System.out.println("Так, что вводите размер его стороны и жмите ENTER)");
        Scanner sc2 = new Scanner(System.in);

        sideOfRectangle = sc2.nextInt();


        for (int i = 0; i < sideOfRectangle; i++) {
            for (int j = 0; j < sideOfRectangle; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }

    }

    private static void drawRectangle(int heightOfRectangle, int widthOfRectangle) {

        System.out.println("А теперь давайте нарисуем прямоугольник)!!!");
        System.out.println("Так, что вводите через пробел его высоту, ширину и жмите ENTER)");
        Scanner scRec = new Scanner(System.in);

        widthOfRectangle = scRec.nextInt();
        heightOfRectangle = scRec.nextInt();


        for (int i = 0; i < heightOfRectangle; i++) {
            for (int j = 0; j < widthOfRectangle; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }

    private static void countersOfNumbers(int numbersFromCounters) {

        System.out.println("Для того, что бы увидеть счетчик числа от 1 до" +
                " введенного Вами числа, введите его наконец-то), а затем нажмите ENTER");

        Scanner sc = new Scanner(System.in);
        numbersFromCounters = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numbersFromCounters; i++) {
            System.out.print(i + " ");
        }
    }
}



