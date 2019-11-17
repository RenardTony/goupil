package util.check;

import org.junit.Test;
import util.utils.TestClass;

import static org.junit.Assert.assertEquals;

public class GetTest {

    @Test
    public void or() {
        TestClass testClass = new TestClass("Test");
        assertEquals("Test", Get.or(testClass, "Hello", TestClass::getSubClass, TestClass.TestSubClass::getField, TestClass.TestSubClass.TestField::getValue));
    }

    @Test
    public void it() {
        TestClass testClass = new TestClass("Test");
        assertEquals("Test", Get.it(testClass, TestClass::getSubClass, TestClass.TestSubClass::getField, TestClass.TestSubClass.TestField::getValue));
    }
}