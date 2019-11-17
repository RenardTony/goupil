package util.check.pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class PatternUtils {

    private final static Map<Object, Pattern> PATTERNS = new HashMap<>();

    public static void addPattern(Object key, String pattern) {
        PATTERNS.put(key, Pattern.compile(pattern));
    }

    public static boolean check(String toCheck, Object pattern) {
        return PATTERNS.get(pattern).matcher(toCheck).matches();
    }

    public static boolean check(String toCheck, String pattern) {
        return Pattern.compile(pattern).matcher(toCheck).matches();
    }

    public static PatternGroup generate() {
        return new PatternGroup();
    }
}
