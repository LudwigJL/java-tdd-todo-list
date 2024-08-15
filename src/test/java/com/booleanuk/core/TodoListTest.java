package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {

    @Test
    public void addTaskTest() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.addTask("name"));

    }

    @Test
    public void removeTaskTest(){
        TodoList todoList = new TodoList();



        todoList.addTask("jumping");
        todoList.addTask("sprinting");

        Assertions.assertEquals("Removed", todoList.removeTask("jumping"));
    }

    @Test
    public void setCompleteTest(){
        TodoList todoList = new TodoList();
        todoList.addTask("jumping");

        //Greentest
        //expected value true, it passes meaning the .setCompleted value is working.
        Assertions.assertEquals(true,  todoList.setCompleted("jumping"));
    }
}

