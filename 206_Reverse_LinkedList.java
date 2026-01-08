// let's suppose 1 , 2 , 3 ;
// reverse(1);
//    reverse(2);
//      reverse(3);
// At node (3)
// if(node.next == null)
//      newhead = node;
//      return node;
// ----->> from here recurssion start returning
// Back to node = 2
// we have last = 3 , node = 2
// last.next = node; (3.next = 2)
// return node 
// back to node = 1
// last = 2 , node = 1; 
// last.next = node;
// return node; (3 --> 2 --> 1 )
// finish in ReverseList 
// last = 1 , last.next = null;
// return newhead;



class Solution {

    private ListNode newhead;

    public ListNode reverseList(ListNode head){
        if(head == null) return null;
        ListNode last = reverse(head);
        last.next = null;
        return newhead;
    }
    public ListNode reverse(ListNode node){
        if(node == null) return null;
        if(node.next = null){
            newhead = node;
            return node;
        }else{
            ListNode last = reverse(node.next);
            last.next = node;
            return node;
        }
    }

}
