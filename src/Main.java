import com.github.pkg.questions.*;
import com.github.pkg.solution.*;
import com.github.pkg.utilities.primes.Primes;

public class Main {
    public Main() {
        final Solution solution = (Solution)new Question04();
        System.out.println("Answer is: " + solution.solve());
    }

    private void primeTest() {
        System.out.println(Primes.isPrime(191)); // true
        System.out.println(Primes.isPrime(2)); // true
        System.out.println(Primes.isPrime(1)); // false
        System.out.println(Primes.isPrime(200)); // false
        System.out.println(Primes.isPrime(185)); // false
    }

    public static void main(final String[] args) {
        new Main();
    }
}
