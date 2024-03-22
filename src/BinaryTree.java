import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.exit;

public class BinaryTree {
    private TreeNode root;

    BinaryTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data <= root.getData())
            root.setLeft(insertRec(root.getLeft(), data));
        else if (data > root.getData())
            root.setRight(insertRec(root.getRight(), data));

        return root;
    }

    public void constructTreeFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                int data = Integer.parseInt(line);
                insert(data);
            }
            System.out.println("Binary Tree has been constructed with the data from file '" + filename + "'.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error: Binary Tree has not been constructed.");
            exit(-1);
        }
    }

    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.getLeft());
            System.out.print(root.getData() + " ");
            inorderTraversal(root.getRight());
        }
    }

    public TreeNode getRoot() {
        return root;
    }
}
