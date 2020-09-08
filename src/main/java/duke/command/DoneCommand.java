package duke.command;

import duke.storage.Storage;
import duke.task.TaskList;
import duke.ui.Ui;

/**
 * Implements done command objects.
 *
 * @author Audrey Felicio Anwar
 */
public class DoneCommand extends Command {
    private int index;

    public DoneCommand(int index) {
        this.index = index;
    }

    /**
     * Executes the given command.
     *
     * @param tasks Task list the user currently have.
     * @param ui Tool to interact with user.
     * @param storage Storage to load and save data.
     * @return Responses to be passed to user.
     */
    @Override
    public String executeCommand(TaskList tasks, Ui ui, Storage storage) {
        tasks.markAsDone(index, ui);
        return ui.getResponses();
    }
}
