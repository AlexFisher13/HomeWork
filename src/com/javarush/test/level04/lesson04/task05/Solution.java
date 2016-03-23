package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader reader = new BufferedReader (new InputStreamReader(System.in) ); //напишите тут ваш код
          String a = reader.readLine();
          int n = Integer.parseInt(a);
        if (n<0) n++;
        else n=n*2;
        System.out.println(n);
    }

}