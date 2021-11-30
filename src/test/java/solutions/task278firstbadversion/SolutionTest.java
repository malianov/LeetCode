package solutions.task278firstbadversion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Task_278 : First Bad Version")
class SolutionTest {

    @Nested
    @DisplayName("Test method: firstBadVersion(int n)")
    class Task278 {

        public Solution solution;
        public VersionControl versionControl;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            int n = 5;
            int bad = 4;

            // when
            int result = solution.firstBadVersion(n, bad);
            int expected = 4;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int n = 1;
            int bad = 1;

            // when
            int result = solution.firstBadVersion(n, bad);
            int expected = 1;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            int n = 2;
            int bad = 2;

            // when
            int result = solution.firstBadVersion(n, bad);
            int expected = 2;

            // then
            assertEquals(expected, result);
        }
    }
}