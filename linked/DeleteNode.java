package com.example.facerecog.test.linked;

/**
 * @author lihai
 * @date 2020/11/30 15:49
 * 删除链表中的节点
 *
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点。传入函数的唯一参数为 要被删除的节点 。
 *
 *
 *
 * 现有一个链表 -- head = [4,5,1,9]，它可以表示为:
 *
 *
 *
 * 示例 1：
 *
 * 输入：head = [4,5,1,9], node = 5
 * 输出：[4,1,9]
 * 解释：给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 *
 * 示例 2：
 *
 * 输入：head = [4,5,1,9], node = 1
 * 输出：[4,5,9]
 * 解释：给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
 *
 *
 *
 * 提示：
 *
 *     链表至少包含两个节点。
 *     链表中所有节点的值都是唯一的。
 *     给定的节点为非末尾节点并且一定是链表中的一个有效节点。
 *     不要从你的函数中返回任何结果
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnarn7/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 **/
public class DeleteNode {


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    /**
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
     * 内存消耗：37.8 MB, 在所有 Java 提交中击败了81.53% 的用户
     *
     * 为啥不能直接给node = node.next
     * node = node.next只是把node指向了node.next指向的对象，
     * 改变的只是指针node的指向，不影响实际链表的结构。
     * 例如有链表[4,5,1,9]，node = 5。node=node.next。只是把node指向了1这个节点，但是4这个节点的next依旧指向了5，所以5这个要求被删除的节点并没有被覆盖或者删除。
     *
     * node 是一个变量名，代表对某个 ListNode 对象的【引用】，你可以把它想象成一个游标或者标签。
     * node = node.next 只是修改了变量名的指向，相当于把标签从 node 代表的初始对象上撕下，然后贴到 node.next 指向的对象上，
     * 这对链表结构不会产生任何影响，因此最终不会产生任何效果。
     *
     * 这个疑问是对引用类型的常见误解，
     * 引用类型的赋值操作不同于基本类型：基本类型赋值时通常会拷贝内存数据，但引用类型赋值只是简单地改变引用的指向，不涉及内存操作。
     * @param node
     */
    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;


    }

    public  void deleteNode1(ListNode node) {



    }

    public static void main(String[] args) {

    }
}
