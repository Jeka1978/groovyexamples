package demo.working.with.files.examples

/**
 * @author Evgeny Borisov
 */
class Main {
    public static void main(String[] args) {
        def file = new File('data.txt')
        file.eachLine {
            println(it)
        }
//        for (f in file) {
//            println(f)
//        }
    }
}
