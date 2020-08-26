package duke.task;

import duke.ui.Ui;

import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> tasks;
    private int taskCount;
    private Ui ui;
    
    public TaskList() {
        this.tasks = new ArrayList<>();
        this.taskCount = 0;
        this.ui = new Ui();
    }
    
    public TaskList(ArrayList<Task> savedTasks) {
        this.tasks = savedTasks;
        this.taskCount = savedTasks.size();
        this.ui = new Ui();
    }
    
    public ArrayList<Task> getTasks() {
        return tasks;
    }
    
    public void addTask(Task task) {
        tasks.add(task);
        taskCount += 1;
        ui.printMessage(" Your task has been recorded.",
                "   " + task,
                " You have " + taskCount + " tasks currently.");
    }
    
    public void deleteTask(int index) {
        if (index < 1 || taskCount < index) {
            ui.printMessage(" Sorry I cannot find your specified task :(");
        } else {
            Task removed = tasks.get(index - 1);
            tasks.remove(index - 1);
            taskCount -= 1;
            ui.printMessage(" Okay, I will remove this task for you",
                    "   " + removed,
                    " You have " + taskCount + " tasks currently.");
        }
    }
    
    public void listTasks() {
        if (taskCount == 0) {
            ui.printMessage(" You've got no tasks now.",
                    " If you want to get busy add more task.",
                    " I'll remember them for you :)");
        } else {
            ui.printMessage(" Let me list out all your tasks...");
            for (int i = 0; i < taskCount; i++) {
                ui.printMessage(" " + (i + 1) + "." + tasks.get(i));
            }
        }
    }
    
    public void markAsDone(int index) {
        if (index < 1 || taskCount < index) {
            ui.printMessage(" Sorry I cannot find your specified task :(");
        } else {
            tasks.get(index - 1).completeTask();
            ui.printMessage(" Congratulations for finishing this task!",
                    " Let me mark this as done for you.",
                    "   " + tasks.get(index - 1));
        }
    }
}