import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    private Map<Integer, Integer> frequencyMap;

    FrequencyCounter() {
        frequencyMap = new HashMap<>();
    }

    public void countFrequency(TreeNode root) {
        countFrequencyRec(root);
    }

    private void countFrequencyRec(TreeNode root) {
        if (root != null) {
            countFrequencyRec(root.getLeft());
            frequencyMap.put(root.getData(), frequencyMap.getOrDefault(root.getData(), 0) + 1);
            countFrequencyRec(root.getRight());
        }
    }

    public Map<Integer, Integer> getFrequencyMap() {
        return frequencyMap;
    }
}
