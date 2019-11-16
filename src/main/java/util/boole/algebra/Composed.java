package util.boole.algebra;

import util.boole.enums.Operation;

import java.util.ArrayList;
import java.util.List;

class Composed {
    private final List<Unary> values;

    private Composed(List<Unary> values) {
        this.values = values;
    }

    static Composed of(Unary value1, Unary value2) {
        Composed composed = new Composed(new ArrayList<>(2));
        composed.getValues().add(value1);
        composed.getValues().add(value2);
        return composed;
    }

    static NullableComposed of(Unary value1, Boolean value2) {
        return NullableComposed.of(value1, value2);
    }

    private List<Unary> getValues() {
        return values;
    }

    public boolean and() {
        return apply(Operation.AND);
    }

    public boolean nand() {
        return apply(Operation.NAND);
    }

    public boolean or() {
        return apply(Operation.OR);
    }

    public boolean nor() {
        return apply(Operation.NOR);
    }

    public boolean xor() {
        return apply(Operation.XOR);
    }

    public boolean xnor() {
        return apply(Operation.XNOR);
    }

    public boolean imp() {
        return apply(Operation.IMP);
    }

    public boolean inh() {
        return apply(Operation.INH);
    }

    private boolean apply(Operation operation) {
        boolean tamp = this.values.get(0).is();

        for (int i = 1 ; i < this.values.size() ; i++) {
            boolean next = this.values.get(i).is();
            tamp = Logic.apply(tamp, next, operation);
        }

        return tamp;
    }
}
