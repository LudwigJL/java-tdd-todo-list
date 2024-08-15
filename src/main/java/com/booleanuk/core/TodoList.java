package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Objects;

public class TodoList {

    ArrayList<Task> tasks = new ArrayList<>();

    public boolean addTask(String name){
        Task task = new Task(name);
        tasks.add(task);

        return true;
    }

    public String removeTask(String findTask){
        for(int i = 0; i < tasks.size(); i++){
            if(Objects.equals(tasks.get(i).getName(), findTask)){
                tasks.remove(tasks.get(i));

                return "Removed";
            }
        }
        return "Not in list";
    }

    public Task getTask(String findTask){
        for(int i = 0; i < tasks.size(); i++){
            if(tasks.get(i).getName() == findTask){
                return tasks.get(i);
            }
        }
        return null;
    }

    public void changeComplete(String findTask){
        for(int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getName() == findTask) {
                tasks.get(i).setComplete();

            }
        }
    }

    public ArrayList<Task> getAllTasks(){
        return this.tasks;
    }



    public ArrayList<Task> getCompletedTasks(){

        ArrayList<Task> completedTasks = new ArrayList<>();

        for(int i = 0; i < tasks.size(); i++){

            if(tasks.get(i).getComplete() == true){
                completedTasks.add(tasks.get(i));




            }
        }
        return completedTasks;
    }

    public ArrayList<Task> getNotCompletedTasks(){

        ArrayList<Task> unCompletedTasks = new ArrayList<>();

        for(int i = 0; i < tasks.size(); i++){

            if(tasks.get(i).getComplete() == false){
                unCompletedTasks.add(tasks.get(i));


            }
        }
        return unCompletedTasks;
    }















}
