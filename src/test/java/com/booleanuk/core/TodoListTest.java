package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class TodoListTest {

    @Test
    public void addTaskTest() {
        TodoList todoList = new TodoList();

        Assertions.assertTrue(todoList.addTask("name"));

    }

    @Test
    public void removeTaskTest() {
        TodoList todoList = new TodoList();

        todoList.addTask("jumping");
        todoList.addTask("sprinting");

        Assertions.assertEquals("Removed", todoList.removeTask("jumping"));
    }

    @Test
    public void changeCompleteTest() {

        //Should change complete

        TodoList todoList = new TodoList();
        todoList.addTask("jumping");

        boolean oldState = todoList.tasks.get(0).getComplete();


        //This now works because the bool value has changes to true
        todoList.changeComplete("jumping");
        Assertions.assertNotEquals(oldState, todoList.tasks.get(0).getComplete());


        //running it again it should work changing it back to false
        todoList.changeComplete("jumping");
        Assertions.assertEquals(oldState, todoList.tasks.get(0).getComplete());
    }

    @Test
    public void getAllTasksTest() {
        TodoList todoList = new TodoList();

        todoList.addTask("jumping");
        todoList.addTask("running");
        todoList.addTask("swimming");

        ArrayList<String> actualTaskNames = new ArrayList<>();


        for (Task task : todoList.getAllTasks()) {
            actualTaskNames.add(task.getName());
        }

        ArrayList<String> expectedTaskNames = new ArrayList<>();
        expectedTaskNames.add("jumping");
        expectedTaskNames.add("running");
        expectedTaskNames.add("swimming");

        Assertions.assertEquals(expectedTaskNames, actualTaskNames);
    }


    @Test
    public void getCompletedTasksTest() {
        TodoList todoList = new TodoList();

        todoList.addTask("jumping");
        todoList.addTask("running");
        todoList.addTask("swimming");

        ArrayList<String> expectedTaskNames = new ArrayList<>();
        expectedTaskNames.add("jumping");
        expectedTaskNames.add("swimming");


        todoList.tasks.get(0).setComplete();
        todoList.tasks.get(2).setComplete();

        ArrayList<String> actualTaskNames = new ArrayList<>();
        for (Task task : todoList.getCompletedTasks()) {
            actualTaskNames.add(task.getName());
        }


        Assertions.assertEquals(expectedTaskNames, actualTaskNames);

    }

    @Test
    public void getNotCompletedTasksTest() {
        TodoList todoList = new TodoList();

        todoList.addTask("jumping");
        todoList.addTask("running");
        todoList.addTask("swimming");

        ArrayList<String> expectedTaskNames = new ArrayList<>();

        //Changed only to running giving a successful test

        expectedTaskNames.add("running");


        todoList.tasks.get(0).setComplete();
        todoList.tasks.get(2).setComplete();

        ArrayList<String> actualTaskNames = new ArrayList<>();
        for (Task task : todoList.getNotCompletedTasks()) {
            actualTaskNames.add(task.getName());
        }


        Assertions.assertEquals(expectedTaskNames, actualTaskNames);

    }

    @Test
    public void getSingeTaskTest(){
        TodoList todoList = new TodoList();

        todoList.addTask("jumping");
        todoList.addTask("running");
        // should fail due to task because it did not get correct item.

        Assertions.assertEquals("Task found", todoList.getTask("running"));
    }

    @Test
    public void getSortedTasksTest(){
        TodoList todoList = new TodoList();

        todoList.addTask("swimming");
        todoList.addTask("jumping");
        todoList.addTask("running");
        todoList.addTask("swimming");

        ArrayList<String> expectedTaskNames = new ArrayList<>();
        expectedTaskNames.add("swimming");
        expectedTaskNames.add("jumping");
        expectedTaskNames.add("running");
        expectedTaskNames.add("swimming");

        //Sort ordinary array
        Collections.sort(expectedTaskNames);

        //bool param acending true gives ascending list and false give descending list
        //Should now fail becouse param is set as false.
        todoList.getSortedTasks(false);

        ArrayList<String> actualTaskNames = new ArrayList<>();
        for (Task task : todoList.getNotCompletedTasks()) {
            actualTaskNames.add(task.getName());
        }

        Assertions.assertEquals(expectedTaskNames, actualTaskNames);






    }

}

