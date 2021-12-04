package day2;

import java.util.List;

/**
 * @author Noxia Lupus
 * @version 04.12.2021
 */
public class MovingSubmarine {
    /**
     * This method calculates how far the submarine moves based on the commands and multiplies the results of depth and
     * horizontal values
     * @param commands is an ArrayList with a String Array, contains commands and values
     * @return int which is the result of multiplying depth and horizontal values
     */
    public int multiplyCommands(List<String[]> commands) {
        int horizontalValue = 0, depthValue = 0, result;
        for (String[] command : commands) {
            String direction = command[0];
            int value = Integer.parseInt(command[1]);
            switch (direction) {
                case "forward":
                    horizontalValue = horizontalValue + value;
                    break;
                case "down":
                    depthValue = depthValue + value;
                    break;
                case "up":
                    depthValue = depthValue - value;
                    break;
            }
        }
        result = depthValue * horizontalValue;
        return result;
    }
}
