package com.mfarag.todo;

import java.util.ArrayList;
import java.util.List;

public class Tasks {

    List<Task> tasks = new ArrayList<>();


    public Task getCurrent() {
        int id = 0 ;
        if (id >= tasks.size()) {
            return null;
        }else {
                return tasks.get(id);

        }
    }



    public void addTask (Task task) {
        tasks.add(task) ;
    }
}
