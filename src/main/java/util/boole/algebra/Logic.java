package util.boole.algebra;

import util.boole.algebra.enums.Operation;

public final class Logic {

    public Logic() {
        // Constructor cannot be used.
    }

    public static boolean is(boolean condition) {
        return condition;
    }

    public static boolean not(boolean condition) {
        return !condition;
    }

    public static boolean and(boolean condition1, boolean condition2) {
        return condition1 && condition2;
    }

    public static boolean nand(boolean condition1, boolean condition2) {
        return !(condition1 && condition2);
    }

    public static boolean or(boolean condition1, boolean condition2) {
        return condition1 || condition2;
    }

    public static boolean nor(boolean condition1, boolean condition2) {
        return !(condition1 || condition2);
    }

    public static boolean xor(boolean condition1, boolean condition2) {
        return condition1 ^ condition2;
    }

    public static boolean xnor(boolean condition1, boolean condition2) {
        return condition1 == condition2;
    }

    public static boolean imp(boolean condition, boolean implication) {
        return !condition || implication;
    }

    public static boolean inh(boolean inhibition, boolean implication) {
        return inhibition && !implication;
    }

    public static boolean apply(boolean left, boolean right, Operation operation) {
        switch (operation) {
            case AND : return and(left, right);
            case NAND : return nand(left, right);
            case OR : return or(left, right);
            case NOR : return nor(left, right);
            case XOR : return xor(left, right);
            case XNOR : return xnor(left, right);
            case IMP : return imp(left, right);
            case INH : return inh(left, right);
        }
        throw new IllegalStateException("Operation must be correctly filled.");
    }
}
