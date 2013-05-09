package com.si.dp.behavioural.strategy;

public class Context {

    private Strategy strategy;

    public void setStrategy(final Strategy strategy) {
        this.strategy = strategy;
    }

    public String execute() {
        return strategy.execute();
    }
}