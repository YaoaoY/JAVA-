public class Main {
    public static void main(String[] args) {
       int[] preorder = {1,2};
       int[] inorder = {2,1};
       TreeNode root = new Main().buildTree(preorder,inorder);

    }
    public  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
    public   TreeNode buildTree(int[] preorder, int[] inorder) {
        //递归函数的定义：给定二叉树前序遍历、中序遍历数组、前序数组起始坐标、前序数组末尾坐标、中序数组起始坐标、中序数组末尾坐标
        int pStart = 0;
        int pEnd = preorder.length-1;
        int iStart = 0;
        int iEnd = inorder.length-1;
        return build(preorder,inorder, pStart, pEnd, iStart, iEnd);
    }
    public  TreeNode build(int[] preorder, int[] inorder, int pStart, int pEnd, int iStart, int iEnd){
        if(pStart > pEnd || iStart > iEnd){
            return null;
        }

        //1、先在前序数组中找到根节点
        TreeNode root = new TreeNode(preorder[pStart]);
        if(pStart==pEnd){
            return root;
        }
        //2、在中序数组中找到根节点，划分左右数组
        int rootIndex = -1;
        int leftSize = 0;
        for(int  i = iStart; i <= iEnd; i++){
            if(inorder[i] == root.val){
                rootIndex = i;
                leftSize = i-iStart;
                break;
            }
        }
        root.left = build(preorder, inorder, pStart+1, pStart+leftSize, iStart ,rootIndex-1);
        root.right = build(preorder, inorder, pStart+leftSize+1, pEnd, rootIndex+1, iEnd);
        return root;

    }
}