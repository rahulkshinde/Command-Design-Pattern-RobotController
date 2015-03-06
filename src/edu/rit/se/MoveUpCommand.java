package edu.rit.se;

public class MoveUpCommand implements Command {

    private Robot robot;

    public MoveUpCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        int x = robot.getX();
        int y = robot.getY();
        robot.updatePosition(x, y + 1);
    }

    @Override
    public void undo() {
        int x = robot.getX();
        int y = robot.getY();
        robot.updatePosition(x, y - 1);
    }
}
