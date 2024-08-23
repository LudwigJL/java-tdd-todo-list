package com.booleanuk.extension;

import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListExtensionTest {

    @Test
    public void getSpecificTaskByIDTest(){
        TodoList todoList = new TodoList();

        todoList.addTask("Swimming");
        todoList.addTask("Running");

        Assertions.assertEquals(todoList.getTask(1).getName(), "Running");
    }


}
