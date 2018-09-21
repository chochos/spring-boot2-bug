package com.solab.lib;

public class SharedClass {

    private final String someValue;

    public SharedClass(String initialValue) {
        someValue = initialValue;
    }

    public String getSomeValue() {
        return someValue;
    }

    @Override
    public String toString() {
        return "SharedClass '" + someValue + "'";
    }
}
