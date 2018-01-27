package EXTRA.IB.TREE.my;

/**
 * Created by abhishek.gupt on 04/12/17.
 */

import java.util.ArrayList;

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
class BinarySearchTree
{
    TreeNode first, middle, last, prev;

    void solve( TreeNode root)
    {
        if( root != null )
        {
            solve( root.left);
            if (prev != null && root.val < prev.val)
            {
                if (first == null)
                {
                    first = prev;
                    middle = root;
                }
                else
                    last = root;
            }
            prev = root;
            solve( root.right);
        }
    }

    ArrayList<Integer> correctBST(TreeNode root )
    {
        ArrayList<Integer> ans = new ArrayList();
        first = middle = last = prev = null;
        solve( root );
        if( first != null && last != null )
        {
            ans.add(last.val);
            ans.add(first.val);
        }
        else if( first != null && middle !=null )
        {
            ans.add(middle.val);
            ans.add(first.val);
        }

        return ans;
    }
}

public class SwapInBst {
    public ArrayList<Integer> recoverTree(TreeNode a) {

        BinarySearchTree tree = new BinarySearchTree();

        return tree.correctBST(a);


    }
}
