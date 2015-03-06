package edu.rit.se;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements Command {

    private List<Command> commands;

    public MacroCommand() {
        commands = new ArrayList<>();
    }

    public void add(Command cmd) {
        commands.add(cmd);
    }

    public void remove(Command cmd) {
        commands.remove(cmd);
    }

    @Override
    public void execute() {
        for (Command cmd : commands) {
            cmd.execute();
        }
    }

    @Override
    public void undo() {
        for (Command cmd : commands) {
            cmd.undo();
        }
    }
}
