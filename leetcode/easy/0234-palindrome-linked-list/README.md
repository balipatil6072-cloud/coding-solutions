# Palindrome Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `head` of a singly linked list, return `true` *if it is a  **palindrome**  or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: head = [1,2,2,1]
Output: true

```

 **Example 2:** 

```
Input: head = [1,2]
Output: false

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [1, 105].
- 0 <= Node.val <= 9

 

 **Follow up:**  Could you do it in `O(n)` time and `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 99.83%)  
**Memory:** 94.3 MB (beats 66.41%)  
**Submitted:** 2026-10-01T18:06:40.059Z  

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null && head.next==null) return true;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev=null;
        while(slow!=null){
            ListNode next= slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        ListNode right=head;
        ListNode left=prev;
        while(left!=null){
            if(left.val!=right.val) return false;
            left = left.next;
            right=right.next;
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindrome-linked-list/)