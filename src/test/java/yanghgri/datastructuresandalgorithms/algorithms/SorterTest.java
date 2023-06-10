package yanghgri.datastructuresandalgorithms.algorithms;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
public class SorterTest {
    @Autowired
    private Sorter sorter;

    @Test
    void testBubble() {
        int[] ints = {5, 3, 2, 4, 1};
        System.out.println(Arrays.toString(sorter.bubble(ints)));
    }

    @Test
    void testSelection() {
        int[] ints = {5, 3, 2, 4, 1};
        System.out.println(Arrays.toString(sorter.selection(ints)));
    }
}