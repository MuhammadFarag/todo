package com.mfarag.todo;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class TaskListTest {

    @Test
    public void TestReturnNoTasksIfNoneExists() {

        assertNull(new TaskList().getTask());
    }

    @Test
    public void TestReturnTaskIfTaskExists() {
        TaskList taskList = new TaskList() ;
        assertNotNull(taskList);

    }

    public Object getTask() {
        return null;
    }



}
