package com.booleanuk.core;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class Task {

    private String name;
    private boolean complete;
    private String date;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime now = LocalDateTime.now();

    public Task(String name) {
        this.name = name;
        this.complete = false;
        this.date = dtf.format(now);
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

    public String getDate(){
        return this.date;
    }

}
