package org.example.command;

import org.example.constant.Direction;

public class CommandForWest extends abstractCommand{

    @Override
    public Direction getDirection() {
        return Direction.W;
    }
}
