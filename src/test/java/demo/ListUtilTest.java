package demo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ListUtilTest {

    @Test
    public void countDuplicates() {
        List<String> list = Arrays.asList("java", "Java", "Groovy", "GROOVY", "GrOovY");
        StringIgnoreCaseEqualtor equaltor = new StringIgnoreCaseEqualtor();
        int total = ListUtil.countDuplicates(list, "groovy",equaltor);
        Assert.assertEquals(3,total);
    }
}