package com.mfarag.todo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class TaskListTest {
    private String TEST_TASK_1 = "New Task 1" ;
    private String TEST_TASK_2 = "New Task 2" ;
    @Test
    public void TestReturnNoTasksIfNoneExists() {

        assertNull(new TaskList().getTask());
    }

    @Test
    public void TestReturnTaskIfTaskExists() {
        TaskList taskList = new TaskList() ;
        taskList.addTask("New Task");
        assertNotNull(taskList.getTask());


    }

    @Test
    public void TestReturnFirstTaskIfMultipleTasksExist(){
        TaskList taskList = new TaskList() ;
        taskList.addTask(TEST_TASK_1);
        taskList.addTask(TEST_TASK_2);

        assertEquals(TEST_TASK_1,taskList.getTask());

    }







}
