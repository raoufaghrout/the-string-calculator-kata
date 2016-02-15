package org.codekatas;

public class Splitter {

    protected String[] splitString(String string) {
        String delimiters = ",|\n";

        if (hasCustomDelimiter(string)) {
            delimiters = addCustomDelimiter(string, delimiters);
            string = removeCustomDelimiter(string);
        }

        return string.split(delimiters);
    }

    private boolean hasCustomDelimiter(String string) {
        return string.startsWith("//");
    }

    private String addCustomDelimiter(String string, String delimiters) {
        return delimiters + ("|" + getCustomDelimiter(string));
    }

    private String getCustomDelimiter(String string) {
        return string.substring(2, 3);
    }

    private String removeCustomDelimiter(String string) {
        return string.substring(4);
    }
}