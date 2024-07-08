/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            findPaths(root, "", result);
        }
        return result;
    }

    private void findPaths(TreeNode node, String path, List<String> result) {
        if (node.left == null && node.right == null) { 
            result.add(path + node.val);
        }
        if (node.left != null) {
            findPaths(node.left, path + node.val + "->", result);
        }
        if (node.right != null) {
            findPaths(node.right, path + node.val + "->", result);
        }
    }
    
}


        /*List<String> arr=new ArrayList<>();
        String s1=String.toString(root.val);
        String s2="";
        String str=String.valueOf(root.val);
        arr.add(str);
        int cnt=0;
        tree(root.left,s1,arr);
        tree1(root.right,s2,arr);
        return arr;
       
    }
    List<String> tree(TreeNode root,String s1,List<String> arr){
        if(root.left==null && root.right==null){
            arr.add(path+root.val);
        }
        tree(root.left,s1+"->",arr);
        tree(root.right,s1+"->",arr);
        return arr;

    }
    List<String> tree1(TreeNode root,String s2,List<String> arr){
        if(root.left==null && root.right==null){
            arr.add(path+root.val);
        }
        tree(root.left,s2+"->",arr);
        tree(root.right,s2+"->",arr);
        return arr;
    }
}*/
