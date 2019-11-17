package util.check;

import java.util.function.Function;

public class Get {

    public static <A, B> B it(A base,
                              Function<A, B> function) {
        return base == null ? null : function.apply(base);
    }

    public static <A, B, C> C it(A base,
                                 Function<A, B> function1,
                                 Function<B, C> function2) {
        return it(it(base, function1), function2);
    }

    public static <A, B, C, D> D it(A base,
                                    Function<A, B> function1,
                                    Function<B, C> function2,
                                    Function<C, D> function3) {
        return it(it(base, function1, function2), function3);
    }

    public static <A, B, C, D, E> E it(A base,
                                       Function<A, B> function1,
                                       Function<B, C> function2,
                                       Function<C, D> function3,
                                       Function<D, E> function4) {
        return it(it(base, function1, function2, function3), function4);
    }

    public static <A, B, C, D, E, F> F it(A base,
                                          Function<A, B> function1,
                                          Function<B, C> function2,
                                          Function<C, D> function3,
                                          Function<D, E> function4,
                                          Function<E, F> function5) {
        return it(it(base, function1, function2, function3, function4), function5);
    }

    public static <A, B, C, D, E, F, G> G it(A base,
                                             Function<A, B> function1,
                                             Function<B, C> function2,
                                             Function<C, D> function3,
                                             Function<D, E> function4,
                                             Function<E, F> function5,
                                             Function<F, G> function6) {
        return it(it(base, function1, function2, function3, function4, function5), function6);
    }

    public static <A, B> B or(A base,
                              B orElse,
                              Function<A, B> function) {
        return Check.defaultIfNull(it(base, function), orElse);
    }

    public static <A, B, C> C or(A base,
                                 C orElse,
                                 Function<A, B> function1,
                                 Function<B, C> function2) {
        return Check.defaultIfNull(it(base, function1, function2), orElse);
    }

    public static <A, B, C, D> D or(A base,
                                    D orElse,
                                    Function<A, B> function1,
                                    Function<B, C> function2,
                                    Function<C, D> function3) {
        return Check.defaultIfNull(it(base, function1, function2, function3), orElse);
    }

    public static <A, B, C, D, E> E or(A base,
                                       E orElse,
                                       Function<A, B> function1,
                                       Function<B, C> function2,
                                       Function<C, D> function3,
                                       Function<D, E> function4) {
        return Check.defaultIfNull(it(base, function1, function2, function3, function4), orElse);
    }

    public static <A, B, C, D, E, F> F or(A base,
                                          F orElse,
                                          Function<A, B> function1,
                                          Function<B, C> function2,
                                          Function<C, D> function3,
                                          Function<D, E> function4,
                                          Function<E, F> function5) {
        return Check.defaultIfNull(it(base, function1, function2, function3, function4, function5), orElse);

    }
}
