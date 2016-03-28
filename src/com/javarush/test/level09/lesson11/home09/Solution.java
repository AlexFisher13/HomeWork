package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/


public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("cat1", new Cat("sdf"));
        map.put("cat2", new Cat("sdfsd"));
        map.put("cat3", new Cat("sdfs"));
        map.put("cat4", new Cat("sdfsd"));
        map.put("cat5", new Cat("sdfsd"));
        map.put("cat6", new Cat("sdfsd"));
        map.put("cat7", new Cat("sdf"));
        map.put("cat8", new Cat("sdfsdf"));
        map.put("cat9", new Cat("sdfs"));
        map.put("cat0", new Cat("Sdf"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> cats = new HashSet<Cat>();
        for (HashMap<String, Cat> e : map.values()) {
            cats.add(map.get(e));
        }
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;
        public Cat(String name)
        {
            this.name = name;
        }
        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
