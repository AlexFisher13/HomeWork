package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];
        int[] b = new int[5];
        int min;

        for (int i = 0; i < 5; i++){

            a[i] = Integer.parseInt(reader.readLine());
            min = a[0];
            b[0] = a[0];
            if ((a[i]) < a[i-1]){
                b[i+1] = b[i];
                b[i] = a [i];
            }
            else b[i] = a[i];
        }
        for (int i = 0; i < 5; i++){
            System.out.println(b[i]);
        }
    }

}
