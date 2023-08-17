package Task5.com.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        System.out.println("Введіть рядки. Для завершення введіть 'end':");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            strings.add(input);
        }

        System.out.println("Введені рядки:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
