package problems.sort;

import problems.ListNode;

public class SwapNodesByK {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int k = 2;
        ListNode head = create();
        ListNode answer=null;
        
        ListNode current = head;
        while(traverse(current, k)!=null) {
            ListNode node = swapGroup(current, k); 
            if(answer==null) {
                answer=node;
                current=answer;
            }else {
                
            }
            current=traverse(current,k).next;
        }
        
        
        
        while(answer!=null) {
            System.out.println(answer.val);;
            answer=answer.next;
        }
    }
    
    public static ListNode swapGroup(ListNode head, int k) {
        
        ListNode newHead = traverse(head, k);
        ListNode end = newHead.next;
        
        ListNode holder = newHead;
        while(k>0) {
            k=k-1;
            holder.next=traverse(head, k);
            holder=holder.next;
        }
        holder.next=end;
        
        return newHead;
    }
    
    public static ListNode traverse(ListNode current, int k) {
        
        for(int x=0; x<k-1; x++) {
            if(current==null) {
                return null;
            }
            current = current.next;
        }
        return current;
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
