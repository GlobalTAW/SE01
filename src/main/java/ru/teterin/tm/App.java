package ru.teterin.tm;

import ru.teterin.tm.entity.Command;
import ru.teterin.tm.entity.Helper;
import ru.teterin.tm.manager.ProjectManager;
import ru.teterin.tm.manager.TaskManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    private static ProjectManager projectManager = new ProjectManager();
    private static TaskManager taskManager = new TaskManager();
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("*** WELCOME TO TASK MANAGER ***");
        while(true){
            String string=reader.readLine().trim().toUpperCase();
            Command command;
            try{
                 command= Command.valueOf(string);
            }
            catch(IllegalArgumentException e){
                command = Command.valueOf("DEFAULT");
            }
            switch(command){
                case DEFAULT:
                    System.out.println("[COMMAND NOT FOUND]\n");
                    break;
                case HELP:
                    Helper.getHelpMessage();
                    break;
                case PROJECT_CLEAR:
                    projectManager.clearProjects();
                    break;
                case    PROJECT_CREATE:
                    projectManager.createProject(reader);
                    break;
                 case    PROJECT_LIST:
                    projectManager.getProjectsList();
                    break;
                case PROJECT_EDIT:
                    projectManager.editProject(reader);
                    break;
                case   PROJECT_REMOVE:
                    projectManager.removeProject(reader);
                    break;
                case TASK_CLEAR:
                    taskManager.clearTasks();
                    break;
                case TASK_CREATE:
                    taskManager.createTask(reader);
                    break;
                case TASK_LIST:
                    taskManager.getTasksList();
                    break;
                case TASK_EDIT:
                    taskManager.editTask(reader);
                    break;
                 case TASK_REMOVE:
                    taskManager.removeTasks(reader);
                    break;
                case EXIT:
                    reader.close();
                    System.exit(0);
                    break;
            }
        }
    }

}
