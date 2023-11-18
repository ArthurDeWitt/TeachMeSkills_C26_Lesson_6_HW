package com.teachmeskills.lesson6.HW.AddtionalTasks;
/*
Дан массив S из n целых чисел.
Существуют ли элементы a, b, c в S такие, что a + b + c = 0?
Найдите все уникальные триплеты в массиве, сумма которых равна нулю.
Примечание: элементы в тройке (a,b,c) должны быть в порядке неубывания. (т.е. а ≤ b
≤ c).
В наборе решений не должно быть повторяющихся троек.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triple  {

    public static void main(String[] args) {
        int[] numbers = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = threeSum(numbers);

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }

    public static List<List<Integer>> threeSum(int[] numbers) {
        List<List<Integer>> triplets = new ArrayList<>();

        // Сортируем массив
        Arrays.sort(numbers);

        // Используем два указателя и проходим по массиву
        for (int i = 0; i < numbers.length - 2; i++) {
            // Пропускаем повторяющиеся элементы
            if (i > 0 && numbers[i] == numbers[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = numbers.length - 1;

            while (left < right) {
                int sum = numbers[i] + numbers[left] + numbers[right];

                if (sum == 0) {
                    // Добавляем тройку в список
                    triplets.add(Arrays.asList(numbers[i], numbers[left], numbers[right]));

                    // Пропускаем повторяющиеся элементы
                    while (left < right && numbers[left] == numbers[left + 1]) {
                        left++;
                    }
                    while (left < right && numbers[right] == numbers[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return triplets;
    }
}
