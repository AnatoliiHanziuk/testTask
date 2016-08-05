package task2;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by AnatoliiHanziuk on 05.08.2016.
 */
public class ArraySearchTest {

    ArraySearch arraySearch = new ArraySearch();

    @Test
    public void searchInEmptyArrayTest() {
        Set<List<Integer>> intSet = new HashSet<List<Integer>>();
        List resultList = arraySearch.findArrayInSetByValue(intSet, 2);
        assertThat(resultList.isEmpty(), is(true));
    }

    @Test
    public void searchInNotEmptyListTest() {
        Set<List<Integer>> intSet = new HashSet<List<Integer>>();
        intSet.add(Arrays.asList(1, 2, 3, 4));
        intSet.add(Arrays.asList(2, 3, 4, 5));
        intSet.add(Arrays.asList(3, 4, 5, 6));
        intSet.add(Arrays.asList(4, 5, 6, 7));
        List resultList = arraySearch.findArrayInSetByValue(intSet, 3);
        assertTrue(resultList.contains(Arrays.asList(1, 2, 3, 4)));
        assertTrue(resultList.contains(Arrays.asList(2, 3, 4, 5)));
        assertTrue(resultList.contains(Arrays.asList(3, 4, 5, 6)));
        assertFalse(resultList.contains(Arrays.asList(4, 5, 6, 7)));
    }
}
