package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String dogname = null;
    private int dogrost = 0;
    private String dogcolor = null;

    public Dog (String name)
    {
        this.dogname = name;
    }

    public Dog (String name, int rost)
    {
        this.dogname = name;
        this.dogrost = rost;
    }

    public Dog (String name, int rost, String color)
    {
        this.dogname = name;
        this.dogrost = rost;
        this.dogcolor = color;
    }

}
