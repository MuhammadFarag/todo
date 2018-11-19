package com.mfarag.todo;

import org.junit.Test;

import static org.junit.Assert.assertNull;

public class TaskListTest {

    @Test
    public void TestReturnNoTasksIfNoneExists() {

        assertNull(new TaskList().getTask(0));
    }



}
