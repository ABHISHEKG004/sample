package EXTRA.IB.TREE.my;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhishek.gupt on 05/12/17.
 */

class Node {

    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}
public class LCA {


    private List<Integer> path1 = new ArrayList<Integer>();
    private List<Integer> path2 = new ArrayList<Integer>();

    int findLCA(Node a,int n1, int n2) {
        path1.clear();
        path2.clear();
        return solve(a, n1, n2);
    }

    private int solve(Node root, int n1, int n2) {

        if (!findPath(root, n1, path1) || !findPath(root, n2, path2)) {
            return -1;
        }

        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {
            if (!path1.get(i).equals(path2.get(i)))
                break;
        }

        return path1.get(i-1);
    }

    private boolean findPath(Node root, int n, List<Integer> path)
    {
        if (root == null) {
            return false;
        }

        path.add(root.data);

        if (root.data == n) {
            return true;
        }

        if (root.left != null && findPath(root.left, n, path)) {
            return true;
        }

        if (root.right != null && findPath(root.right, n, path)) {
            return true;
        }

        path.remove(path.size()-1);

        return false;
    }

    public int lca(Node a, int val1, int val2) {

        return findLCA(a, val1, val2);
    }


    // Driver program to test above functions
    public static void main (String[] args)
    {
        /*   6
            / \
           10  2
          / \ / \
         1  3 7 12

        10 and 2 are swapped
        */

        Node root = new Node(6);
        root.left = new Node(10);
        root.right = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(12);
        root.right.left = new Node(7);

        //System.out.println("Inorder Traversal"+" of the original tree");
        LCA tree = new LCA();
        //tree.printInorder(root);

        tree.lca(root, 3, 10);

        //System.out.println("\nInorder Traversal"+ " of the fixed tree");
        //tree.printInorder(root);

    }

}
