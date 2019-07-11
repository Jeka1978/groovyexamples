package demo

/**
 * @author Evgeny Borisov
 */
class ListUtilsG {
    static <T> int countDuplicates(List<T> list,T t, Closure<T> closure) {
    int counter=0;
    for (T t1 : list) {
        if (closure(t1,t)) {
            counter++;
        }
    }
    return counter;
}
}
