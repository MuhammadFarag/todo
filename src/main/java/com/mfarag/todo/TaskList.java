package com.mfarag.todo;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<String> list = new ArrayList<>();


    public String getTask() {
        int id = 0 ;
        if (id >= list.size()) {
            return null;
        }else {
                return list.get(id);

        }

    }

    public void addTask (String task) {
        list.add(task) ;
    }
}
