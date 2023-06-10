package yanghgri.datastructuresandalgorithms.algorithms;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
public class SorterTest {
    @Autowired
    private Sorter sorter;

    private final int[] array = {5, 3, 2, 4, 1};

    @Test
    void testBubble() {
        System.out.println(Arrays.toString(sorter.bubble(array)));
    }

    @Test
    void testSelection() {
        System.out.println(Arrays.toString(sorter.selection(array)));
    }

    @Test
    void testInsertion() {
        System.out.println(Arrays.toString(sorter.insertion(array)));
    }
}