package com.example.exercise3;

public class Counter{

    private static int value;
    private static int max;
    private static int min;
    private static int d;
    private static int step;

    public Counter(int max, int min, int d, int step) {
        this.max = max;
        this.min = min;
        this.d = d;
        this.step = step;
    }
    public Counter() {
        this(1000, -1000, 0, 100);
    }
    public static void getRaise(){
        if(value < max)
            value+= step;
    }
    public static void getLower(){
        if (value > min)
            value-= step;
    }
    public static void getReset(){
        value = d;
    }

    public static int Value(){
        return value;
    }
}