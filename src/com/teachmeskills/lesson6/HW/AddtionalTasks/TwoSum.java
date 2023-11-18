package com.teachmeskills.lesson6.HW.AddtionalTasks;
/*
Дан массив целых чисел, найдите два числа, которые в сумме дают заданное число.
Функция twoSum должна возвращать индексы двух чисел так, чтобы они складывались
в целевое число.
Например:
Ввод: числа={2, 7, 11, 15}, цель=9.
Выход: индекс1=0, индекс2=1.
 */
public class TwoSum {
        public static void main(String[] args) {
            int[] numbers = {2, 7, 11, 15};
            int target = 9;
            int[] result = twoSum(numbers, target);
            System.out.println(result[0] + " " + result[1]);
        }

        public static int[] twoSum(int[] numbers, int target) {
            // Проходим по всем парам элементов массива
            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    // Если сумма элементов равна целевому числу, возвращаем индексы этих элементов
                    if (numbers[i] + numbers[j] == target) {
                        return new int[] {i, j};
                    }
                }
            }

            // Если таких чисел нет, возвращаем null
            return null;
        }
}
