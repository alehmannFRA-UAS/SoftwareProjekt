package singleton;

import java.util.ArrayList;

public class TaskManager {

    private static TaskManager instance;

    ArrayList<Task> tasks;

    private TaskManager() {
        tasks = new ArrayList<>();
    }

    public static TaskManager getInstance() {
        if (instance == null) {
            instance = new TaskManager();
        }
        return instance;
    }

    public void executeTask(Task task) {
        System.out.println("Executing task: " + task.getName());
        task.execute();
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Added task: " + task.getName());
    }

    public void removeTask(Task task) {
        boolean removed = tasks.remove(task);
        if (removed == false) {
            System.out.println("Task not found: " + task.getName());
            return;            
        }
        System.out.println("Removed task: " + task.getName());
    }

    public void listTasks() {
        System.out.println("Tasks:");
        for (Task task : tasks) {
            System.out.println(task.getName() + " - " + (task.isRunning() ? "running" : "not running"));
        }
    }
    
}
