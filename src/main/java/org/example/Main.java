package org.example;

import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        String[] wordArr = {"Автомобиль", "Собака", "Магнитофон", "Холодильник", "Очки", "Телефон", "Кошка", "Клавиатура", "Турниr", "Собака", "Книга", "Телефон"};
        HashMap<String, Integer> wordList =  new HashMap<String, Integer>();
        for (String a : wordArr){
            wordList.merge(a, 1,(f,g) -> g+f);
        }
        System.out.println(wordList.entrySet());

        Ph_bk ph_bk = new Ph_bk();
        ph_bk.add("Михаил", 79243563);
        ph_bk.add("Дима", 74646228);
        ph_bk.add("Вова", 72452277);
        ph_bk.add("Вова", 78856734);
        ph_bk.add("Михайло", 77463111);
        ph_bk.add("Женя", 73445125);
        ph_bk.add("Олег", 79243563);


        ph_bk.print();

    }
}