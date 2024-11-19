package org.example;

import java.util.HashMap;
import java.util.Map;

public class MarsRover {

    private int x;
    private int y;
    private String direction;


    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public String showStatus() {
        return this.x + ":" + this.y + ":" + this.direction;
    }

    public void executeCommand(String commands) {
        Map<Character, Map<String, String>> directionChanges = new HashMap<>();
        directionChanges.put('L', Map.of("N", "W", "W", "S", "S", "E", "E", "N"));
        directionChanges.put('R', Map.of("N", "E", "E", "S", "S", "W", "W", "N"));

        Map<String, Runnable> moveForward = Map.of(
                "N", () -> y++,
                "E", () -> x++,
                "S", () -> y--,
                "W", () -> x--
        );

        Map<String, Runnable> moveBackward = Map.of(
                "N", () -> y--,
                "E", () -> x--,
                "S", () -> y++,
                "W", () -> x++
        );

        commands.chars().forEach(command -> {
            if (directionChanges.containsKey((char) command)) {
                direction = directionChanges.get((char) command).get(direction);
            } else if (command == 'M') {
                moveForward.get(direction).run();
            } else if (command == 'B') {
                moveBackward.get(direction).run();
            }
        });
    }


}