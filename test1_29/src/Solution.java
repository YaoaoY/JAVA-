class Solution1 {
    public void moveZeroes(int[] nums) {
        int quickIndex = 0;//快指针，用于遍历
        int slowIndex = 0;//慢指针用于挖坑
        for (; quickIndex < nums.length; quickIndex++) {
            if (nums[quickIndex] == 0) {
                continue;//遇见0就跳过
            }
            nums[slowIndex++] = nums[quickIndex];//慢指针在挖坑，等待快指针给过来的"萝卜"
        }
        for (; slowIndex < nums.length; slowIndex++)//慢指针把0填上去
        {
            nums[slowIndex] = 0;
        }
    }
}

class Solution2 {
    public boolean backspaceCompare(String s, String t) {
        return newString(s).equals(newString(t));
    }

    //通过这个函数，得到退格后的新字符串（不含#的字符串）
    public String newString(String str) {
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') {
                ans.append(str.charAt(i));//填入
            } else {
                if (ans.length() > 0) {
                    ans.deleteCharAt(ans.length() - 1);//慢指针遇到#，就把萝卜拔掉，不前行
                }
            }
        }
        return ans.toString();//将StringBuffer类型转换为String类型返回
    }
}

class Solution {
    public boolean backspaceCompare(String s, String t) {
        int pointerS = s.length() - 1;//指针1号指向s字符串中的待比较元素
        int pointerT = t.length() - 1;//指针2号指向t字符串中的待比较元素
        while (pointerS >= 0 || pointerT >= 0) {//注意这里是||，为什么不是&&？举例：hhh 和 空，结果还是false
            //求出s字符串中第一个待比较元素
            int skipS = 0;
            int slipT = 0;
            while (pointerS >= 0) {
                if (s.charAt(pointerS) == '#') {
                    skipS++;
                    pointerS--;//向后遍历下一个元素
                } else if (skipS > 0) {//类似于“出栈”过程，出栈之前必须判断栈是否为空！
                    pointerS--;
                    skipS--;
                } else {//即skipS=0,元素不为'#'的情况-->找到待比较元素
                    break;//跳出循环
                }
            }
            //同样的方法，找到t字符串中待比较元素
            while (pointerT >= 0) {
                if (t.charAt(pointerT) == '#') {
                    slipT++;
                    pointerT--;
                } else if (slipT > 0) {
                    pointerT--;
                    slipT--;
                } else {
                    break;
                }
            }
            //比较两个循环中分别出来的字符
            if (pointerS >= 0 && pointerT >= 0) {
                if (s.charAt(pointerS) != t.charAt(pointerT)) {
                    return false;
                }
            } else {
                if (pointerS >= 0 || pointerT >= 0)//一个字符串还存在字符待比较，另一个一个字符串的字符已经比较完：如：a null
                    return false;
            }

            //指针后退，为下一次比较做准备
            pointerS--;
            pointerT--;
        }
        //大循环跳出，说明两者皆为空字符串，返回true
        return true;
    }
}