package by.tms.myproject;

import java.util.Scanner;

public class HWLesson3 {

    public static void main(String[] args){

//        1.	Написать программу, вычисляющую сумму цифр введённого пользователем целого числа

        System.out.println("Input number :");
        Scanner scaner = new Scanner(System.in);
        int number = scaner.nextInt();
        int sum = 0;
        if (number > 0 ) {
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            System.out.println("The sum of the digits of an integer entered by the user = " + sum);
        }else
            System.out.println("Enter number more 0");

//        2.Написать программу, вычисляющую и отображающую все числа
//        Фибоначчи меньше введённого пользователем целого числа.

        Scanner scaner2 = new Scanner(System.in);
        System.out.println("Input number :");
        int number2 = scaner2.nextInt();
        int a = 0;
        int b = 1;
        int fib = 0;
        if (number2 > 0 ) {
            while((a + b) < number2) {
                fib = a + b;
                a = b;
                b = fib;
                System.out.print(fib + " ");
            }
        }else
            System.out.println("Enter number more 0");

        System.out.println(" ");

//        3.Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
//        Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.
//        (Необходимо использовать Scanner)
//        Программа должна выводить:
//        a. Количество дней
//        b. Сумму осадков за этот период
//        c. Среднее количество осадков за этот период
//        d. Максимальное количество дневных осадков за этот период
//        Не использовать массивы!

        Scanner days2 = new Scanner(System.in);
        System.out.println("Input number of days:");
        int days = days2.nextInt();
        int sumRainfall = 0;
        int largest = 0;
        for (int i=1; i<=days; i++)
        {
            Scanner numberOfDay2 = new Scanner(System.in);
            System.out.println("Input rainfall for " +i + " day:");
            int numberOfDay = numberOfDay2.nextInt();
            System.out.println("Number of day " + i + " amount of rainfall = " + numberOfDay);
            sumRainfall += numberOfDay;
            if(numberOfDay > largest){
                largest = numberOfDay;
            } else;
        }

        System.out.println("The amount of rainfall for " + days + " days = " + sumRainfall);
        float average = (float)sumRainfall / days;
        System.out.println("Average rainfall for " + days + " days = " + average);
        System.out.println("Maximum daily rainfall" + days + " days = " + largest);

    }
}
