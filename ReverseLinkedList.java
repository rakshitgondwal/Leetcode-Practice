//class Solution {
//    public ListNode reverseList(ListNode head) {
//        if(getSize(head) < 2){
//            return head;
//        }
//        ListNode prev = null;
//        ListNode pres = head;
//        ListNode prec = pres.next;
//
//        while(pres != null){
//            pres.next = prev;
//            prev = pres;
//            pres = prec;
//            if(prec != null){
//                prec = prec.next;
//            }
//        }
//        return prev;
//    }
//
//    public int getSize(ListNode head){
//        int size = 0;
//        while(head!= null){
//            size++;
//            head = head.next;
//        }
//        return size;
//    }
//}