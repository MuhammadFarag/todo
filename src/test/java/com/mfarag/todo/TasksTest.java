package com.mfarag.todo;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class TasksTest {
    private Task TEST_TASK_1 = new Task ("New Task 1") ;
    private Task TEST_TASK_2 = new Task ( "New Task 2") ;
    @Test
    public void TestReturnNoTasksIfNoneExists() {

        assertNull(new Tasks().getCurrent());
    }

    @Test
    public void TestReturnTaskIfTaskExists() {
        Tasks tasks = new Tasks() ;
        tasks.addTask(TEST_TASK_1);
        assertNotNull(tasks.getCurrent());


    }

    @Test
    public void TestReturnFirstTaskIfMultipleTasksExist(){
        Tasks tasks = new Tasks() ;
        tasks.addTask(TEST_TASK_1);
        tasks.addTask(TEST_TASK_2);

        assertEquals(TEST_TASK_1, tasks.getCurrent());

    }

    @Test
    public void TestReturnFirstUncompletedTask () {
        Tasks tasks = new Tasks() ;
        tasks.addTask(TEST_TASK_1);
        tasks.addTask(TEST_TASK_2);

        Task current = tasks.getCurrent() ;
        current.complete();
        //assertFalse(TEST_TASK_2.isCompleted());
        assertEquals(new Date(),current.isCompleted());

    }

    @Test
    public void TestCompletedContainDate () {
        Tasks tasks = new Tasks() ;
        tasks.addTask(TEST_TASK_1);
        tasks.addTask(TEST_TASK_2);

        Task current = tasks.getCurrent() ;
        current.complete();

        assertEquals(new Date(),current.isCompleted());

    }

    @Test
    public void TestLastCompletedToday () {
        Tasks tasks = new Tasks() ;
        tasks.addTask(TEST_TASK_1);
        tasks.addTask(TEST_TASK_2);

        Task current = tasks.getCurrent() ;
        current.complete();

        assertNull(current.isCompletedToday());
    }

    @Test
    public void TestCountingDaysSinceComplete() {
        Tasks tasks = new Tasks();
        tasks.addTask(TEST_TASK_1);
        Task current = tasks.getCurrent();
        current.complete();


    }

    @Test
    public void TestRuturnNullIfLastIsToday() {
        Tasks tasks = new Tasks();
        tasks.addTask(TEST_TASK_1);
        tasks.addTask(TEST_TASK_2);

        Task current = tasks.getCurrent();
        current.complete();
        assertNull(current.isCompletedToday());
    }









}
