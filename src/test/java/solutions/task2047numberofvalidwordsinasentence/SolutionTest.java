package solutions.task2047numberofvalidwordsinasentence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task 2047 : Number of Valid Words in a Sentence")
class SolutionTest {

    @Nested
    @DisplayName("Test method: countValidWords(String sentence)")
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
            String string = "cat and  dog";

            // when
            int result = solution.countValidWords(string);
            int expected = 3;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            String string = "!this  1-s b8d!";

            // when
            int result = solution.countValidWords(string);
            int expected = 0;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            String string = "alice and  bob are playing stone-game10";

            // when
            int result = solution.countValidWords(string);
            int expected = 5;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 4")
        @Test
        void test_4() {
            // prepare
            String string = "!";

            // when
            int result = solution.countValidWords(string);
            int expected = 1;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 5")
        @Test
        void test_5() {
            // prepare
            String string = "a";

            // when
            int result = solution.countValidWords(string);
            int expected = 1;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 6")
        @Test
        void test_6() {
            // prepare
            String string = "a-b-c";

            // when
            int result = solution.countValidWords(string);
            int expected = 0;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 7")
        @Test
        void test_7() {
            // prepare
            String string = "he bought 2 pencils, 3 erasers, and 1  pencil-sharpener.";

            // when
            int result = solution.countValidWords(string);
            int expected = 6;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 8")
        @Test
        void test_8() {
            // prepare
            String string = " o6 t";

            // when
            int result = solution.countValidWords(string);
            int expected = 1;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 9")
        @Test
        void test_9() {
            // prepare
            String string = " 62   nvtk0wr4f  8 qt3r! w1ph 1l ,e0d 0n 2v 7c.  n06huu2n9 s9   ui4 nsr!d7olr  q-, vqdo!btpmtmui.bb83lf g .!v9-lg 2fyoykex uy5a 8v whvu8 .y sc5 -0n4 zo pfgju 5u 4 3x,3!wl  fv4   s  aig cf j1 a i  8m5o1  !u n!.1tz87d3 .9    n a3  .xb1p9f  b1i a j8s2 cugf l494cx1! hisceovf3 8d93 sg 4r.f1z9w   4- cb r97jo hln3s h2 o .  8dx08as7l!mcmc isa49afk i1 fk,s e !1 ln rt2vhu 4ks4zq c w  o- 6  5!.n8ten0 6mk 2k2y3e335,yj  h p3 5 -0  5g1c  tr49, ,qp9 -v p  7p4v110926wwr h x wklq u zo 16. !8  u63n0c l3 yckifu 1cgz t.i   lh w xa l,jt   hpi ng-gvtk8 9 j u9qfcd!2  kyu42v dmv.cst6i5fo rxhw4wvp2 1 okc8!  z aribcam0  cp-zp,!e x  agj-gb3 !om3934 k vnuo056h g7 t-6j! 8w8fncebuj-lq    inzqhw v39,  f e 9. 50 , ru3r  mbuab  6  wz dw79.av2xp . gbmy gc s6pi pra4fo9fwq k   j-ppy -3vpf   o k4hy3 -!..5s ,2 k5 j p38dtd   !i   b!fgj,nx qgif ";

            // when
            int result = solution.countValidWords(string);
            int expected = 49;

            // then
            assertEquals(expected, result);
        }
    }
}