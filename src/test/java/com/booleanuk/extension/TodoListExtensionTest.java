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

        //Now the name of ID 0 will be changed from swimming to dishing.
        Assertions.assertEquals("Dishing", todoList.getTask(0).getName());
    }

    @Test
    public void changeStatusByUsingIDTest(){
        TodoList todoList = new TodoList();


        //Should be set as false when adding
        todoList.addTask("Running");
        Assertions.assertEquals(false, todoList.getTask(0).getComplete());

        //Should change the status(complete) with this method, not yet implemented.
        todoList.changeComplete(0);

        //Should now have changed to true
        Assertions.assertEquals(true, todoList.getTask(0).getComplete());


    }

    @Test
    public void seeDateAndTimeOfWhenTaskWasCreatedTest(){
        TodoList todoList = new TodoList();

        todoList.addTask("Running");
        Assertions.assertEquals("2024/08/24", todoList.getTask(0).getDate());


    }


}
