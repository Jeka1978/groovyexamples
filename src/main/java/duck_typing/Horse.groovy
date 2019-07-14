package duck_typing

/**
 * @author Evgeny Borisov
 */
class Horse implements Animal {
    @Override
    void makeVoice() {
        println('igo igo')
    }

    @Override
    void breathe() {
        println('rh hr')
    }
}
