package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

class TodoListTest {

    @Test
    public void addTaskTest() {
        TodoList todoList = new TodoList();

        Assertions.assertEquals("Swimming", todoList.addTask("Swimming"));
        Assertions.assertEquals("Running", todoList.addTask("Running"));


    }

    @Test
    public void removeTaskTest(){
        TodoList todoList = new TodoList();

        todoList.addTask("Swimming");
        todoList.addTask("Running");
        todoList.addTask("Sprinting");

        todoList.removeTask(1);
        ArrayList<String> currentTodos = todoList.getAllTasks();

        Assertions.assertNotEquals("Running", currentTodos.get(1));
    }

    @Test
    public void getAllTasks(){
        TodoList todoList = new TodoList();

        todoList.addTask("Swimming");
        todoList.addTask("Running");
        todoList.addTask("Sprinting");

        ArrayList<String> listOfTasks = todoList.getAllTasks();

        Assertions.assertEquals("Swimming", listOfTasks.get(0));
        Assertions.assertEquals("Running", listOfTasks.get(1));
        Assertions.assertEquals("Sprinting", listOfTasks.get(2));

    }

    @Test
    public void changeStatusTest(){
        TodoList todoList = new TodoList();

        todoList.addTask("Swimming");
        Assertions.assertEquals(false, todoList.getTask(0).getComplete());

        todoList.changeComplete(0);
        Assertions.assertEquals(true, todoList.getTask(0).getComplete());

    }

    @Test
    public void getCompletedtasks(){
        TodoList todoList = new TodoList();

        todoList.addTask("Swimming");
        todoList.addTask("Running");
        todoList.addTask("Sprinting");
        todoList.changeComplete(1);
        todoList.changeComplete(2);

        ArrayList<String> expectedListOfCompletedTasks = new ArrayList<>();
        expectedListOfCompletedTasks.add("Running");
        expectedListOfCompletedTasks.add("Sprinting");

        Assertions.assertEquals(expectedListOfCompletedTasks, todoList.getCompletedTasks());

    }

    @Test
    public void getNotCompletedtasks(){
        TodoList todoList = new TodoList();

        todoList.addTask("Swimming");
        todoList.addTask("Running");
        todoList.addTask("Sprinting");
        todoList.changeComplete(1);
        todoList.changeComplete(2);

        ArrayList<String> expectedListOfCompletedTasks = new ArrayList<>();
        expectedListOfCompletedTasks.add("Swimming");

        Assertions.assertEquals(expectedListOfCompletedTasks, todoList.getNotCompletedTasks());

    }

    @Test
    public void checkIfTaskExists(){
        TodoList todoList = new TodoList();

        todoList.addTask("Swimming");
        todoList.addTask("Running");
        todoList.addTask("Sprinting");


        Assertions.assertEquals("Task is in the list", todoList.checkTask("Sprinting"));
        Assertions.assertEquals("Task was not found perhaps it does not exist", todoList.checkTask("Rowing"));
    }

    @Test
    public void checkSortAlphabetically(){
        TodoList todoList = new TodoList();

        todoList.addTask("Swimming");
        todoList.addTask("Running");
        todoList.addTask("Sprinting");

        ArrayList<String> expectedListOfCompletedTasks = new ArrayList<>();
        expectedListOfCompletedTasks.add("Swimming");
        expectedListOfCompletedTasks.add("Running");
        expectedListOfCompletedTasks.add("Sprinting");

        Collections.sort(expectedListOfCompletedTasks);


        Assertions.assertEquals(expectedListOfCompletedTasks, todoList.sortAlphabetically(false));

    }

    @Test
    public void checkSortAlphabeticallyReverse(){
        TodoList todoList = new TodoList();

        todoList.addTask("Swimming");
        todoList.addTask("Running");
        todoList.addTask("Sprinting");

        ArrayList<String> expectedListOfCompletedTasks = new ArrayList<>();
        expectedListOfCompletedTasks.add("Swimming");
        expectedListOfCompletedTasks.add("Running");
        expectedListOfCompletedTasks.add("Sprinting");

        Collections.sort(expectedListOfCompletedTasks, Collections.reverseOrder());

        Assertions.assertEquals(expectedListOfCompletedTasks, todoList.sortAlphabetically(true));
    }



}

