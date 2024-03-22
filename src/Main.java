import java.util.Map;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.constructTreeFromFile("data.txt");

        System.out.println();

        System.out.println("Inorder Traversal of Binary Tree:");
        binaryTree.inorderTraversal(binaryTree.getRoot());

        System.out.println();
        System.out.println();

        FrequencyCounter frequencyCounter = new FrequencyCounter();
        frequencyCounter.countFrequency(binaryTree.getRoot());

        Map<Integer, Integer> frequencyMap = frequencyCounter.getFrequencyMap();
        System.out.println("Frequency of each value in the Binary Tree:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Value: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}