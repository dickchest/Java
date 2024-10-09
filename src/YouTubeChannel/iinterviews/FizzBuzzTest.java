package YouTubeChannel.iinterviews;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void test1() {
        Assertions.assertArrayEquals("fizz".getBytes(), fizzBuzz.fizzbuzztest(3));
    }

    @Test
    void test2() {
        Assertions.assertArrayEquals("buzz".getBytes(), fizzBuzz.fizzbuzztest(5));
    }

    @Test
    void test3() {
        Assertions.assertArrayEquals("fizzbuzz".getBytes(), fizzBuzz.fizzbuzztest(15));
    }

    @Test
    void test4() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> fizzBuzz.fizzbuzztest(1));
    }
}