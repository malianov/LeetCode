package solutions.task1137nthtribonaccinumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task_1137 : N-th Tribonacci Number")
class SolutionTest {

    @Nested
    @DisplayName("Test method: tribonacci(int n)")
    class Task1137 {

        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            int n = 4;
            int expected = 4;

            // when
            int result = solution.tribonacci(n);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int n = 25;
            int expected = 1389537;

            // when
            int result = solution.tribonacci(n);

            // then
            assertEquals(expected, result);
        }
/*
        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            int n = 4;
            int expected = 3;

            // when
            int result = solution.fib(n);

            // then
            assertEquals(expected, result);
        }*/
    }
}