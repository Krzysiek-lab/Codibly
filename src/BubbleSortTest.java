import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortTest {

    @Test
    public void shouldSortList() {
        //given
        List<Double> compare = new ArrayList<>(List.of(1d, 3d, 4d, 5d, 6d, 8d, 8d));
        BubbleSort bubbleSort = new BubbleSort();
        List<Double> input = new ArrayList<>(List.of(1d, 4d, 5d, 6d, 8d, 3d, 8d));
        //when
        List<Double> sorted = bubbleSort.sort(input);
        //then
        Assert.assertEquals(sorted, compare);
    }

    @Test
    public void shouldSortDoubleList() {
        //given
        List<Double> compareDouble = new ArrayList<>(List.of(-9.3, 0.1, 0.2, 4d, 5d, 9d));
        BubbleSort bubbleSort = new BubbleSort();
        List<Double> input = new ArrayList<>(Arrays.asList(-9.3, 0.2, 4d, 0.1, 5d, 9d));
        //when
        List<Double> sorted = bubbleSort.sort(input);
        //then
        Assert.assertEquals(sorted, compareDouble);
    }

    @Test
    public void shouldSortEmptyList() {
        //given
        List<Double> compareEmpty = new ArrayList<>();
        BubbleSort bubbleSort = new BubbleSort();
        //when
        List<Double> sorted = bubbleSort.sort(compareEmpty);
        //then
        Assert.assertEquals(sorted, compareEmpty);
    }

    @Test(expected = NullPointerException.class)
    public void shouldSortNullList() {
        //given
        List<Double> list = null;
        BubbleSort bubbleSort = new BubbleSort();
        //when
        bubbleSort.sort(list);
    }

    @Test
    public void shouldSortNullAndDoubleList() {
        //given
        List<Double> compareDoubleAndNull = new ArrayList<>();
        compareDoubleAndNull.add(null);
        compareDoubleAndNull.add(5.0001);
        BubbleSort bubbleSort = new BubbleSort();
        //when
        List<Double> sorted = bubbleSort.sort(compareDoubleAndNull);
        //then
        Assert.assertEquals(sorted, compareDoubleAndNull);
    }

}