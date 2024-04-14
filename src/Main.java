
public class Main {
    public static void main(String[] args) {
        // Создание массива
        double[] numbers = {8, 2.5, -4.2, 2.1, -3.7, 6.8, -7.9, 1.1, 2.3, -5.6, 3.4, 4.7, -6.3, 9.2, -1.8};

        // Переменные для хранения суммы положительных чисел и их количества
        double positiveSum = 0;
        int positiveCount = 0;

        // Флаг, чтобы начать суммировать числа после первого отрицательного числа
        boolean startedSum = false;

        // Цикл для обхода массива
        for (double number : numbers) {
            if (number < 0) {
                startedSum = true; // Устанавливаем флаг, когда встречаем первое отрицательное число
            } else if (startedSum) {
                positiveSum += number; // Начинаем суммировать числа после первого отрицательного
                positiveCount++;
            }
        }

        // Проверка, чтобы избежать деления на ноль
        double average = positiveCount > 0 ? positiveSum / positiveCount : 0;

        // Вывод результата
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного числа: " + average);
    }
}