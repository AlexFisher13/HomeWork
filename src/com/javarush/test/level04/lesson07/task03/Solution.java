package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
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
int i=0;
        if(a>0) i++;
        if(b>0) i++;
        if(c>0)i++;
        System.out.println(i);

    }
}
