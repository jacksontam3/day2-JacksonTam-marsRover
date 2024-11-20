package org.example.action;

import org.example.Coordinate;
import org.example.MarsRover;
import org.example.constant.Direction;

public class ActionsForSouth extends CommonActions {

    @Override
    public Direction getDirection() {
        return Direction.S;
    }

    @Override
    public void turnLeft(MarsRover marsRover) {
        marsRover.setCommonActions(new ActionsForEast());
    }

    @Override
    public void turnRight(MarsRover marsRover) {
        marsRover.setCommonActions(new ActionsForWest());
    }

    @Override
    public void forward(MarsRover marsRover) {
        Coordinate coordinate = marsRover.getCoordinate();
        marsRover.updateCoordinate(coordinate.getX(), coordinate.getY()- 1);
    }

    @Override
    public void backward(MarsRover marsRover) {
        Coordinate coordinate = marsRover.getCoordinate();
        marsRover.updateCoordinate(coordinate.getX(), coordinate.getY()+ 1);
    }
}
