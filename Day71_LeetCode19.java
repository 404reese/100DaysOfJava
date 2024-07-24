class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if (head == nullptr) {
            return nullptr;
        }
        ListNode* fast = head;
        ListNode* slow = head;

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast == nullptr) {
                return head; // n is larger than the length of the list
            }
            fast = fast->next;
        }

        // If fast pointer is null, it means n is equal to the length of the list
        if (fast == nullptr) {
            return head->next;
        }

        // Move both pointers until fast pointer reaches the end
        while (fast->next != nullptr) {
            fast = fast->next;
            slow = slow->next;
        }

        // Remove the nth node from the end
        slow->next = slow->next->next;
        return head;
    }
};
