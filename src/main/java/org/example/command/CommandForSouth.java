package org.example.command;

import org.example.constant.Direction;

public class CommandForSouth extends abstractCommand{

    @Override
    public Direction getDirection() {
        return Direction.S;
    }
}
