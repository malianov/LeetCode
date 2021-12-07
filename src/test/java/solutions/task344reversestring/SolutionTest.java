package solutions.task344reversestring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task_344 : Reverse String")
class SolutionTest {

    @Nested
    @DisplayName("Test method: reverseString(char[] s)")
    class Task344 {

        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            char[] s = {'H','a','n','n','a','h'};

            // when
            solution.reverseString(s);
            char[] expected = {'h','a','n','n','a','H'};

            // then
            assertArrayEquals(expected, s);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            char[] s = {'H','a','n','n','a','h'};

            // when
            solution.reverseString(s);
            char[] expected = {'h','a','n','n','a','H'};

            // then
            assertArrayEquals(expected, s);
        }
    }
}