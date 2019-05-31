package problems.sort;

import problems.ListNode;

public class SwapNodesInPairs {

    public static void main(String[] args) {

        ListNode head = create();
        
        ListNode answer = null;
        
        answer = swap(head); 
        
        ListNode current = answer.next;
        while(current.next!=null && current.next.next!=null) {
            current.next = swap(current.next);
            current=current.next.next;
        }
        
        while(answer!=null) {
            System.out.println(answer.val);
            answer=answer.next;
        }
    }

    public static ListNode swap(ListNode head){
        
        ListNode holder = head.next;
        head.next=holder.next;
        holder.next=head;
        return holder;
        
    }
    
    public static ListNode create() {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);
        return head;
    }
}
