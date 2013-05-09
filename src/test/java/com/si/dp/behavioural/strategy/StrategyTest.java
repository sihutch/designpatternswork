package com.si.dp.behavioural.strategy;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class StrategyTest {

    @Test
    public void testStrategy() {

        final Context context = new Context();
        context.setStrategy(new StrategyA());
        final String a = context.execute();
        context.setStrategy(new StrategyB());
        assertFalse(a.equals(context.execute()));
    }
}