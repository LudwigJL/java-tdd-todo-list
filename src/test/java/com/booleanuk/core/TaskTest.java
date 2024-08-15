package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TaskObjTest {

    @Test
    public void addTaskTest() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.addTask("name"));

    }

    @Test
    public void removeTaskTest(){
        TodoList todoList = new TodoList();

        //Will fail if task not in list
        //todoList.addTask("jumping");
        todoList.addTask("sprinting");

        Assertions.assertEquals("Removed", todoList.removeTask("jumping"));
    }
}

