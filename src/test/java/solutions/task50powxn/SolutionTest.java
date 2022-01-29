package solutions.task50powxn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Task_50 : Pow(x, n)")
class SolutionTest {

    @Nested
    @DisplayName("Test method: twoSum(int[] nums, int target")
    class Task_50 {
        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            double x = 2.00000;
            int n = 10;
            double expected = 1024.00000;

            // when
            double result = solution.myPow(x,n);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            double x = 2.10000;
            int n = 3;
            double expected = 9.26100;

            // when
            double result = solution.myPow(x,n);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            double x = 2.00000;
            int n = -2;
            double expected = 0.25000;

            // when
            System.out.println(1/x);
            double result = solution.myPow(x,n);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 4")
        @Test
        void test_4() {
            // prepare
            double x = 8.88023;
            int n = 3;
            double expected = 700.28148;

            // when
            System.out.println(1/x);
            double result = solution.myPow(x,n);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 5")
        @Test
        void test_5() {
            // prepare
            double x = 0.44528;
            int n = 0;
            double expected = 1.00000;

            // when
            System.out.println(1/x);
            double result = solution.myPow(x,n);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 6")
        @Test
        void test_6() {
            // prepare
            double x = 1.00000;
            int n = 2147483647;
            double expected = 1.00000;

            // when
            System.out.println(1/x);
            double result = solution.myPow(x,n);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 7")
        @Test
        void test_7() {
            // prepare
            double x = 42.38803;
            int n = 1;
            double expected = 42.38803;

            // when
            System.out.println(1/x);
            double result = solution.myPow(x,n);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 8")
        @Test
        void test_8() {
            // prepare
            double x = 2.00000;
            int n = -2147483648;
            double expected = 0.00000;

            // when
            System.out.println(1/x);
            double result = solution.myPow(x,n);

            // then
            assertEquals(expected, result);
        }
    }
}