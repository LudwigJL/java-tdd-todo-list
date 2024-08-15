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
    public void changeCompleteTest(){
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
}

