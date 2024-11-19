import org.example.MarsRover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_initialize_mars_rover() {
        //Given
        MarsRover rover = new MarsRover(0, 0, "N");
        //When
        String report = rover.showStatus();
        //Then
        assertEquals("0:0:N", report);
    }

    @Test
    public void should_face_west_when_orient_north_and_turn_left() {
        //Given
        MarsRover rover = new MarsRover(0,0,"N");
        //When
        rover.executeCommand("L");
        String report = rover.showStatus();
        //Then
        assertEquals("0:0:W", report);
    }

    @Test
    public void should_face_south_when_orient_west_and_turn_left() {
        //Given
        MarsRover rover = new MarsRover(0,0,"W");
        //When
        rover.executeCommand("L");
        String report = rover.showStatus();
        //Then
        assertEquals("0:0:S", report);
    }

    @Test
    public void should_face_east_when_orient_south_and_turn_left() {
        //Given
        MarsRover rover = new MarsRover(0,0,"S");
        //When
        rover.executeCommand("L");
        String report = rover.showStatus();
        //Then
        assertEquals("0:0:E", report);
    }

    @Test
    public void should_face_north_when_orient_east_and_turn_left() {
        //Given
        MarsRover rover = new MarsRover(0,0,"E");
        //When
        rover.executeCommand("L");
        String report = rover.showStatus();
        //Then
        assertEquals("0:0:N", report);
    }

}