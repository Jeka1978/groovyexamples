package duck_typing

/**
 * @author Evgeny Borisov
 */
class Main {
    public static void main(String[] args) {

        def spiderMan = new SpiderMan()
        spiderMan = spiderMan++
        spiderMan++
        println(spiderMan.getNumber())
    }
}
