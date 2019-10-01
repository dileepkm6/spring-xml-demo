package com.stackroute.domain;


import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;

public class Movie
{
    private Actor actor;
    private ApplicationContext context;
    public Movie(Actor actor) {
        this.actor = actor;
    }
    public Movie(){}
    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

}
