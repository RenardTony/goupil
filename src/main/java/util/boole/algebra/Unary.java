package util.boole.algebra;

class Unary {

    private boolean value;

    private Unary(boolean value) {
        this.value = value;
    }

    static Unary of(boolean value) {
        return new Unary(value);
    }

    public Composed with(boolean value) {
        return Composed.of(this, Unary.of(value));
    }

    public NullableComposed with(Boolean value) {
        return Composed.of(this, value);
    }

    static NullableUnary of(Boolean value) {
        return new NullableUnary(value);
    }

    public boolean is() {
        return Logic.is(value);
    }

    public boolean not() {
        return Logic.not(value);
    }
}
