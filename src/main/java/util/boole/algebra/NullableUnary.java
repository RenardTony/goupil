package util.boole.algebra;

import util.check.Check;

public class NullableUnary {

    private final Boolean nullable;

    NullableUnary(Boolean value) {
        this.nullable = value;
    }

    static NullableUnary of(Boolean value) {
        return new NullableUnary(value);
    }

    public Unary trueIfNull() {
        return Unary.of(Check.defaultIfNull(nullable, true));
    }

    public Unary tin() {
        return trueIfNull();
    }

    public Unary falseIfNull() {
        return Unary.of(Check.defaultIfNull(nullable, false));
    }

    public Unary fin() {
        return falseIfNull();
    }
}
