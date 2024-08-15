package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TaskObjTest {

    @Test
    public void addTaskTest() {
        TodoList todoList = new TodoList();
        Assertions.assertFalse(todoList.addTask("name"));

    }
}