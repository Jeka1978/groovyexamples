package demo

import groovy.transform.Canonical
import groovy.transform.Immutable

/**
 * @author Evgeny Borisov
 */
@Canonical
class Person  {
    String name
    int age
    int salary

    boolean isCase(Person person) {
        return person.age==this.age
    }
    boolean asBoolean() {


        age<120
    }


}
