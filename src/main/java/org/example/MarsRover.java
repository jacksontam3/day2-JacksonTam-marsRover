package org.example;

public class MarsRover {

    private int x;
    private int y;
    private String direction;


    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public String showStatus() {
        return this.x + ":" + this.y + ":" + this.direction;
    }


}