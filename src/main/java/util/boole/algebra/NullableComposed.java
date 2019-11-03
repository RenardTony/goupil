package util.boole.algebra;

import util.check.Check;

public class NullableComposed {

    private final Boolean nullable;
    private final Unary unary;

    private NullableComposed(final Unary unary, Boolean value) {
        this.unary = unary;
        this.nullable = value;
    }

    static NullableComposed of(final Unary unary, Boolean nullable) {
        return new NullableComposed(unary, nullable);
    }

    public Composed trueIfNull() {
        return Composed.of(unary, Unary.of(Check.defaultIfNull(this.nullable, true)));
    }

    public Composed tin() {
        return trueIfNull();
    }

    public Composed falseIfNull() {
        return Composed.of(unary, Unary.of(Check.defaultIfNull(this.nullable, false)));
    }

    public Composed fin() {
        return falseIfNull();
    }
}
