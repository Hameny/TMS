package tms.java.hw;

import java.util.Arrays;
import java.util.Scanner;

public class lesson4HW {

    public static void main(String[] args) {
////        1.Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию,
////        и печатает результат. Цикличность означает, что последний элемент массива становится самым первым
////        его элементом.
////        Пример: {1,2,3,4,5} -> {5,1,2,3,4}
//
        Scanner sc = new Scanner(System.in);
        //Вводим размер массива
        System.out.println("Please enter number array size :");
        int arraySize = sc.nextInt();
//      Вводим числа в массив
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter number of array : ");
            array[i] = sc.nextInt();
        }
        int i;
        System.out.println("Please enter number how much move array :");
        int m = sc.nextInt(); // количество позиций на которые сдвигаем

        System.out.println(Arrays.toString(array));

        for (i = 0; i < m; ++i) {
            int temp = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--)
                array[j] = array[j - 1];
            array[0] = temp;
        }

        for (i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

//    2.Написать программу, удаляющую все целые числа из массива, которые равны тому, что ввёл пользователь.
//    В результате должен получиться новый массив, в котором нет заданных элементов.
//    Распечатать полученный массив
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number array size :");
        int arraySize2 = scanner.nextInt();
        int[] array2 = new int[arraySize2];
        int[] newArray = null;
        int deleteNumber = 0;
        int indexNewArray = 0;

        for (int q = 0; q < array2.length; q++) {
            System.out.println("Please enter number of array : ");
            array2[q] = scanner.nextInt();
        }
        System.out.println("Please enter number которые нужно удалить из массива :");
        int elementToBeDeleted = scanner.nextInt();
        System.out.println("Array =" + Arrays.toString(array2));

        for (int number : array2) {
            deleteNumber += number == elementToBeDeleted ? 1 : 0;
        }

        newArray = new int[array2.length - deleteNumber];


        for (int q = 0; q < array2.length; q++) {
            if (array2[q] != elementToBeDeleted) {
                newArray[indexNewArray] = array2[q];
                indexNewArray++;
            }
        }

        System.out.println("New array after delete " + elementToBeDeleted + " = " + Arrays.toString(newArray));

//3. Написать программу, которая преобразовывает двумерный массив в одномерный массив со всеми элементами
// двумерного

        int[][] twoArray = new int[][]{{7, 5, 1, 4, 9}, {8, 7, 8, 4}, {1, 9}, {5, 3, 0, 6, 8}};

        System.out.println("Two-demensional array = " + Arrays.deepToString(twoArray));
        int tmp = 0;
        int index2 = 0;
        for (int z = 0; z < twoArray.length; z++) {
            for (int j = 0; j < twoArray[z].length; j++) {
                tmp++;
            }
        }

        int[] arrNew = new int[tmp];
        for (int z = 0; z < twoArray.length; z++) {
            for (int j = 0; j < twoArray[z].length; j++) {
                arrNew[index2] = twoArray[z][j];
                index2++;
            }
        }

        System.out.println("One-demensional array = " + Arrays.toString(arrNew));

    }

}










