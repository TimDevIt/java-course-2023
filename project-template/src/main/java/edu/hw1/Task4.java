package edu.hw1;

public final class Task4 {
    private Task4() {}

    public static String fixString(String wrongString) {
        try {
            if (wrongString.isEmpty()) {
                throw new NullPointerException("One of the arrays is null or empty.");
            }
            char[] charArray = wrongString.toCharArray();
            for (int i = 1; i < charArray.length; i += 2) {
                char tmpChar = charArray[i];
                charArray[i] = charArray[i - 1];
                charArray[i - 1] = tmpChar;
            }
            return new String(charArray);
        } catch (NullPointerException exception) {
            return "";
        }

    }
}
