package util.boole.algebra;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BooleTest {

    @Test
    public void is() {
        assertTrue(Boole.of(true).is());
        assertFalse(Boole.of(false).is());
    }

    @Test
    public void not() {
        assertFalse(Boole.of(true).not());
        assertTrue(Boole.of(false).not());
    }

    @Test
    public void and() {
        assertFalse(Boole.of(false).with(false).and());
        assertFalse(Boole.of(true).with(false).and());
        assertFalse(Boole.of(false).with(true).and());
        assertTrue(Boole.of(true).with(true).and());
    }

    @Test
    public void and_object() {
        assertFalse(Boole.of(null).falseIfNull().with(false).and());
        assertFalse(Boole.of(null).trueIfNull().with(false).and());
        assertFalse(Boole.of(false).with(null).trueIfNull().and());
        assertFalse(Boole.of(true).with(null).falseIfNull().and());
        assertTrue(Boole.of(null).trueIfNull().with(null).trueIfNull().and());
    }

    @Test
    public void nand() {
        assertTrue(Boole.of(false).with(false).nand());
        assertTrue(Boole.of(true).with(false).nand());
        assertTrue(Boole.of(false).with(true).nand());
        assertFalse(Boole.of(true).with(true).nand());
    }

    @Test
    public void or() {
        assertFalse(Boole.of(false).with(false).or());
        assertTrue(Boole.of(true).with(false).or());
        assertTrue(Boole.of(false).with(true).or());
        assertTrue(Boole.of(true).with(true).or());
    }

    @Test
    public void nor() {
        assertTrue(Boole.of(false).with(false).nor());
        assertFalse(Boole.of(true).with(false).nor());
        assertFalse(Boole.of(false).with(true).nor());
        assertFalse(Boole.of(true).with(true).nor());
    }

    @Test
    public void xnor() {
        assertTrue(Boole.of(false).with(false).xnor());
        assertFalse(Boole.of(true).with(false).xnor());
        assertFalse(Boole.of(false).with(true).xnor());
        assertTrue(Boole.of(true).with(true).xnor());
    }

    @Test
    public void xor() {
        assertFalse(Boole.of(false).with(false).xor());
        assertTrue(Boole.of(true).with(false).xor());
        assertTrue(Boole.of(false).with(true).xor());
        assertFalse(Boole.of(true).with(true).xor());
    }

    @Test
    public void imp() {
        assertTrue(Boole.of(false).with(false).imp());
        assertFalse(Boole.of(true).with(false).imp());
        assertTrue(Boole.of(false).with(true).imp());
        assertTrue(Boole.of(true).with(true).imp());
    }

    @Test
    public void inh() {
        assertFalse(Boole.of(false).with(false).inh());
        assertTrue(Boole.of(true).with(false).inh());
        assertFalse(Boole.of(false).with(true).inh());
        assertFalse(Boole.of(true).with(true).inh());
    }
}
