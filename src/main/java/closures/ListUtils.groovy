package closures

/**
 * @author Evgeny Borisov
 *
 */
class ListUtils {
    static <T>  void forEachWithDelay(List<T> list,int delay, Closure<T> closure) {

       list.each {
           closure(it)
           Thread.sleep(delay)
       }
    }

    public static void main(String[] args) {
        def integers = [1, 2, 3, 4]
        forEachWithDelay(integers,500,{println('123')})
    }
}
