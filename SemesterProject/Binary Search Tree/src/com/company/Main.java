package base;

public class Main {

    public static void main(String[] args) {
        DummyBST tree = new DummyBST();
        tree.insert(9);
        tree.insert(3);
        tree.insert(5);
        tree.insert(11);
        tree.insert(4);
        tree.insert(7);

        tree.preOrder();
        tree.postOrder();
        tree.inOrder();

        tree.finder();
        tree.finder();

        tree.height();

        tree.findMin();
        tree.findMax();

        tree.Search();


    }
}
