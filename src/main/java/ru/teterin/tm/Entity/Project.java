package ru.teterin.tm.Entity;

public class Project {
    private String name;
    public Project(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}