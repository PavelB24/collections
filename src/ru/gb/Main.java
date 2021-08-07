package ru.gb;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Кошка");
        animals.add("Кошка");
        animals.add("Собака");
        animals.add("Кошка");
        animals.add("Сова");
        animals.add("Свинья");
        animals.add("Акула");
        animals.add("Акула");
        animals.add("Мышь");
        // Оптимальный вариант, но я не совсем понимаю, как он работает, а потому оставлю его до момента более детального изучения потоков
        System.out.println(animals.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting())));
        HashMap<String, Integer> mapForList = new HashMap<>();
        Set<String> animalSet = new HashSet<>();
        for (String animal : animals) {
            mapForList.put(animal, Collections.frequency(animals, animal));
        }
        for (String s : mapForList.keySet()) {
            System.out.println(s + " повторяется в коллекции animals " + mapForList.get(s) + " раз");
        }

        PhoneDirectory directory = new PhoneDirectory(new HashMap());
        directory.addPhones("Баринов", "89992476337");
        directory.addPhones("Баринов", "89213373967");
        directory.addPhones("Баркин", "8528942124");
        directory.addPhones("Брусилов", "89119683546");
        directory.addPhones("Басенко", "89051112698");
        directory.addPhones("Басенко", "89956875214");

        System.out.println(directory.getNumbers("Баринов"));
        System.out.println(directory.getNumbers("Басенко"));
        System.out.println(directory.getNumbers("Баркин"));
    }
}

