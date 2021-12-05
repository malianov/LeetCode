package solutions.task167twosumIIinputarrayissorted;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Task_167 : Test Two Sum II Input Array is Sorted")
class SolutionTest {

    @Nested
    @DisplayName("Test method: twoSum(int[] numbers, int target)")
    class Task167 {

        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            int[] numbers = {2,7,11,15};
            int target = 9;
            int[] expected = {1,2};

            // when
            int[] result = solution.twoSum(numbers, target);

            // then
            assertTrue(Arrays.equals(result, expected));
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int[] numbers = {2,3,4};
            int target = 6;
            int[] expected = {1,3};

            // when
            int[] result = solution.twoSum(numbers, target);

            // then
            assertTrue(Arrays.equals(result, expected));
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            int[] numbers = {-1,0};
            int target = -1;
            int[] expected = {1,2};

            // when
            int[] result = solution.twoSum(numbers, target);

            // then
            assertTrue(Arrays.equals(result, expected));
        }
    }
}