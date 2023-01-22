//class Solution {
//    public boolean isPalindrome(ListNode head) {
//        if(head.next == null) return true;
//        //get mid.
//        ListNode fs = head;
//        ListNode sl = head;
//        while(fs != null && fs.next != null){
//            fs = fs.next.next;
//            sl = sl.next;
//        }
//        if(fs != null){
//            sl = sl.next;
//        }
//        //reverse first half.
//        ListNode cur = head;
//        ListNode prev = null;
//        while(true){
//            cur = head.next;
//            head.next = prev;
//            prev = head;
//            head = cur;
//            if(fs == null && cur == sl){
//                break;
//            }
//            if(fs != null && cur.next == sl){
//                break;
//            }
//        }
//        //compare hirst revresed and second half.
//        while(sl != null){
//            //System.out.println(sl.val+" "+prev.val);
//            if(sl.val != prev.val) return false;
//            sl = sl.next;
////            prev = prev.next;
//        }
//        return true;
//    }
//}