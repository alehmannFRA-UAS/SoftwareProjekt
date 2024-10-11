package singleton;

public interface Task {

    /**
    * Returns the human-readable name of the task. Must be unique across existing tasks
    *
    * @return the name of the task
    */
    String getName();

    /**
     * Starts the execution of the task.
     */
    void execute();

    /**
     * State of the task.
     */
    boolean isRunning();
    
}
