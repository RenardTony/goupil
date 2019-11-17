package util.utils;

public class TestClass {
    private TestSubClass subClass;

    public TestClass(String subClass) {
        this.subClass = new TestSubClass(subClass);
    }

    public TestSubClass getSubClass() {
        return subClass;
    }

    public static class TestSubClass {
        private TestField field;

        public TestSubClass(String field) {
            this.field = new TestField(field);
        }

        public TestField getField() {
            return field;
        }

        public static class TestField {
            private String value;

            public TestField(String value) {
                this.value = value;
            }

            public String getValue() {
                return value;
            }
        }
    }
}
