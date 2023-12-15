package BookJavaChallanges;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Exercise2_1_3 {
    public static void main(String[] args) {
        var primes = new ArrayList<>();

        for (int i = 2; i < 25; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        System.out.println(primes);

        System.out.println(isPrimeByEratosthenes(25));
    }

    static boolean isPrime(final int potentiallyPrime) {
        // check for all relevant numbers if they represent a divisor
        for (int i = 2; i <= potentiallyPrime / 2; i++) {
            if (potentiallyPrime % i == 0) {
                return false;
            }
        }
        return true;
    }

    static List<Integer> isPrimeByEratosthenes(final int limit) {
        boolean[] isPrime = new boolean[limit + 1];

        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= limit; p++) {
            if (isPrime(p)) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        return IntStream.rangeClosed(2, limit)
                .filter(i -> isPrime(i))
                .boxed()
                .toList();
    }
}
