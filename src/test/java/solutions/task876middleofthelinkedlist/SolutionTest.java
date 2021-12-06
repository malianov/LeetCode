package solutions.task876middleofthelinkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task_876 : Middle of the Linked List")
class SolutionTest {

    @Nested
    @DisplayName("Test method: middleNode(ListNode head)")
    class Task876 {

        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            ListNode listNode_4 = new ListNode(5);
            ListNode listNode_3 = new ListNode(4, listNode_4);
            ListNode listNode_2 = new ListNode(3, listNode_3);
            ListNode listNode_1 = new ListNode(2, listNode_2);
            ListNode listNode_0 = new ListNode(1, listNode_1);

            int[] expected = {3,4,5};

            // when
            int[] result = solution.middleNode(head);

            // then
            assertArrayEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int[] nums = {-7,-3,2,3,11};
            int[] expected = {4,9,9,49,121};

            // when
            int[] result = solution.sortedSquares(nums);

            // then
            assertArrayEquals(expected, result);
        }
    }
}