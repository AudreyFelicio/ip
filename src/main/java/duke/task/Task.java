package duke.task;

/**
 * Implements task objects.
 *
 * @author Audrey Felicio Anwar
 */
public class Task {
    protected String description;
    protected boolean done;

    /**
     * Initializes a task object.
     *
     * @param description The task description.
     * @param done Indicates whether the task is done.
     */
    public Task(String description, boolean done) {
        this.description = description;
        this.done = done;
    }

    /**
     * Completes a task.
     */
    public void completeTask() {
        done = true;
    }

    /**
     * Describes task.
     *
     * @return String that describes task.
     */
    @Override
    public String toString() {
        String symbol = (this.done ? "[\u2713] " : "[\u2718] ");
        return symbol + description;
    }

    /**
     * Describes task to be saved in hard disk.
     *
     * @return String that will be stored on hard disk.
     */
    public String saveToHardDisk() {
        int isDone = done ? 1 : 0;
        return " | " + isDone + " | " + description;
    }

    /**
     * Returns description of task.
     *
     * @return Description of task.
     */
    public String getDescription() {
        return description;
    }
}
