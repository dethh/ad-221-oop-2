package lb9;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class t1 {
    public static void main(String[] args) {
        // Генерация списка из 100 целочисленных значений от -1000 до 1000
        List<Integer> numbers = generateRandomList(100, -1000, 1000);

        // Вывод исходного списка
        System.out.println("Исходный список: " + numbers);

        // Перестановка элементов списка
        rearrangeList(numbers);

        // Вывод результата
        System.out.println("Результат: " + numbers);
    }

    // Метод для генерации списка из n случайных целых чисел в заданном диапазоне
    private static List<Integer> generateRandomList(int n, int minValue, int maxValue) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(maxValue - minValue + 1) + minValue);
        }

        return list;
    }

    // Метод для перестановки отрицательных элементов в конец, а положительных в начало списка
    private static void rearrangeList(List<Integer> list) {
        int negativeIndex = 0;
        int positiveIndex = list.size() - 1;

        while (negativeIndex <= positiveIndex) {
            if (list.get(negativeIndex) < 0) {
                // Элемент уже находится в конечной части списка, переходим к следующему
                negativeIndex++;
            } else {
                // Обмен элементов местами
                int temp = list.get(negativeIndex);
                list.set(negativeIndex, list.get(positiveIndex));
                list.set(positiveIndex, temp);
                // Уменьшаем индекс положительных элементов
                positiveIndex--;
            }
        }
    }
}
