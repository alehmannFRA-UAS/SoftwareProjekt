package edu.fra.uas.histogram;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Util {

    public static Map makeHistogram(Collection collection) {
        Map result = new HashMap();
        Iterator i = collection.iterator();
        while (i.hasNext()) {
            Object x = i.next();
            Integer count = (Integer) result.get(x);
            if (count == null) {
                result.put(x, Integer.valueOf(1));
            } else {
                result.put(x, Integer.valueOf(count.intValue() + 1));
            }
        }
        return result;
    }

}
