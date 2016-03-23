package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
       String n1 = reader.readLine();
        int a = Integer.parseInt(n1);
        String n2 = reader.readLine();
        int b = Integer.parseInt(n2);
        String n3 = reader.readLine();
        int c = Integer.parseInt(n3);

        if (a>b)
        {
            if (a > c)
            {
                System.out.print(a + " ");
                if (b > c) System.out.print(b + " " + c);
                else System.out.print(c + " " + b);
            } else System.out.print(c + " " + a + " " + b);
        }
        else
        {
            if (b > c)
            {
                System.out.print(b + " ");
                if (a > c) System.out.print(a + " " + c);
                else System.out.print(c + " " + a);
            } else System.out.print(c + " " + b + " " + a);
        }


            //напишите тут ваш код

    }
}
