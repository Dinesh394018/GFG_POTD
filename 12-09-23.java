class Solution {
    static int isPerfectNumber(long N) {
        // code here
       if (N == 1) {
            return 0;
        }

        // Initialize a variable to store the sum of divisors
        long sumOfDivisors = 1;

        // Iterate from 2 to sqrt(N) to find divisors
        for (long i = 2; i * i <= N; i++) {
            // Check if i is a divisor of N
            if (N % i == 0) {
                // If i is equal to N/i, add it only once
                if (i == (N / i)) {
                    sumOfDivisors += i;
                } else {
                    // Add both divisors i and N/i
                    sumOfDivisors += (i + N / i);
                }
            }
        }

        // Check if the sum of divisors is equal to N
        if (sumOfDivisors == N) {
            // N is a perfect number
            return 1;
        } else {
            // N is not a perfect number
            return 0;
        }
    }
}