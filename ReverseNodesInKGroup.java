//class Solution {
//    public static boolean check(ListNode node,int k) {
//        while(k>0){
//            if(node==null){
//                return true;
//            }
//            node=node.next;
//            k--;
//        }
//        return false;
//    }
//    public ListNode reverseKGroup(ListNode head, int k) {
//        if(k==0)return head;
//        ListNode ans=new ListNode(-1);
//        ListNode lasthead=ans;
//        while(head!=null){
//            ListNode pre=null;
//            ListNode curr=head;
//
//            if(check(head,k)){
//                lasthead.next=head;
//
//                return ans.next;
//
//            }
//            for(int i=0;i<k ;i++){
//
//
//                ListNode a=curr.next;
//
//                curr.next=pre;
//                pre=curr;
//                curr=a;
//
//            }
//
//            lasthead.next=pre;
//            lasthead=head;
//            head=curr;
//
//        }
//        return ans.next;
//    }
//}