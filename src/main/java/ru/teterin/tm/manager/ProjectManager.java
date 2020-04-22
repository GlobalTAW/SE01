package ru.teterin.tm.manager;

import ru.teterin.tm.Entity.Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProjectManager {
    private List<Project> projects= new ArrayList<>();
    //Удаление всех проектов
    public void clearProjects(){
        Iterator<Project> iterator = projects.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println("[ALL PROJECT REMOVED]");
    }
    //Создание проекта
    public void createProject(BufferedReader reader) throws IOException {
        System.out.println("[PROJECT CREATE]\nENTER NAME:");
        String name = reader.readLine();
        projects.add(new Project(name));
        System.out.println("[OK]\n");
    }
    //Вывод списка проектов
    public void getProjectsList(){
        System.out.println("[PROJECT LIST]");
        int projectNumber =1;
        for(Project project:projects){
            System.out.println(projectNumber+". "+project.getName());
            projectNumber++;
        }
        System.out.println();
    }
    //Удаление проекта
    public void removeProject(BufferedReader reader) throws  IOException{
        System.out.println("[PROJECT REMOVE]\nENTER PROJECT NAME");
        String name = reader.readLine();
        Iterator<Project> iterator = projects.iterator();
        boolean hasProject = false;
        while(iterator.hasNext()){
            Project project = iterator.next();
            if(project.getName().equals(name)){
                iterator.remove();
                hasProject=true;
                System.out.println("[PROJECT REMOVED]\n");
                break;
            }
        }
        if(!hasProject){
            System.out.println("[PROJECT NOT FOUND]\n");
        }
    }
    // Редактировать проект
    public void editProject(BufferedReader reader) throws  IOException{
        System.out.println("[PROJECT EDIT]\nENTER PROJECT NAME");
        String name = reader.readLine();
        Iterator<Project> iterator = projects.iterator();
        boolean hasProject = false;
        while(iterator.hasNext()){
            Project project = iterator.next();
            if(project.getName().equals(name)){
                hasProject=true;
                System.out.println("[ENTER NEW NAME]");
                project.setName(reader.readLine());
                System.out.println("[PROJECT EDITED]\n");
                break;
            }
        }
        if(!hasProject){
            System.out.println("[PROJECT NOT FOUND]\n");
        }
    }
}
