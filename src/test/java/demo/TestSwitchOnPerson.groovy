package demo

import org.junit.Assert
import org.junit.Test

/**
 * @author Evgeny Borisov
 */
class TestSwitchOnPerson {

    @Test
    public void switchShouldUseAge() {



        def person1 = new Person(age: 10)
        def person2 = new Person(age: 20)
        def person3 = new Person(age: 30)
        def person4 = new Person(age: 40)
        int choice=0
        def person = new Person(age: 20,name: 'Miryam',salary: 25)
        switch (person) {
            case person1:
                choice=1
                break
            case person2:
                choice=2
                break
            case person3:
                choice = 3
                break
            case person4:
                choice=4
        }
        Assert.assertEquals(2,choice)
    }
}
