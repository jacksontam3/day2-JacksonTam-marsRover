package org.example.command;

import org.example.constant.Direction;

public class CommandForEast extends abstractCommand{

    @Override
    public Direction getDirection() {
        return Direction.E;
    }
}
