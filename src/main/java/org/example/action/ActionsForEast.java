package org.example.action;

import org.example.Coordinate;
import org.example.MarsRover;
import org.example.constant.Direction;

public class ActionsForEast extends CommonActions {

    @Override
    public Direction getDirection() {
        return Direction.E;
    }

    @Override
    public void turnLeft(MarsRover marsRover) {
        marsRover.setCommonActions(new ActionsForNorth());
    }

    @Override
    public void turnRight(MarsRover marsRover) {
        marsRover.setCommonActions(new ActionsForSouth());
    }

    @Override
    public void forward(MarsRover marsRover) {
        Coordinate coordinate = marsRover.getCoordinate();
        marsRover.updateCoordinate(coordinate.getX() + 1, coordinate.getY());
    }

    @Override
    public void backward(MarsRover marsRover) {
        Coordinate coordinate = marsRover.getCoordinate();
        marsRover.updateCoordinate(coordinate.getX() - 1, coordinate.getY());
    }
}
