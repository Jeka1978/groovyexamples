package demo

import org.junit.Test
import org.testng.Assert

/**
 * @author Evgeny Borisov
 */
class PersonTest {

    Person defaultPerson = new Person(age: 20, name: 'Moshe', salary: 10)


    @Test
    public void stam(Person person) {

        Person p1
        p1 = person ?: defaultPerson



    }

    @Test
    void ifWorksOnPerson() {


        String answer = ''
        def person = new Person(age: 100)
        if (person) {
            answer = 'alive'
        }
        Assert.assertEquals('alive', answer)

    }

    @Test
    void ifWorksOnPerson2() {
        String answer = ''
        def person = new Person(age: 200)
        if (person) {
            answer = 'alive'
        }
        Assert.assertEquals('', answer)

    }
}
