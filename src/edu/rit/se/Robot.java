package edu.rit.se;

public class Robot {

    private int MAX_X, MAX_Y;
    private int x, y;

    public Robot(int max_x, int max_y) {
        this.MAX_X = max_x;
        this.MAX_Y = max_y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void updatePosition(int x, int y) {
        if (x >= 0 && x < MAX_X) {
            this.x = x;
        }
        if (y >= 0 && y < MAX_Y) {
            this.y = y;
        }
        //...
        //more code that communicates with the hardware
        //sending low-level commands to it
    }
}
