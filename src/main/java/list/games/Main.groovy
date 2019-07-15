package list.games

/**
 * @author Evgeny Borisov
 */
class Main {
    public static void main(String[] args) {
        def list = [1, 2, 3]
        boolean disjoint = list.disjoint([4,5])
        println(disjoint)
    }
}
