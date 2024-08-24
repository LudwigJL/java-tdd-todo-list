package com.booleanuk.core;

public class Task {

    private String name;
    private boolean complete;
    private String date;

    public Task(String name) {
        this.name = name;
        this.complete = false;
    }

    public String getName() {
        return name;
    }

    public String setName(String newName){
        return this.name = newName;
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
