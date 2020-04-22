package manager;

import Entity.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskManager {
    private List<Task> tasks= new ArrayList<Task>();
    //Удаление всех Task
    public void clearTasks(){
        Iterator<Task> iterator = tasks.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println("[ALL TASK REMOVED]");
    }
    //Создание Task
    public void createTask(BufferedReader reader) throws IOException {
        System.out.println("[TASK CREATE]\nENTER NAME:");
        String name = reader.readLine();
        tasks.add(new Task(name));
        System.out.println("[OK]\n");
    }
    //Вывод списка Task
    public void getTasksList(){
        System.out.println("[TASK LIST");
        int taskNumber =1;
        for(Task task:tasks){
            System.out.println(taskNumber+". "+task.getName());
            taskNumber++;
        }
        System.out.println();
    }
    //Удаление Task
    public void removeTasks(BufferedReader reader) throws  IOException{
        System.out.println("[TASK REMOVE]\nENTER PROJECT NAME");
        String name = reader.readLine();
        Iterator<Task> iterator = tasks.iterator();
        boolean hasTask = false;
        while(iterator.hasNext()){
            Task task = iterator.next();
            if(task.getName().equals(name)){
                iterator.remove();
                hasTask=true;
                System.out.println("[TASK REMOVED]\n");
            }
        }
        if(!hasTask){
            System.out.println("[TASK NOT FOUND]\n");
        }
    }
}
