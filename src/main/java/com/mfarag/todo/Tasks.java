package com.mfarag.todo;

import java.util.*;

public class Tasks {
    private List<Task> tasks = new LinkedList<Task>();

    public void addTask (String name,String description){
        Task task = new Task(name,description);
        tasks.add( task);
    }

    public Task getTask(int id) {
        if (id >= tasks.size()) {
            return null;
        } else {
            return tasks.get(0);

        }
    }
    public Task returnFirstUncompleted () {
        int i ;
        for (i = 0 ; i < tasks.size() ; i ++) {
            Task task = getTask(i);
            if (task.isNotCompleted()) {
                return task ;
            } else {
                return null ;
            }
        }
        return null ;

    }



}
