public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.display();
    }
}
// 2、无头双向链表实现
class LinkedList {
    class LinkedNode{
        int data;
        LinkedNode pre;
        LinkedNode next;
        public LinkedNode(int data) {
            this.data = data;
            this.pre = this.next = null;
        }
    }

    LinkedNode head;
    LinkedNode last;
    int size = 0;
    //头插法
    public void addFirst(int data){
        LinkedNode linkedNode = new LinkedNode(data);
        //注意判空
        if (head == null){
            head = last = linkedNode;
        }else {
            linkedNode.next = head;
            head.pre = linkedNode;
            head = linkedNode;
        }
        size++;
    }
    //尾插法
    public void addLast(int data){
        LinkedNode linkedNode = new LinkedNode(data);
        //注意判空
        if (last == null){
            head = last = linkedNode;
        }else {
            last.next = linkedNode;
            linkedNode.pre = last;
            last = linkedNode;
        }
        size++;
    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        //首先判断坐标合理性
        if(index<0||index>size){
            return false;
        }
        //头插和尾插直接调用接口
        if(index == 0){
            addFirst(data);
            return true;
        }
        if (index==size){
            addLast(data);
            return true;
        }
        //在中间插
        LinkedNode linkedNode = new LinkedNode(data);
        //设置cur指针，指到待插入位置
        LinkedNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.pre.next = linkedNode;
        linkedNode.pre = cur.pre;
        linkedNode.next = cur;
        cur.pre = linkedNode;
        size++;
        return true;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        //判空
        if (head == null){
            return false;
        }
        LinkedNode cur = head;
        while (cur!=null){
            if (cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){

        LinkedNode cur = head;
        while (cur!=null){
            if (cur.data == key){
               //当删除的是头节点
                if (cur == head){
                    head = cur.next;
                    //可能是只有一个节点
                    if(head != last){
                        head.pre = null;
                    }
                }else {
                    //先判断是否删除的是尾节点
                    if (cur == last){
                        last = cur.pre;
                        last.next = null;
                    }else {
                        //那么待删除的节点在中间
                        cur.pre.next = cur.next;
                        cur.next.pre = cur.pre;
                        cur = null;//等待自动垃圾回收
                    }
                }
                size--;
                return;
            }
            cur = cur.next;
        }

    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        LinkedNode cur = head;
        while (cur!=null){
            if (cur.data == key){
                //当删除的是头节点
                if (cur == head){
                    head = cur.next;
                    //可能是只有一个节点
                    if(head != last){
                        head.pre = null;
                    }
                }else {
                    //先判断是否删除的是尾节点
                    if (cur == last){
                        last = cur.pre;
                        last.next = null;
                    }else {
                        //那么待删除的节点在中间
                        cur.pre.next = cur.next;
                        cur.next.pre = cur.pre;
                        cur = null;//等待自动垃圾回收
                    }
                }
                size--;
            }
            cur = cur.next;
        }
    }
    //得到单链表的长度
    public int size(){
        return size;
    }
    public void display(){
        LinkedNode cur = head;
        while (cur !=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();

    }
    public void clear(){
        LinkedNode cur = head;
        LinkedNode temp = cur;
        while (cur !=null){
           temp = cur;
            cur = cur.next;
            temp.pre = null;
            temp.next = null;
        }
       head = last = null;
        size = 0;

    }
}