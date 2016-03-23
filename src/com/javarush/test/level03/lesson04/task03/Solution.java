package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg Zerg1 = new Zerg();
        Zerg1.name = "Zerg1";
        Zerg Zerg2 = new Zerg();
        Zerg2.name = "Zerg2";
        Zerg Zerg3 = new Zerg();
        Zerg3.name = "Zerg3";
        Zerg Zerg4 = new Zerg();
        Zerg4.name = "Zerg4";
        Zerg Zerg5 = new Zerg();
        Zerg5.name = "Zerg5";
        Zerg Zerg6 = new Zerg();
        Zerg6.name = "Zerg6";
        Zerg Zerg7 = new Zerg();
        Zerg7.name = "Zerg7";
        Zerg Zerg8 = new Zerg();
        Zerg8.name = "Zerg8";
        Zerg Zerg9 = new Zerg();
        Zerg9.name = "Zerg9";
        Zerg Zerg10 = new Zerg();
        Zerg10.name = "Zerg10";

        Protos protos1 = new Protos();
        protos1.name = "Protos1";
        Protos protos2 = new Protos();
        protos2.name = "Protos2";
        Protos protos3 = new Protos();
        protos3.name = "Protos3";
        Protos protos4 = new Protos();
        protos4.name = "Protos4";
        Protos protos5 = new Protos();
        protos5.name = "Protos5";

        Terran terran1 = new Terran();
        terran1.name = "Terran1";
        Terran terran2 = new Terran();
        terran2.name = "Terran2";
        Terran terran3 = new Terran();
        terran3.name = "Terran3";
        Terran terran4 = new Terran();
        terran4.name = "Terran4";
        Terran terran5 = new Terran();
        terran5.name = "Terran5";
        Terran terran6 = new Terran();
        terran6.name = "Terran6";
        Terran terran7 = new Terran();
        terran7.name = "Terran7";
        Terran terran8 = new Terran();
        terran8.name = "Terran8";
        Terran terran9 = new Terran();
        terran9.name = "Terran9";
        Terran terran10 = new Terran();
        terran10.name = "Terran10";
        Terran terran11 = new Terran();
        terran11.name = "Terran11";
        Terran terran12 = new Terran();
        terran12.name = "Terran12";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}