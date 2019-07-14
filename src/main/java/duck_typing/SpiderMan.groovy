package duck_typing

/**
 * @author Evgeny Borisov
 */
class SpiderMan {

    List<Integer> numbers = [1,2,3]

    int index=0

    SpiderMan next() {
        return new SpiderMan(index:index++)

    }




    int getNumber() {
        numbers[index]
    }

    void saveTheWorld(){
        println("I saved the world")
    }

    void breathe() {
        println('hhhhhhhhhhhhhuu')
    }
}
