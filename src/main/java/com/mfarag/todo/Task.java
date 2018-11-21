package com.mfarag.todo;

public class Task {
    private String name ;
    private Boolean completed ;

    public Task (String name) {
        this.name= name ;
        this.completed = false ;
    }


    public void complete () {
        this.completed = true ;
    }
    public boolean isCompleted() {
        return this.completed ;
    }

}
