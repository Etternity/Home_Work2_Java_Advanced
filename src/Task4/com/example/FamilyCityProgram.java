package Task4.com.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FamilyCityProgram {
    public static void main(String[] args) {
        Map<String, String> families = new HashMap<>();
        families.put("Москва", "Іванови");
        families.put("Київ", "Петрови");
        families.put("Лондон", "Абрамовичі");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть місто:");
        String city = scanner.nextLine();

        if (families.containsKey(city)) {
            String family = families.get(city);
            System.out.println("Сім'я, яка живе у місті " + city + ": " + family);
        } else {
            System.out.println("Немає інформації про місто " + city);
        }
    }
}
