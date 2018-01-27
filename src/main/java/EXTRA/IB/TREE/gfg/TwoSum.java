package EXTRA.IB.TREE.gfg;

import java.util.Stack;

/**
 * Created by abhishek.gupt on 04/12/17.
 */

public class TwoSum {

    boolean solve(Node root, int target){

        boolean done1 = false, done2 = false;
        Node curr1 = root;
        Node curr2 = root;
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();
        int val1 = 0, val2 = 0;
        while (true)
        {
            // Find next node in normal Inorder traversal. See following post
            // http://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
            while (done1 == false)
            {
                if (curr1 != null)
                {
                    s1.push(curr1);
                    curr1 = curr1.left;
                }
                else
                {
                    done1 = true;
                    if (!s1.isEmpty()) {
                        curr1 = s1.pop();
                        val1 = curr1.data;
                        curr1 = curr1.right;
                        done1 = true;
                    }
                }
            }


            while (done2 == false)
            {
                if (curr2 != null)
                {
                    s2.push(curr2);
                    curr2 = curr2.right;
                }
                else
                {
                    done2 = true;
                    if (!s2.isEmpty()){
                        curr2 = s2.pop();
                        val2 = curr2.data;
                        curr2 = curr2.left;
                    }
                }
            }

            if ((val1 != val2) && (val1 + val2) == target)
            {
                return true;
            } else if ((val1 + val2) < target) {
                done1 = false;
            } else if ((val1 + val2) > target) {
                done2 = false;
            }

            if (val1 >= val2)
                return false;
        }
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
        TwoSum tree = new TwoSum();
        //tree.printInorder(root);

        System.out.println(tree.solve(root, 6));

        //System.out.println("\nInorder Traversal"+ " of the fixed tree");
        //tree.printInorder(root);
    }
}