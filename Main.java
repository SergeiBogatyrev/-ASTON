import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "orange", "apple", "grape", "banana", "kiwi", "orange", "melon", "grape", "apple", "kiwi", "banana", "orange", "grape"};

// Находим список уникальных слов
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

// Выводим список уникальных слов
        System.out.println("Уникальные слова:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

// Подсчитываем количество встреч каждого слова
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

// Выводим количество встреч каждого слова
        System.out.println("\nКоличество встреч каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

// Создаем телефонный справочник
        PhoneBook phoneBook = new PhoneBook();

// Добавляем записи в телефонный справочник
        phoneBook.add("Иванов", "1234567890");
        phoneBook.add("Петров", "0987654321");
        phoneBook.add("Сидоров", "5555555555");
        phoneBook.add("Иванов", "1111111111");
        phoneBook.add("Петров", "2222222222");
        phoneBook.add("Иванов", "3333333333");
        phoneBook.add("Иванов", "12345678910");
        phoneBook.add("Головин", "10987654321");

// Ищем номер телефона по фамилии
        System.out.println("\nТелефонный справочник:");
        System.out.println("Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Петров: " + phoneBook.get("Петров"));
        System.out.println("Сидоров: " + phoneBook.get("Сидоров"));
        System.out.println("Головин: " + phoneBook.get("Головин"));
    }
}














