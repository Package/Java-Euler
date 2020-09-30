import com.github.pkg.questions.*;
import com.github.pkg.solution.*;

public class Main {
    public Main() {
        final Solution solution = (Solution)new Question09();
        solution.test();
        System.out.println("Answer is: " + solution.solve());
    }

    public static void main(final String[] args) {
        new Main();
    }
}
