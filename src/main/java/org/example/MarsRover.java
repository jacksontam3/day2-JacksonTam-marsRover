package org.example;

import org.example.action.ActionsForNorth;
import org.example.action.CommonActions;
import org.example.constant.Direction;

public class MarsRover {

    public static final String Semicolon = ":";
    private Coordinate coordinate;
    private CommonActions commonActions;

    public MarsRover(){
        this.coordinate = new Coordinate();
        setOperation(new ActionsForNorth());
    }

    private void setOperation(CommonActions abstractAction) {
        this.commonActions = abstractAction;
    }


    public MarsRover(int x, int y, Direction direction) {
       this.coordinate = new Coordinate(x, y);
       setOperation(CommonActions.getCommand(direction));
    }

    public String showStatus() {
        return coordinate.getX() + Semicolon + coordinate.getY() + Semicolon + commonActions.getDirection().name();
    }

    public void executeCommand(String commands) {
        commands.chars()
                .forEach(c -> {
                    commandHandler((char) c);
                });

       showStatus();
    }

    public void commandHandler(char currentChar){
        commonActions.execute(this, String.valueOf(currentChar));
        }

    public CommonActions getCommonActions() {
        return commonActions;
    }

    public void setCommonActions(CommonActions commonActions) {
        this.commonActions = commonActions;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public void updateCoordinate(int x, int y) {
        setCoordinate(new Coordinate(x,y));
    }
}