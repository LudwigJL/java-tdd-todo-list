package com.booleanuk.core;

public class Task {

    private String name;
    private boolean complete;

    public Task(String name) {
        this.name = name;
        this.complete = false;
    }

    public String getName() {
        return name;
    }

    public boolean getComplete(){
        return complete;
    }

    public void setComplete(){
        if(complete){
            complete = false;
        }
        else {
            complete = true;
        }
    }

}
