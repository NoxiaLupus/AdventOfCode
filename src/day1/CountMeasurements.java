package day1;

import java.util.List;
import java.util.logging.Logger;

public class CountMeasurements {
    public int countingMeasurements(List<Integer> measurements) {
        Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        int count = 0;
        log.info("Start counting...");
        for (int i = 0; i < measurements.size() - 1; i++) {
            int first = measurements.get(i);
            int second = measurements.get(i+1);
            if (first < second) {
                count++;
            }
        }
        log.info("Finished counting!");
        return count;
    }
}
