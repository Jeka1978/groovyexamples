package closures

/**
 * @author Evgeny Borisov
 */
class BenchmarkUtil {
    static double benchmark(Closure closure) {
        def start = System.nanoTime()
        1_000_000.times {
            closure()
        }
        def end = System.nanoTime()
        return ((end-start)/1_000_000)
    }

    public static void main(String[] args) {
        def random = new Random()
        def time = benchmark { println(123) }
        println(time)
    }
}
