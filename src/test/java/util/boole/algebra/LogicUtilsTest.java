package util.boole.algebra;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class LogicUtilsTest {

    @Test
    public void yes_test() {
        assertTrue(LogicUtils.yes(true));
        assertFalse(LogicUtils.yes(false));
    }

    @Test
    public void not_test() {
        assertTrue(LogicUtils.not(false));
        assertFalse(LogicUtils.not(true));
    }

    @Test
    public void and_test() {
        assertTrue(LogicUtils.and(true, true));
        assertFalse(LogicUtils.and(true, false));
        assertFalse(LogicUtils.and(false, true));
        assertFalse(LogicUtils.and(false, false));
    }

    @Test
    public void nand_test() {
        assertFalse(LogicUtils.nand(true, true));
        assertTrue(LogicUtils.nand(true, false));
        assertTrue(LogicUtils.nand(false, true));
        assertTrue(LogicUtils.nand(false, false));
    }

    @Test
    public void or_test() {
        assertTrue(LogicUtils.or(true, true));
        assertTrue(LogicUtils.or(true, false));
        assertTrue(LogicUtils.or(false, true));
        assertFalse(LogicUtils.or(false, false));
    }

    @Test
    public void nor_test() {
        assertFalse(LogicUtils.nor(true, true));
        assertFalse(LogicUtils.nor(true, false));
        assertFalse(LogicUtils.nor(false, true));
        assertTrue(LogicUtils.nor(false, false));
    }

    @Test
    public void xor_test() {
        assertFalse(LogicUtils.xor(true, true));
        assertTrue(LogicUtils.xor(true, false));
        assertTrue(LogicUtils.xor(false, true));
        assertFalse(LogicUtils.xor(false, false));
    }

    @Test
    public void xnor_test() {
        assertTrue(LogicUtils.xnor(true, true));
        assertFalse(LogicUtils.xnor(true, false));
        assertFalse(LogicUtils.xnor(false, true));
        assertTrue(LogicUtils.xnor(false, false));
    }

    @Test
    public void imp_test() {
        assertTrue(LogicUtils.imp(true, true));
        assertFalse(LogicUtils.imp(true, false));
        assertTrue(LogicUtils.imp(false, true));
        assertTrue(LogicUtils.imp(false, false));
    }

    @Test
    public void inh_test() {
        assertFalse(LogicUtils.inh(true, true));
        assertTrue(LogicUtils.inh(true, false));
        assertFalse(LogicUtils.inh(false, true));
        assertFalse(LogicUtils.inh(false, false));
    }
}
