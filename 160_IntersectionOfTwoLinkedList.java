// There are two cases for such type of question either the two linked List are equal or unequal.
// Let's suppose it is unequal l1 = [1,2,3] l2 = [a,b,c,d] then
// a != 1 but 1 == b;
// if suppose l1 = [a1,a2,c1,c2,c3] and l2 = [b1,b2,b3,c1,c2,c3]
// return node at which two list itersect at c1 .
class Solution{
    public ListNode getIntersectionNode(ListNode headA , ListNode headB){
        
        int m = findLength(headA);
        int n = findLength(headB);

        ListNode fp = headA , sp = headB;

        if(m<n){
            for(int i = 0 ; i < n-m; i++){
                sp = sp.next;
            }
        }else if(n<m){
            for(int i = 0; i< m-n; i++){
                fp = fp.next;
            }
        }
        return findSameNode(fp,sp);
    }
    public int findLength(ListNode head){
        ListNode current = head;
        int length = 0;
        while(current != null){
            current = current.next;
            length++;
        }
        return length;
    }
    public ListNode findSameNode(ListNode fp, ListNode sp){
        while(fp != null && sp != null){
            if(fp == sp){
                return fp;
            }else{
                fp = fp.next;
                sp = sp.next;
            }
        }
        return null;
    }
}









