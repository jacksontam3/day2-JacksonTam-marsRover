package org.example.command;

import org.example.constant.Direction;

public class CommandForNorth extends abstractCommand{

    @Override
    public Direction getDirection() {
        return Direction.N;
    }
}
