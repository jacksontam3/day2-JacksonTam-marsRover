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
            default -> null;
        };
    }

    public void execute(MarsRover marsRover, String command){
        switch (command) {
            case "M": forward(marsRover); break;
            case "B": backward(marsRover); break;
            case "R": turnRight(marsRover); break;
            case "L": turnLeft(marsRover); break;

        }
    };

    public abstract Direction getDirection();

    public abstract void turnLeft(MarsRover marsRover);

    public abstract void turnRight(MarsRover marsRover);

    public abstract void forward(MarsRover marsRover);

    public abstract void backward(MarsRover marsRover);
}
