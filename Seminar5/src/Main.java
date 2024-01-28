
// Создать мапу. обобщение целое число и строка
// Заполнить 10 значениями - ключ случайное число от 0 до 1000, значение название буквы этого числа

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Li

        HashMap <Integer, String> map = new HashMap<>();
        HashMap <Integer, String> newMap = new HashMap<>();

        int number;
        int numberForNewMap;

        for (int i = 0; i < 10; i++) {
            number = new Random().nextInt(0, 21);
            numberForNewMap = new Random().nextInt(0, 21);

            map.put(number, Character.getName(number));
            newMap.put(numberForNewMap, Character.getName(numberForNewMap));

        }

        map.forEach((k, v) -> {
            if (newMap.containsKey(k)) {
                System.out.printf("Key: %s\n", k);
                newMap.remove(k);
            }
        });

        System.out.println(map);
        System.out.println(newMap);

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("=".repeat(60));
        newMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

    }
}