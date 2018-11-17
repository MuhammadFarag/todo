package com.mfarag.todo;

import org.junit.Test;

import static org.junit.Assert.assertNull;

public class TodoTest {

    @Test
    public void TestReturnNoTasksIfNoneExists() {
        assertNull(new TaskList().getTask());
    }
}
