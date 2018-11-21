package com.mfarag.todo;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class TaskListTest {



    @Test
    public void TestReturnTaskIfTaskExists() {
        Tasks tasks = new Tasks() ;
        tasks.addTask("New Task","hi");
        assertNotNull(tasks.getTask(0));
    }



    @Test
    public void TestComlete () {
        Task task = new Task ("asdas", "asdsad");
        task.complete();
    }

    @Test
    public void TestReturnFirstUncompleted () {
        Tasks tasks = new Tasks();
        tasks.addTask("dd","d");
        tasks.returnFirstUncompleted() ;

    }







}
