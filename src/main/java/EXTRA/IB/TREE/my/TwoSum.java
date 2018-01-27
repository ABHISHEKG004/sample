package EXTRA.IB.TREE.my;

/**
 * Created by abhishek.gupt on 04/12/17.
 */

import java.util.Stack;

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */



public class TwoSum {


    boolean solve(TreeNode root, int target){

        boolean done1 = false, done2 = false;
        TreeNode curr1 = root;
        TreeNode curr2 = root;
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        int val1 = 0, val2 = 0;
        while (true)
        {
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
                        val1 = curr1.val;
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
                        val2 = curr2.val;
                        curr2 = curr2.left;
                    }
                }
            }

            if (val1 >= val2)
                return false;

            if ((val1 != val2) && (val1 + val2) == target)
            {
                return true;
            } else if ((val1 + val2) < target) {
                done1 = false;
            } else if ((val1 + val2) > target) {
                done2 = false;
            }
        }
    }


    public int t2Sum(TreeNode A, int B) {

        if(solve(A, B))
            return 1;
        return 0;
    }
}
