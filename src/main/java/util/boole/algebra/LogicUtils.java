package util.boole.algebra;

public final class LogicUtils {

    public LogicUtils() {
        // Constructor cannot be used.
    }

    public static Composed composed(boolean condition1, boolean condition2) {
        return new Composed(condition1, condition2);
    }

    public static Unary unary(boolean condition) {
        return new Unary(condition);
    }

    public static boolean yes(boolean condition) {
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
        return condition ? implication : true;
    }

    public static boolean inh(boolean inhibition, boolean implication) {
        return inhibition ? !implication : false;
    }

    public static class Unary {
        private boolean condition;

        private Unary(boolean condition) {
            this.condition = condition;
        }

        public boolean yes() {
            return LogicUtils.yes(condition);
        }

        public boolean not() {
            return LogicUtils.not(condition);
        }
    }

    public static class Composed {
        private boolean condition1;
        private boolean condition2;

        private Composed(boolean condition1, boolean condition2) {
            this.condition1 = condition1;
            this.condition2 = condition2;
        }

        public boolean and() {
            return LogicUtils.and(condition1, condition2);
        }

        public boolean nand() {
            return LogicUtils.nand(condition1, condition2);
        }

        public boolean or() {
            return LogicUtils.or(condition1, condition2);
        }

        public boolean nor() {
            return LogicUtils.nor(condition1, condition2);
        }

        public boolean xor() {
            return LogicUtils.xor(condition1, condition2);
        }

        public boolean xnor() {
            return LogicUtils.xnor(condition1, condition2);
        }

        public boolean imp() {
            return LogicUtils.imp(condition1, condition2);
        }

        public boolean inh() {
            return LogicUtils.inh(condition1, condition2);
        }
    }
}
