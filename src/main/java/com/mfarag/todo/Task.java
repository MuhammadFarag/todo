package com.mfarag.todo;

import java.util.Date;

public class Task {
    private String name ;
    private String description ;
    private Date completedDate ;

    public  Task (String name, String description) {
        this.name = name ;
        this.description = description ;
    }


    public void setName (String name) {
        this.name = name ;
    }
    public void setDescription(String description) {
        this.name = description;
    }
    public void complete  () {
        this.completedDate = new Date();
    }
    public Boolean isCompleted () {
        if (this.completedDate == null) {
            return false ;
        }  else {
            return true ;
        }
    }

    public Boolean isNotCompleted () {
        if (this.completedDate == null) {
            return true ;
        }  else {
            return false ;
        }
    }



    }
