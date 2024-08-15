package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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


        //This now works because the bool value has cahnges to true

        todoList.changeComplete("jumping");
        Assertions.assertNotEquals(oldState, todoList.tasks.get(0).getComplete());


        //running it again it should work changing it back to false
        todoList.changeComplete("jumping");
        Assertions.assertEquals(oldState, todoList.tasks.get(0).getComplete());
    }

    @Test
    public void getAllTasksTest() {
        TodoList todoList = new TodoList();
        ArrayList<Task> checkerList = new ArrayList<>();

        todoList.addTask("jumping");
        todoList.addTask("running");
        todoList.addTask("swimming");

        Task objOne = new Task("jumping");
        Task objTwo = new Task("running");
        Task objThree = new Task("swimming");

        checkerList.add(objOne);
        checkerList.add(objTwo);
        checkerList.add(objThree);

        ArrayList<String> todoListNames = new ArrayList<>();
        ArrayList<String> checkerListNames = new ArrayList<>();

        for (int i = 0; i < todoList.tasks.size(); i++) {
            todoListNames.add(todoList.tasks.get(i).getName());
        }

        for (int i = 0; i < checkerList.size(); i++) {
            checkerListNames.add(checkerList.get(i).getName());
        }

        Assertions.assertEquals(checkerListNames, todoListNames);
    }

}


