public class Main {
    public static void main(String[] args) {
        SimpleTree tree = new SimpleTree();

        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(1);
        tree.add(4);
        tree.add(6);
        tree.add(8);

        System.out.println("Inorder traversal:");
        System.out.println(tree.traverseInOrder());

    }

}