package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int n = Integer.parseInt(a);
        String b = reader.readLine();
        int m = Integer.parseInt(b);
        int m1 = m;

        for (;n!=0;n--)
        {
            for (; m != 0; m--) System.out.print(8);
            System.out.println();
            m=m1;
        }

    }
}
