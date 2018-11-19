package com.mfarag.todo;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class TaskListTest {

    @Test
    public void TestReturnNoTasksIfNoneExists() {

        assertNull(new TaskList().getTask(0));
    }

    @Test
    public void TestReturnTaskIfTaskExists() {
        TaskList taskList = new TaskList() ;
        taskList.addTask("New Task");
        assertNotNull(taskList.getTask(0));
    }

    @Test
    public void TestReturnFirstTask() {
        TaskList taskList = new TaskList() ;
        taskList.addTask("New Task");
        assertNotNull(taskList.getFirstTask() );

    }






}
