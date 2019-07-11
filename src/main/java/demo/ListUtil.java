package demo;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ListUtil {



    public static <T> int countDuplicates(List<T> list, T t,Equalator<T> equalator) {
        int counter=0;
        for (T t1 : list) {
            if (equalator.myEquals(t1,t)) {
                counter++;
            }
        }
        return counter;
    }
}
