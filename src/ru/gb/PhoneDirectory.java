package ru.gb;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneDirectory {
    private HashMap<String, Set<String>> data;
    public PhoneDirectory(HashMap data) {
        this.data = data;
    }
    void addPhones(String name, String number) {
        Set<String> phones = getPhones(name);
        phones.add(number);
    }
    private Set<String> getPhones(String name) {
        Set<String> phones = data.getOrDefault(name, new HashSet<>());
        if (phones.isEmpty()) {
            data.put(name, phones);
        }

        return phones;
    }
    public Set<String> getNumbers(String name) {
        return data.get(name);
    }
}


