package duck_typing

/**
 * @author Evgeny Borisov
 */
class AnimalDoctor {
    void treat(Animal animal) {
        animal.breathe()
        animal.makeVoice()
    }
}
