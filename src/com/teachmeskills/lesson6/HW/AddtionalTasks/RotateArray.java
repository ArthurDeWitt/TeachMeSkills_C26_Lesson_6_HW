package com.teachmeskills.lesson6.HW.AddtionalTasks;
/*
Повернуть массив из n элементов вправо на k шагов.
Например, с n = 7 и k = 3 массив [1,2,3,4,5,6,7] вращается до [5,6,7,1,2,3,4].
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int n = array.length;
        int k = 3;

        rotateArray(array, n, k);

        // Вывод полученного массива
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void rotateArray(int[] array, int n, int k) {

        // Создаем временный массив для хранения повернутых элементов
        int[] temp = new int[k];

        // Копируем последние k элементов во временный массив
        for (int i = 0; i < k; i++) {
            temp[i] = array[n - k + i];
        }

        // Сдвигаем оставшиеся элементы вправо на k шагов
        for (int i = n - k - 1; i >= 0; i--) {
            array[i + k] = array[i];
        }

        // Копируем элементы из временного массива в начало исходного массива
        for (int i = 0; i < k; i++) {
            array[i] = temp[i];
        }
    }
}
