class Solution{
    public boolean isPalindrome(ListNode head){
        if(head == null || head.next == null){
            return true;
        }
        int n = findlength(head);
        int reversePoint = n/2;
        if(n%2 == 0){
            reversePoint = (n/2)+1;
        }
        ListNode prev = findkthNode(head, reversePoint);
        ListNode reversePointNode = findkthNode(head, reversePoint);
        
        ListNode head2 = reverse(prev, reversePointNode);
        ListNode first = head, second = head2;
        while(first != null && second != null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head, ListNode reversePointNode){
        ListNode first = reversePointNode, second = reversePointNode.next;
        while(first != null && second != null){
            ListNode temp = second.next;
            second.next = first;
            first = second;
            second  = temp;
        }
    }
    private ListNode findkthNode(ListNode head, int k){
        ListNode current = head;
        for(int cnt = 0 ; cnt <k && current != null; cnt++){
            current = current.next;
        }
        return current;
    }
    private inr  finnlength(ListNode head){
        int length = 0;
        ListNode current = head;
        while(current != null){
            length++;
            current = current.next;
        }
        return length;
    }
    private int findlength(ListNode head){
        int length = 0;
        ListNode current = head;
        while(current != null){
            length++;
            current = current.next;
        }        return length;
    }
}
