package com.si.dp.creational.singleton;

public class Singleton {

    private static volatile Singleton INSTANCE;

    private Singleton() {

    }

    public static final Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}