package demo;

/**
 * @author Evgeny Borisov
 */
public class Start {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int answer = calculator.plus(2, 3);
        System.out.println(answer);
    }
}
