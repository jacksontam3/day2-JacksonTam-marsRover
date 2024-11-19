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

    public void executeCommand(String command) {
        switch (command) {
            case "L":
                switch (this.direction) {
                    case "N":
                        this.direction = "W";
                        break;
                    case "W":
                        this.direction = "S";
                        break;
                    case "S":
                        this.direction = "E";
                        break;
                    case "E":
                        this.direction = "N";
                        break;
                }
                break;
            case "R":
                switch (this.direction) {
                    case "N":
                        this.direction = "E";
                        break;
                    case "E":
                        this.direction = "S";
                        break;
                    case "S":
                        this.direction = "W";
                        break;
                    case "W":
                        this.direction = "N";
                        break;
                }
                break;
        }
    }


}