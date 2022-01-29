package solutions.task58lengthoflastword;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Task_58 : Length of Last Word")
class SolutionTest {

    @Nested
    @DisplayName("Test method: lengthOfLastWord(String s)")
    class Task_58 {
        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            String s = "Hello World";
            int expected = 5;

            // when
            int size = solution.lengthOfLastWord(s);

            // then
            assertEquals(expected, size);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            String s = "   fly me   to   the moon  ";
            int expected = 4;

            // when
            int size = solution.lengthOfLastWord(s);

            // then
            assertEquals(expected, size);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            String s = "luffy is still joyboy";
            int expected = 6;

            // when
            int size = solution.lengthOfLastWord(s);

            // then
            assertEquals(expected, size);
        }
    }
}