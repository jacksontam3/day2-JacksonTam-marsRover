package org.example.action;

import org.example.MarsRover;
import org.example.constant.Direction;

public abstract class CommonActions {

    public static CommonActions getCommand(Direction direction) {
        return switch (direction) {
            case N -> new ActionsForNorth();
            case S -> new ActionsForSouth();
            case E -> new ActionsForEast();
            case W -> new ActionsForWest();
        };
    }

    public void execute(MarsRover marsRover, String command) {
        switch (command) {
            case "M" -> forward(marsRover);
            case "B" -> backward(marsRover);
            case "R" -> turnRight(marsRover);
            case "L" -> turnLeft(marsRover);
        }
    }

    public abstract Direction getDirection();

    public abstract void turnLeft(MarsRover marsRover);

    public abstract void turnRight(MarsRover marsRover);

    public abstract void forward(MarsRover marsRover);

    public abstract void backward(MarsRover marsRover);
}