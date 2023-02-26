import java.util.ArrayList;
import java.util.List;

public class SimpleTree {
    private Node root;

    public void add(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return;
        }

        Node currentNode = root;

        while (currentNode != null) {
            if (value < currentNode.getValue()) {
                if (currentNode.getLeftChild() == null) {
                    currentNode.setLeftChild(newNode);
                    return;
                }
                currentNode = currentNode.getLeftChild();
            } else {
                if (currentNode.getRightChild() == null) {
                    currentNode.setRightChild(newNode);
                    return;
                }
                currentNode = currentNode.getRightChild();
            }
        }
    }

    public List<Integer> traverseInOrder() {
        List<Integer> values = new ArrayList<>();
        traverseInOrder(root, values);
        return values;
    }

    private void traverseInOrder(Node node, List<Integer> values) {
        if (node == null) {
            return;
        }
        traverseInOrder(node.getLeftChild(), values);
        values.add(node.getValue());
        traverseInOrder(node.getRightChild(), values);
    }
}