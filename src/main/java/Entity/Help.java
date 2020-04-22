package Entity;

public class Help {
    private String helpMessage = "help: Show all commands.\n" +
            "project_clear: Remove all projects.\n" +
            "project_create: Create new project.\n" +
            "project_list: Show all projects.\n" +
            "project_edit: Edit selected project\n" +
            "project_remove: Remove selected project\n" +
            "task_clear: Remove all tasks.\n" +
            "task_create: Create new task.\n" +
            "task_list: Show all tasks.\n" +
            "task_edit: Edit selected task.\n" +
            "task_remove: Remove selected task.";
    public void getHelpMessage(){
        System.out.println(helpMessage);
    }
}
