package com.booleanuk.core;

import java.util.*;

public class TodoList {

    HashMap<Integer, Task> tasks;
    int idCounter = 0;

    public TodoList(){
        tasks = new HashMap<>();
    }

    //Works
    public String addTask(String name){
        int uniqueID = idCounter;
        Task task = new Task(name);
        System.out.println(task.getName());

        tasks.put(uniqueID, task);
        idCounter++;

        return task.getName();
    }

    //Works
    public boolean removeTask(Integer ID){
        tasks.remove(ID);

        return true;
    }

    //Works
    public Task getTask(Integer ID){
        return tasks.get(ID);
    }

    //Works
    public ArrayList<String> getAllTasks(){
        ArrayList<String> allTasks = new ArrayList<>();

        for(Integer i : tasks.keySet()){
            allTasks.add(tasks.get(i).getName());
        }

        return allTasks;
    }


    //WORKS
    public void changeComplete(Integer ID){
        tasks.get(ID).setComplete();
    }


    //Works
    public ArrayList<String> getCompletedTasks(){

        ArrayList<String> completedTasks = new ArrayList<>();

        for (Integer i : tasks.keySet()) {
            if (tasks.get(i).getComplete()) {
                completedTasks.add(tasks.get(i).getName());
            }
        }

        return completedTasks;
    }

    //works
    public ArrayList<String> getNotCompletedTasks(){

        ArrayList<String> unCompletedTasks = new ArrayList<>();

        for(int i = 0; i < tasks.size(); i++){

            if(tasks.get(i).getComplete() == false){
                unCompletedTasks.add(tasks.get(i).getName());


            }
        }
        return unCompletedTasks;
    }

    public String checkTask(String name){

        for (Integer i : tasks.keySet()){
            if(Objects.equals(tasks.get(i).getName(), name)){
                return "Task is in the list";
            }
        }

        return "Task was not found perhaps it does not exist";
    }

    public ArrayList<String> sortAlphabetically(boolean reverse){
        ArrayList<String> sortedList = new ArrayList<>();

        for(Integer i : tasks.keySet()){
            sortedList.add(tasks.get(i).getName());
        }

        if(!reverse){
            Collections.sort(sortedList);
        }
        else {
            Collections.sort(sortedList, Collections.reverseOrder());
        }

        return sortedList;
    }


    public void changeName(Integer ID, String newName){
            Task item = tasks.get(ID);
            item.setName(newName);

    }

















}
