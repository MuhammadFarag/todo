package com.mfarag.todo;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<String> list = new ArrayList<>();


    public String getTask(int id) {
            if (id >= list.size()) {
                return null;
            } else {
                return list.get(id);

            }
    }

    public String getFirstTask () {
        if (list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }

    public void addTask (String task) {
        list.add(task) ;
    }
}
