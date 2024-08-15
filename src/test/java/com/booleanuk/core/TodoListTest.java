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

        //Redtest
        //setCompleted changes the Task object's boolean value to the opposite. this function should return true if it works.
        //Sould fail due to the asserEquals false.
        Assertions.assertEquals(false,  todoList.setCompleted("jumping"));
    }
}

