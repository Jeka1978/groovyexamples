package closures

/**
 * @author Evgeny Borisov
 */
class Main {
    public static void main(String[] args) {
        def random = new Random()

        def start = System.nanoTime()
        (1..1_000_000).each {random.nextInt(100)}

        def end = System.nanoTime()
        println ((end-start)/1_000_000)
    }
}
