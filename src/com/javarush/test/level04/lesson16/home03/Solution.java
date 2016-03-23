package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );

        String n = reader.readLine();
        int a = Integer.parseInt(n);
        int sum=a;
        int b=0;

        if ((a!=-1)||(b!=-1))
        {
            for (; b != -1; )
            {
                String n1 = reader.readLine();
                b = Integer.parseInt(n1);
                sum = sum + b;
            }
        }
        System.out.println(sum);


    }
}
