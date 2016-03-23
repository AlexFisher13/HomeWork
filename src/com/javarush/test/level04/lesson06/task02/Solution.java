package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        int a = Integer.parseInt(n1);
        String n2 = reader.readLine();
        int b = Integer.parseInt(n2);
        String n3 = reader.readLine();
        int c = Integer.parseInt(n3);
        String n4 = reader.readLine();
        int d = Integer.parseInt(n4);

        if (a > b)
        {
            if (a > c)
            {
                if (a > d) System.out.println(a);
                else System.out.println(d);
            } else
            {
                if (c > d) System.out.println(c);
                else System.out.println(d);
            }
        } else
        {
            if (b > c)
            {
                if (b > d) System.out.println(b);
                else System.out.println(d);
            } else
            {
                if (c > d) System.out.println(c);
                else System.out.println(d);
            }
        }
    }
}
