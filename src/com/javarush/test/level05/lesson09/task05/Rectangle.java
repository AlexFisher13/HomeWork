package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int top = 0;
    private int left = 0;
    private int width = 0;
    private int height = 0;

    public Rectangle (int left, int top, int width, int height)
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public Rectangle (int left, int top)
    {
        this.left = left;
        this.top = top;
    }

    public Rectangle (int left, int top, int height)
    {
        this.left = left;
        this.top = top;
        this.height = height;
    }

    public Rectangle (Rectangle kvadr, int left, int top)
    {
        this.left = kvadr.left;
        this.top = kvadr.top;
    }

}
