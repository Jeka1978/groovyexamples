package lab1

import groovy.transform.Canonical

/**
 * @author Evgeny Borisov
 */
@Canonical
class Human {
    List<String> names = []
    static Random random = new Random()

    void addName(String name) {
        names.add(name)
    }

    boolean asBoolean() {
        names
    }

    boolean isCase(Human human) {
        names.any{ human.names.contains(it) }
    }

    Iterator<String> iterator(){
        return names.iterator()
    }

    String getRandomName() {

        def i = random.nextInt(names.size())
        return names[i]
    }


    @Override
    public String toString() {
        return "Human{" +
                "names=" + names +
                '}';
    }
}
