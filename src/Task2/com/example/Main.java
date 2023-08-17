package Task2.com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть 5 слів:");
        for (int i = 0; i < 5; i++) {
            String word = scanner.nextLine();
            words.add(word);
        }

        List<String> doubledWords = doubleValues(words);

        System.out.println("Результат:");
        for (String word : doubledWords) {
            System.out.println(word);
        }
    }
    private static List<String> doubleValues(List<String> inputList) {
        List<String> doubledList = new ArrayList<>();
        for (String word : inputList) {
            doubledList.add(word);
            doubledList.add(word);
        }
        return doubledList;
    }
}
