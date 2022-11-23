package leet.code.interview;


import java.util.HashSet;

public class Solution0207 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> visited = new HashSet<>();
        ListNode temp = headA;
        while (temp != null){
            visited.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null){
            if(visited.contains(temp)){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}
