package com.agsatria.widgetapp;

import java.util.Random;

public class RandomGenerator {
    public static int Generate(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
}
