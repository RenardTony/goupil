package util.boole.check;

public class ConditionUtils<T> {

    /**
     * "Useless" constructor.
     */
    public ConditionUtils() {
        // This constructor exists only for JavaBean creation obligation.
        // Normally, this constructor should never be called.
    }

    public T defaultIfNull(T t, T defaultT) {
        return t == null ? defaultT : t;
    }
}
