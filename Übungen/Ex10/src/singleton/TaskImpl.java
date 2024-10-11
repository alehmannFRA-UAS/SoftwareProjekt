package singleton;

public class TaskImpl implements Task {

    private String name;
    private boolean running;

    public TaskImpl(String name) {
        this.name = name;
        this.running = false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void execute() {
        running = true;
    }

    @Override
    public boolean isRunning() {
        return running;
    }

}
