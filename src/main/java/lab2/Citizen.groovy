package lab2

import groovy.transform.Canonical

/**
 * @author Evgeny Borisov
 */
@Canonical
class Citizen {
    Address homeAddress
    int age

    void setAge(int age) {
        println('check if age is valid')
        this.age = age
    }

    int getAge() {
        println('security check')
        return age
    }
}
