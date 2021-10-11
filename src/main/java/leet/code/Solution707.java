package leet.code;

import com.sun.tools.javadoc.main.Messager;

import java.util.logging.Handler;

public class Solution707 {

}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }
}

class MyLinkedList {

    int size;
    ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode cur = head;
        for (int i = 0; i < index + 1; i++) {
            cur = cur.next;
        }
        return cur.val;
    }


    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {

        if (index > size) {
            return;
        }
        if(index < 0){
            index = 0;
        }
        ListNode pred = head;
        for (int i = 0; i < index + 1; i++) {
            pred = pred.next;
        }

        ListNode addNode = new ListNode(val);
        addNode.next = pred.next;
        pred.next = addNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }

        pred.next = pred.next.next;
        size--;


    }
}
