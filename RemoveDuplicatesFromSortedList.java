class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        if(node == null){return head;}
        while(node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        } return head;
    }
}