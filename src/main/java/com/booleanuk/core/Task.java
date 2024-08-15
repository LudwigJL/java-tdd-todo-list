package com.booleanuk.core;

public class Task {

    private String name;
    private boolean complete;

    Task(String name) {
        this.name = name;
        this.complete = false;
    }

    public String getName() {
        return name;
    }

}
