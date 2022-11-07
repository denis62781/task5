package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Ph_bk
{
    private Map<String, HashSet<Integer>> phbk;
    Ph_bk() {
        this.phbk = new HashMap<String, HashSet<Integer>>();
    }

    void add(String Name, Integer phone) {
        int[] nums = {phone};
        Set<Integer> ph = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if (!phbk.containsValue(ph)) {
            HashSet<Integer> numbers;

            if (phbk.containsKey(Name)) {
                numbers = phbk.get(Name);
            } else {
                numbers = new HashSet<>();
            }

            numbers.add(phone);
            phbk.put(Name, numbers);
        }
        else {
            System.out.println("Такой номер уже существует: "+ Name);

        }
    }
    void print() {
        for
        (String name: phbk.keySet()) {
            String key = name.toString();
            String value = phbk.get(name).toString();
            System.out.println(key + " : " + value);
        }
    }
}
