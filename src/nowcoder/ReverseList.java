package nowcoder;

/**
 * 链表反转
 * <p>
 * 题目描述
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */

import nowcoder.common.ListNode;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode == null)
            return list;
        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {

    }
}

