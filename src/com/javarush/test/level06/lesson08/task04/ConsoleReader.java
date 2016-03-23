package com.javarush.test.level06.lesson08.task04;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   //читаем строку
        String s = reader.readLine();
        return s;    //возвращаем строку
    }

    public static int readInt() throws Exception
    {
        int t = Integer.parseInt(ConsoleReader.readString());  /*так как метод не void, то нам нужно что то возвращать, а точнее надо возвращать int
                                                                 и для этого мы используем уже описанный методо readString в классе ConsoleReader*/
        return t;
    }

    public static double readDouble() throws Exception
    {
        double d = Double.parseDouble(ConsoleReader.readString());
        return d;
    }

    public static boolean readBoolean() throws Exception
    {
        boolean b = Boolean.parseBoolean(ConsoleReader.readString());
        return b;
    }
}
