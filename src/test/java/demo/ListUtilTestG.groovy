package demo

import org.junit.Test

/**
 * @author Evgeny Borisov
 */
class ListUtilTestG {
    @Test
    public void testGroovy() {
        List<String> list =['groovy','Groovy','groOVy','java']
        ListUtilsG.countDuplicates(list,'groovy'){}
    }
}
