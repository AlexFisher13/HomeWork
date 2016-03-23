package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int j = 1;
        for (int i = 1; i != 11; i++)
        {
            vivod(i);
            System.out.println();//напишите тут ваш код
        }
    }

        public static void vivod (int a)
          {
            for (;a!=0;a--)
              System.out.print("8");
          }

    }

