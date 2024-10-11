package singleton;

public class Main {

    public static void main(String[] args) {
        TaskManager taskManager = TaskManager.getInstance();
        Task task1 = new TaskImpl("Task 1");
        Task task2 = new TaskImpl("Task 2");
        Task task3 = new TaskImpl("Task 3");
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        taskManager.listTasks();
        taskManager.executeTask(task1);
        taskManager.executeTask(task2);
        taskManager.executeTask(task3);
        taskManager.listTasks();
        taskManager.removeTask(task2);
        taskManager.listTasks();
    }

}
