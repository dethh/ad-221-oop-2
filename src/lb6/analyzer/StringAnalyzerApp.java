package lb6.analyzer;


import java.util.Scanner;

public class StringAnalyzerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получаем строку от пользователя
        System.out.print("Введите строку (только латинские символы): ");
        String inputString = scanner.nextLine();

        // Используем анализаторы
        StringAnalyzer lowerCaseAnalyzer = new LowerCaseAnalyzer();
        StringAnalyzer upperCaseAnalyzer = new UpperCaseAnalyzer();

        // Выводим результаты анализа
        System.out.println("Количество строчных символов: " + lowerCaseAnalyzer.analyze(inputString));
        System.out.println("Количество заглавных символов: " + upperCaseAnalyzer.analyze(inputString));
    }
}

