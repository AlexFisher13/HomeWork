package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String n1 = reader.readLine();
        int a = Integer.parseInt (n1);
        String n2 = reader.readLine();
        int b = Integer.parseInt (n2);
        String n3 = reader.readLine();
        int c = Integer.parseInt (n3);

        if (a>b)
        {
            if (a<c)
                System.out.println(a);
            else {
                if (b>c) System.out.println(b);
                else System.out.println(c);
            }
        }
        else
        {
            if (a > c)
                System.out.println(a);
            else
            {
                if (b < c) System.out.println(b);
                else System.out.println(c);
            }
        }
    }
}
