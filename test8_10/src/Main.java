import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] pushV = {1,2,3,4,5};
        int[] popV = {4,5,3,2,1};
        Solution.IsPopOrder(pushV,popV);
    }
}


 class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param pushV int整型一维数组
     * @param popV int整型一维数组
     * @return bool布尔型
     */
    public static boolean IsPopOrder (int[] pushV, int[] popV) {
        // write code here
        //定义两个指针i、j分别扫描两个数组
        //1):p1扫描一个元素就入栈
        Stack<Integer> stack = new Stack<>();
        int j = 0;//代表指向popV数组的第一个元素
        for (int i = 0; i < pushV.length && j < popV.length; i++){
            stack.push(pushV[i]);
            //2)入栈完，拿出来和popV此时所指元素比较
            while((!stack.empty())&&stack.peek()==popV[j]){
                //相同(就代表这个元素要出栈了)，则出栈，且j++
                stack.pop();
                j++;
            }
            //直到不同，说明当前i所指元素不用出栈，i才向后走
        }
        //若最终栈为空
        if(stack.empty()){
            return true;
        }
        return false;

    }
}