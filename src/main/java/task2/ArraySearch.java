package task2;

import static utils.Log.CONSOLE;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by AnatoliiHanziuk on 05.08.2016.
 */
public class ArraySearch {

    public List findArrayInSetByValue(Set<List<Integer>> set, int value) {
        CONSOLE.info("Incoming unordered list of arrays: " + set.toString());
        CONSOLE.info("Incoming unordered list of arrays: " + value);
        List<List> result = new ArrayList<List>();
        for (List<Integer> list : set) {
            if (list.contains(value)) {
                result.add(list);
                CONSOLE.info("Arrays that contain the provided number: " + result.toString());
            }
        }
        return result;
    }
}
