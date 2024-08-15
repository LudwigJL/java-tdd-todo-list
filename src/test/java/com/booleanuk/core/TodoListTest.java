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

        checkerList = todoList.getAllTasks();


        Assertions.assertEquals(checkerList, todoList.getAllTasks());
    }


    @Test
    public void getCompletedTest() {
        TodoList todoList = new TodoList();
        TodoList checkerList = new TodoList();

        //Initially all set as false when add
        todoList.addTask("jumping");
        todoList.addTask("running");
        todoList.addTask("swimming");

        checkerList.addTask("jumping");
        checkerList.addTask("running");
        checkerList.addTask("swimming");

        //change to completed for jumping and swimming
        todoList.changeComplete("jumping");
        todoList.changeComplete("swimming");

        //Should give fail because we have changed the completed status on the todoList.

    }



    @Test
    public void getSingeTaskTest(){
        TodoList todoList = new TodoList();

        todoList.addTask("jumping");
        todoList.addTask("running");
        // should fail due to task becouse it did not get correct item.

        Assertions.assertEquals(todoList.tasks.get(1), todoList.getTask("running"));
    }
}



