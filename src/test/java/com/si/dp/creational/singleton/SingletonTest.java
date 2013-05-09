package com.si.dp.creational.singleton;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class SingletonTest {

    @Test
    public void testSingleInstance() throws Exception {
        final Singleton s = Singleton.getInstance();
        assertSame(s, Singleton.getInstance());
    }
}