import com.github.pkg.questions.*;

public class Main {

    public Main() {
        var solution = new Question11();
        solution.test();
        System.out.println("Answer is: " + solution.solve());
    }

    public static void main(final String[] args) {
        new Main();
    }
}
