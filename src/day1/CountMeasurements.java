package day1;

import java.util.ArrayList;
import java.util.List;

/**
 * This class contains the methods to adding the measurements and to counting the measurements.
 * @author Noxia Lupus
 * @version 04.12.2021
 */
public class CountMeasurements {
    /**
     * This method returns an integer with the number of increasing depths. For that there is a comparison between
     * every two elements of a given ArrayList<Integer>
     * @param measurements<Integer> with measurements
     * @return int number of increasing elements
     */
    public int countingMeasurements(List<Integer> measurements) {
        int count = 0, first, second;
        for (int i = 0; i < measurements.size() - 1; i++) {
            first = measurements.get(i);
            second = measurements.get(i+1);
            if (first < second) {
                count++;
            }
        }
        return count;
    }

    /**
     * This method returns an ArrayList<Integer> with added measurements. This means from a given ArrayList<Integer>
     * every three measurements will be added, for example the six measurements 1, 2, 3, 4, 5, 6 will be added like
     * sum1 = 1 + 2 + 3 and sum2 = 2 + 3 + 4 and so on.
     * @param measurements<Integer> with measurements
     * @return ArrayList<Integer> with added measurements
     */
    public List<Integer> addingMeasurements(List<Integer> measurements) {
        int sum1, sum2, sum3;
        List<Integer> addedMeasurements = new ArrayList<>();
        for (int i = 0; i < measurements.size() - 2; i++) {
            sum1 = measurements.get(i);
            sum2 = measurements.get(i+1);
            sum3 = measurements.get(i+2);
            addedMeasurements.add((sum1+sum2+sum3));
        }
        return addedMeasurements;
    }
}
