package com.mfarag.todo;

import java.util.Date;

public class Task {
    private String name ;
    private Date completed ;

    public Task (String name) {
        this.name= name ;
        this.completed = null ;
    }


    public void complete () {
        this.completed = new Date() ;
    }
    public Date isCompleted() {
        return this.completed ;
    }

}
