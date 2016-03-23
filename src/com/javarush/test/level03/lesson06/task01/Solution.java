package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void prin(String a, String b, String c){

      System.out.println(a+b+c);

    }
    public static void main(String[] args)
    {
       String a="Мама", b="Мыла", c="Раму";
        prin(a,b,c);
        prin(a,c,b);
        prin(b,a,c);
        prin(b,c,a);
        prin(c,a,b);
        prin(c,b,a);
    }
}