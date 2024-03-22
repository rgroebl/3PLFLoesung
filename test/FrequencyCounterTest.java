import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyCounterTest {

    private static BinaryTree binaryTree;

    @BeforeAll
    public static void setUp() {
        binaryTree = new BinaryTree();
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(7);
        binaryTree.insert(5);
        binaryTree.insert(7);
        binaryTree.insert(7);
        binaryTree.insert(8);
    }

    @Test
    public void testFrequencyCounter() {
        FrequencyCounter frequencyCounter = new FrequencyCounter();
        frequencyCounter.countFrequency(binaryTree.getRoot());

        assertEquals(1, frequencyCounter.getFrequencyMap().get(3).intValue());
        assertEquals(2, frequencyCounter.getFrequencyMap().get(5).intValue());
        assertEquals(3, frequencyCounter.getFrequencyMap().get(7).intValue());
        assertEquals(1, frequencyCounter.getFrequencyMap().get(8).intValue());
    }
}