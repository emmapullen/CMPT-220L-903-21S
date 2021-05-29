
public class DummyBST {
    Node root = null;

    public Node newNode(int key) {
        Node x = new Node();
        x.key = key;
        x.left = null;
        x.right = null;
        return x;
    }
    public Node insert(Node root,int key){
        if (root == null) {
            return newNode(key);
        }
        if (key < root.key) {
            root.left = insert(root.left, key);
        } else if (key > root.key) {
            root.right = insert(root.right, key);
        }
        return root;
    /*Node rootNode;
    public DummyBST() {
        rootNode = null;
    }
    Node insertXX(Node root, int key) {
        if (root == null)
        {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertXX(root.left, key);
        else if (key > root.key)
            root.right = insertXX(root.right, key);

        return root;
        /*Node temp;
        if (rootNode == null)
            rootNode = new Node(key);
        else {
            temp = new Node(key);

            if (key < rootNode.key)
                rootNode.left = temp;
            else {
                rootNode.right = rootNode;
                rootNode = temp;
            }
            System.out.println(rootNode);
        }

         */
    }

    public void Inorder(Node root) {
        if (node == null)
            return;
        Inorder(node.left);
        System.out.print(node.key + " ");
        Inorder(node.right);
    }

    void Preorder(Node root) {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        Preorder(node.left);
        Preorder(node.right);
    }
    public int height(Node root) {
        if (root == null)
            return 0;
        else {
            int leftSubtreeHeight = height(root.left);
            int rightSubtreeHeight = height(root.right);
            if (leftSubtreeHeight < rightSubtreeHeight)
                return (rightSubtreeHeight + 1);
            else
                return (leftSubtreeHeight + 1);
        }
    }
    public boolean finder(Node root, int key){
        if(root==null){
            return false;
        }
        if(key==root.key){
            return true;
        }
        return key<root.key
                ? finder(root.left,key):finder(root.right,key);
    }
    static int findMax(root node)
    {
        if (node == null)
            return Integer.MIN_VALUE;
        int res = node.key;
        int lres = findMax(node.left);
        int rres = findMax(node.right);

        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }
    static int findMin(root node)
    {
        if (node == null)
            return Integer.MAX_VALUE;
        int res = node.key;
        int lres = findMin(node.left);
        int rres = findMin(node.right);

        if (lres < res)
            res = lres;
        if (rres < res)
            res = rres;
        return res;
    }
    public boolean Search(root node,int key ){
        boolean current=false;
        if(node==null){
            return false;
        }
        while (node != null){
            if(key<node.key){
                node=node.left;
            }else if(key>node.key){
                node=node.right;
            }else{
                current=true;
                break;
            }
        }
        return current;
}
}