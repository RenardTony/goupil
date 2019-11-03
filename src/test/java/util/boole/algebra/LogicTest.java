package util.boole.algebra;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class LogicTest {

    @Test
    public void yes_test() {
        assertTrue(Logic.is(true));
        assertFalse(Logic.is(false));
    }

    @Test
    public void not_test() {
        assertTrue(Logic.not(false));
        assertFalse(Logic.not(true));
    }

    @Test
    public void and_test() {
        assertTrue(Logic.and(true, true));
        assertFalse(Logic.and(true, false));
        assertFalse(Logic.and(false, true));
        assertFalse(Logic.and(false, false));
    }

    @Test
    public void nand_test() {
        assertFalse(Logic.nand(true, true));
        assertTrue(Logic.nand(true, false));
        assertTrue(Logic.nand(false, true));
        assertTrue(Logic.nand(false, false));
    }

    @Test
    public void or_test() {
        assertTrue(Logic.or(true, true));
        assertTrue(Logic.or(true, false));
        assertTrue(Logic.or(false, true));
        assertFalse(Logic.or(false, false));
    }

    @Test
    public void nor_test() {
        assertFalse(Logic.nor(true, true));
        assertFalse(Logic.nor(true, false));
        assertFalse(Logic.nor(false, true));
        assertTrue(Logic.nor(false, false));
    }

    @Test
    public void xor_test() {
        assertFalse(Logic.xor(true, true));
        assertTrue(Logic.xor(true, false));
        assertTrue(Logic.xor(false, true));
        assertFalse(Logic.xor(false, false));
    }

    @Test
    public void xnor_test() {
        assertTrue(Logic.xnor(true, true));
        assertFalse(Logic.xnor(true, false));
        assertFalse(Logic.xnor(false, true));
        assertTrue(Logic.xnor(false, false));
    }

    @Test
    public void imp_test() {
        assertTrue(Logic.imp(true, true));
        assertFalse(Logic.imp(true, false));
        assertTrue(Logic.imp(false, true));
        assertTrue(Logic.imp(false, false));
    }

    @Test
    public void inh_test() {
        assertFalse(Logic.inh(true, true));
        assertTrue(Logic.inh(true, false));
        assertFalse(Logic.inh(false, true));
        assertFalse(Logic.inh(false, false));
    }
}
