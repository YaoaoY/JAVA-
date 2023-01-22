/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-01-22
 * Time: 18:08
 */
//leetcode刷题
class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        int mid=(left+right)/2;
        while(left<=right){
            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                right=mid-1;
                mid=(left+right)/2;
            }
            else{
                left=mid+1;
                mid=(left+right)/2;
            }
        }
        return -1;
    }
}

class Person{
    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    private int name;
    public int age;
    public String sex;
}
public class TestDemo {
    public static void main1(String[] args) {
        Person person1=new Person();

    }
}
