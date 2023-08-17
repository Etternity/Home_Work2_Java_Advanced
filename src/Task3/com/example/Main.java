package Task3.com.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість чисел N: ");
        int n = scanner.nextInt();

        List<Integer> integerList = getIntegerList(n);
        int minimum = getMinimum(integerList);

        System.out.println("Список чисел: " + integerList);
        System.out.println("Мінімальне число: " + minimum);
    }

    public static List<Integer> getIntegerList(int n) {
        List<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("Введіть число " + (i + 1) + ": ");
            int number = scanner.nextInt();
            list.add(number);
        }

        return list;
    }

    public static int getMinimum(List<Integer> list) {
        int minimum = Integer.MAX_VALUE;

        for (int num : list) {
            if (num < minimum) {
                minimum = num;
            }
        }

        return minimum;
    }
}
