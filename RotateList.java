
//////// PROPER SOLUTION //////////

//class Solution {
//    public ListNode rotateRight(ListNode head, int k) {
//        if(k==0 || head==null )
//            return head;
//        ListNode tail = head;
//        int length = 1;
//        while (tail.next != null) { //loop to count the length of the list
//            tail = tail.next;
//            length++;
//        }
//        k %= length; //counting the number of rotation
//        k=length-k;
//        tail.next = head; //getting a circular list
//        int count = 0;
//        while (count < k) { //loop to reach the desired node to detach
//            tail = tail.next;
//            count++;
//        }
//        head=tail.next; //new head
//        tail.next=null; //detach
//        return head;
//    }
//}
//
//
//
// MY OWN SOLUTION //

//class Solution {
//    public ListNode rotateRight(ListNode head, int k) {
//        if(k == 0 || head == null){
//            return head;
//        }
//        int length = 1;
//        ListNode last = head;
//        while(last != null && last.next != null){
//            length++;
//            last = last.next;
//        }
//        if(k == length){
//            return head;
//        }
//        if(k > length){
//            k = k - length;
//        }
//        last.next = head;
//        ListNode newLast = head;
//
//        for(int i = 1; i < length-k; i++){
//            newLast = newLast.next;
//        }
//        head = newLast.next;
//        newLast.next = null;
//        return head;
//    }
//}