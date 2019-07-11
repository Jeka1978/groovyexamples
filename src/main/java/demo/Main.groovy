package demo

/**
 * @author Evgeny Borisov
 */
class Main {
    public static void main(String[] args) {

        IntRange range = 1..10

        Range<BigDecimal> decimals = 1.1..10.9

        decimals.each {println(it)}




    }
}
