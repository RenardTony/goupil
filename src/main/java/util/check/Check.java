package util.check;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Check<T> {

    /**
     * "Useless" constructor.
     */
    public Check() {
        // This constructor exists only for JavaBean creation obligation.
        // Normally, this constructor should never be called.
    }

    public static <T> T defaultIfNull(T t, T defaultT) {
        return t == null ? defaultT : t;
    }

    public static void notNull(Object object) {
        if (object == null) {
            throw new IllegalArgumentException("Object cannot be null.");
        }
    }

    public static void notEmpty(Collection collection) {
        notNull(collection);
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Collection cannot be empty.");
        }
    }

    public static void containsAtLeast(Collection collection, int elements) {
        notEmpty(collection);
        if (collection.size() >= elements) {
            throw new IllegalArgumentException(
                    String.format(
                            "Collection must contains at least %s elements but contains only %s.",
                            elements, collection.size()
                    )
            );
        }
    }

    public static boolean defaultIfNull(Boolean object, boolean primitive) {
        return object == null ? primitive : object.booleanValue();
    }
}
