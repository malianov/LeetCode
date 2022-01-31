package solutions.task387firstuniquecharacterinastring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task 387. First Unique Character in a String")
class SolutionTest {

    @Nested
    @DisplayName("Test method: firstUniqChar(String s)")
    class Task_1 {
        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            String s = "leetcode";
            int expected = 0;


            // when
            int result = solution.firstUniqChar(s);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            String s = "loveleetcode";
            int expected = 2;


            // when
            int result = solution.firstUniqChar(s);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            String s = "aabb";
            int expected = -1;


            // when
            int result = solution.firstUniqChar(s);

            // then
            assertEquals(expected, result);
        }
    }
}