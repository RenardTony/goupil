package util.boole.algebra;

public class Boole {

    public static Unary of(boolean value) {
        return Unary.of(value);
    }

    public static NullableUnary of(Boolean value) {
        return Unary.of(value);
    }
}
