package org.example.command;

import org.example.constant.Direction;

public  abstract class abstractCommand {

    public static abstractCommand getCommand(Direction direction) {
        return switch (direction) {
            case N -> new CommandForNorth();
            case S -> new CommandForSouth();
            case E -> new CommandForEast();
            case W -> new CommandForWest();
            default -> null;
        };
    }

    public abstract Direction getDirection();




}
