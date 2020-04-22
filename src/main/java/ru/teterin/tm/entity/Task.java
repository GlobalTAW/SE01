package ru.teterin.tm.entity;

public class Task {
    private String name;
    public Task(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}
