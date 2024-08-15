package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {

    ArrayList<Task> tasks = new ArrayList<>();

    public boolean addTask(String name){
        Task task = new Task(name);
        tasks.add(task);

        return true;
    }

    public String removeTask(String findTask){
        for(int i = 0; i < tasks.size(); i++){
            if(tasks.get(i).getName() == findTask){
                tasks.remove(tasks.get(i));

                return "Removed";
            }
        }

        return "Not in list";
    }

    public void changeComplete(String findTask){
        for(int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getName() == findTask) {
                tasks.get(i).setComplete();

            }
        }
    }












}
