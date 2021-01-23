package duke;

/**
 * Deals with making sense of the user command.
 */
public class Parser {
    /**
     * Parse user input into the corresponding command.
     *
     * @param taskString user input
     * @return corresponding command (enum)
     */
    public Command parse(String[] taskString) {
        if (taskString[0].toLowerCase().equals("list")) {
            return Command.LIST;
        } else if (taskString[0].toLowerCase().contains("done")) {
            return Command.DONE;
        } else if (taskString[0].toLowerCase().contains("delete")) {
            return Command.DELETE;
        } else if (taskString[0].toLowerCase().equals("find")) {
            return Command.FIND;
        } else if (taskString[0].toLowerCase().equals("todo")) {
            return Command.TODO;
        } else if (taskString[0].toLowerCase().equals("deadline")) {
            return Command.DEADLINE;
        } else if (taskString[0].toLowerCase().equals("event")) {
            return Command.EVENT;
        } else {
            return Command.UNKNOWN;
        }
    }
}