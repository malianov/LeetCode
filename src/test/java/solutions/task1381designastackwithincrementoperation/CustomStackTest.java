package solutions.task1381designastackwithincrementoperation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task_1381 : Design a Stack With Increment Operation")
class CustomStackTest {
    @Nested
    @DisplayName("The Stack Test")
    class Task1381 {
        public CustomStack customStack;

        @DisplayName("Test method: constructor(int x)")
        @Test
        void test_1() {
            // prepare
            int maxSize = 4;
            int expectedMaxSize = 4;

            // when
            customStack = new CustomStack(4);
            int resultMaxSize = customStack.getMaxSize();

            // then
            assertEquals(expectedMaxSize, resultMaxSize);
        }

        @DisplayName("Test method: void push(int x)")
        @Test
        void test_2() {
            // prepare
            int value = 1;
            int expectedSize = 1;
            customStack = new CustomStack(4);

            // when
            customStack.push(value);
            int resultSize = customStack.getSize();

            // then
            assertEquals(expectedSize, resultSize);
        }

        @DisplayName("Test method: void multiple push(int x)")
        @Test
        void test_3() {
            // prepare
            int value_1 = 1;
            int value_2 = 2;
            int value_3 = 3;
            int value_4 = 4;
            int value_5 = 5;
            int value_6 = 6;
            int expectedSize = 4;
            customStack = new CustomStack(4);

            // when
            customStack.push(value_1);
            customStack.push(value_2);
            customStack.push(value_3);
            customStack.push(value_4);
            customStack.push(value_5);
            customStack.push(value_6);
            int resultSize = customStack.getSize();

            // then
            assertEquals(expectedSize, resultSize);
        }

        @DisplayName("Test method: void pop()")
        @Test
        void test_4() {
            // prepare
            int value = 1;
            int expectedSize = 0;
            customStack = new CustomStack(4);

            // when
            customStack.push(value);
            customStack.pop();
            int resultSize = customStack.getSize();

            // then
            assertEquals(expectedSize, resultSize);
        }

        @DisplayName("Test method: void increment(int k, int val) ")
        @Test
        void test_5() {
            // prepare
            customStack = new CustomStack(4);

            int value_1 = 1;
            int value_2 = 2;
            int value_3 = 3;
            int value_4 = 4;
            int value_5 = 5;
            int value_6 = 6;
            int expectedSize = 0;
            int resultSize = customStack.getSize();

            // when
            customStack.push(value_1);
            customStack.push(value_2);
            customStack.push(value_3);
            customStack.push(value_4);
            customStack.push(value_5);
            customStack.push(value_6);

            // then
            assertEquals(expectedSize, resultSize);
        }

        @DisplayName("Test method: void pop()")
        @Test
        void test_6() {
            // prepare
            customStack = new CustomStack(3);
            customStack.push(1);
            customStack.push(2);
            customStack.pop();
            customStack.push(2);
            customStack.push(3);
            customStack.push(4);
            customStack.increment(5,100);
            customStack.increment(2,100);

            // when
            int resValue_1 = customStack.pop();
            int resValue_2 = customStack.pop();
            int resValue_3 = customStack.pop();
            int resValue_4 = customStack.pop();

            int expected_1 = 103;
            int expected_2 = 202;
            int expected_3 = 201;
            int expected_4 = -1;

            // then
            assertEquals(expected_1, resValue_1);
            assertEquals(expected_2, resValue_2);
            assertEquals(expected_3, resValue_3);
            assertEquals(expected_4, resValue_4);
        }
    }
}