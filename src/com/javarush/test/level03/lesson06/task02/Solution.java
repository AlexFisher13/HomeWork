package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        stroka (1,1);
        stroka (2,2);
        stroka (3,3);
        stroka (4,4);
        stroka (5,5);
        stroka (6,6);
        stroka (7,7);
        stroka (8,8);
        stroka (9,9);
        stroka (10,10);

            //напишите тут ваш код
        }
      public static void stroka (int a, int b){;
         int i=0;
          while (i<10) {
              i++;
              System.out.print(a+" "); a=a+b; }
              System.out.println();

    }
}