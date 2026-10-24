class Solution {
    static int mini;
    static int maxi;
    public int minValue(Node root) {
        if(root==null)return -1;
        mini=Integer.MAX_VALUE;
        maxi=Integer.MIN_VALUE;
        helper(root);
        return mini;
    }
    public void helper(Node root){
        if(root==null)return;
        mini=Math.min(mini,root.data);
        maxi=Math.max(maxi,root.data);
        helper(root.left);
        helper(root.right);
    }
}