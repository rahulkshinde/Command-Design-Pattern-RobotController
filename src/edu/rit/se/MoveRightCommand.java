package edu.rit.se;

public class MoveRightCommand implements Command {

    private Robot robot;

    public MoveRightCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        int x = robot.getX();
        int y = robot.getY();
        robot.updatePosition(x + 1, y);
    }

    @Override
    public void undo() {
        int x = robot.getX();
        int y = robot.getY();
        robot.updatePosition(x - 1, y);
    }
}
