package com.javarush.test.level14.lesson08.home04;


public class Computer {

    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;

    public Computer()
    {
        keyboard = new Keyboard();
        mouse = new Mouse();
        monitor= new Monitor();
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }
}
