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

    @Test
    public void changeNameByIDTest(){
        TodoList todoList = new TodoList();

        //This will have ID 0 in the hashmap
        todoList.addTask("Swimming");

        //This will be at 1.
        todoList.addTask("Running");

        //Now I want to change Swimming to Dishing.
        todoList.changeName(0, "Dishing");

        //Now the name of ID 0 will be changed from swimming to dishing. This will fail because method not yet implemented
        Assertions.assertEquals("Dishing", todoList.getTask(0).getName());
    }


}
