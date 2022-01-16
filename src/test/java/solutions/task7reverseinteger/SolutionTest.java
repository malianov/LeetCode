package solutions.task7reverseinteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task_7 : Reverse Integer")
class SolutionTest {

    @Nested
    @DisplayName("Test method: reverse(int x)")
    class Task7 {

        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            int x = 123;

            // when
            int actual = solution.reverse(x);
            int expected = 321;

            // then
            assertEquals(expected,actual);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int x = -123;

            // when
            int actual = solution.reverse(x);
            int expected = -321;

            // then
            assertEquals(expected,actual);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            int x = 120;

            // when
            int actual = solution.reverse(x);
            int expected = 21;

            // then
            assertEquals(expected,actual);
        }

        @DisplayName("Test 4")
        @Test
        void test_4() {
            // prepare
            int x = 1534236469;

            // when
            int actual = solution.reverse(x);
            int expected = 0;

            // then
            assertEquals(expected,actual);
        }
    }
}