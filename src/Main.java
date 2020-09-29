import com.github.pkg.questions.*;
import com.github.pkg.solution.*;
import com.github.pkg.utilities.primes.Primes;

public class Main {
    public Main() {
        final Solution solution = (Solution)new Question04();
        System.out.println("Answer is: " + solution.solve());
    }

    public static void main(final String[] args) {
        new Main();
    }
}
